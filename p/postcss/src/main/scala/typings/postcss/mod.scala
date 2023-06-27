package typings.postcss

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.libAtRuleMod.AtRuleProps
import typings.postcss.libCommentMod.CommentProps
import typings.postcss.libCssSyntaxErrorMod.RangePosition
import typings.postcss.libDeclarationMod.DeclarationProps
import typings.postcss.libDocumentMod.DocumentProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libProcessorMod.default
import typings.postcss.libResultMod.ResultOptions
import typings.postcss.libRootMod.RootProps
import typings.postcss.libRuleMod.RuleProps
import typings.postcss.libWarningMod.WarningOptions
import typings.postcss.postcssBooleans.`true`
import typings.postcss.postcssStrings.end
import typings.postcss.postcssStrings.start
import typings.sourceMapJs.mod.RawSourceMap
import typings.sourceMapJs.mod.SourceMapGenerator
import typings.std.Comment
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new `Processor` instance that will apply `plugins`
    * as CSS processors.
    *
    * ```js
    * let postcss = require('postcss')
    *
    * postcss(plugins).process(css, { from, to }).then(result => {
    *   console.log(result.css)
    * })
    * ```
    *
    * @param plugins PostCSS plugins.
    * @return Processor to process multiple CSS.
    */
  inline def apply(): default = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[default]
  inline def apply(plugins: AcceptedPlugin*): default = ^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[default]
  inline def apply(plugins: js.Array[AcceptedPlugin]): default = ^.asInstanceOf[js.Dynamic].apply(plugins.asInstanceOf[js.Any]).asInstanceOf[default]
  
  @JSImport("postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents an at-rule.
    *
    * ```js
    * Once (root, { AtRule }) {
    *   let media = new AtRule({ name: 'media', params: 'print' })
    *   media.append(…)
    *   root.append(media)
    * }
    * ```
    *
    * If it’s followed in the CSS by a `{}` block, this node will have
    * a nodes property representing its children.
    *
    * ```js
    * const root = postcss.parse('@charset "UTF-8"; @media print {}')
    *
    * const charset = root.first
    * charset.type  //=> 'atrule'
    * charset.nodes //=> undefined
    *
    * const media = root.last
    * media.nodes   //=> []
    * ```
    */
  @JSImport("postcss", "AtRule")
  @js.native
  open class AtRule_ ()
    extends typings.postcss.libAtRuleMod.default {
    def this(defaults: AtRuleProps) = this()
  }
  
  /**
    * Represents a comment between declarations or statements (rule and at-rules).
    *
    * ```js
    * Once (root, { Comment }) {
    *   let note = new Comment({ text: 'Note: …' })
    *   root.append(note)
    * }
    * ```
    *
    * Comments inside selectors, at-rule parameters, or declaration values
    * will be stored in the `raws` properties explained above.
    */
  @JSImport("postcss", "Comment")
  @js.native
  open class Comment_ ()
    extends typings.postcss.libCommentMod.default {
    def this(defaults: CommentProps) = this()
  }
  
  /**
    * The `Root`, `AtRule`, and `Rule` container nodes
    * inherit some common methods to help work with their children.
    *
    * Note that all containers can store any content. If you write a rule inside
    * a rule, PostCSS will parse it.
    */
  /* note: abstract class */ @JSImport("postcss", "Container")
  @js.native
  open class Container[Child /* <: typings.std.Node */] ()
    extends typings.postcss.libContainerMod.default[Child]
  
  /**
    * The CSS parser throws this error for broken CSS.
    *
    * Custom parsers can throw this error for broken custom syntax using
    * the `Node#error` method.
    *
    * PostCSS will use the input source map to detect the original error location.
    * If you wrote a Sass file, compiled it to CSS and then parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file.
    *
    * If you need the position in the PostCSS input
    * (e.g., to debug the previous compiler), use `error.input.file`.
    *
    * ```js
    * // Raising error from plugin
    * throw node.error('Unknown variable', { plugin: 'postcss-vars' })
    * ```
    *
    * ```js
    * // Catching and checking syntax error
    * try {
    *   postcss.parse('a{')
    * } catch (error) {
    *   if (error.name === 'CssSyntaxError') {
    *     error //=> CssSyntaxError
    *   }
    * }
    * ```
    */
  @JSImport("postcss", "CssSyntaxError")
  @js.native
  open class CssSyntaxError protected ()
    extends typings.postcss.libCssSyntaxErrorMod.default {
    /**
      * Instantiates a CSS syntax error. Can be instantiated for a single position
      * or for a range.
      * @param message        Error message.
      * @param lineOrStartPos If for a single position, the line number, or if for
      *                       a range, the inclusive start position of the error.
      * @param columnOrEndPos If for a single position, the column number, or if for
      *                       a range, the exclusive end position of the error.
      * @param source         Source code of the broken file.
      * @param file           Absolute path to the broken file.
      * @param plugin         PostCSS plugin name, if error came from plugin.
      */
    def this(
      message: String,
      lineOrStartPos: js.UndefOr[Double | RangePosition],
      columnOrEndPos: js.UndefOr[Double | RangePosition],
      source: js.UndefOr[String],
      file: js.UndefOr[String],
      plugin: js.UndefOr[String]
    ) = this()
  }
  
  /**
    * Represents a CSS declaration.
    *
    * ```js
    * Once (root, { Declaration }) {
    *   let color = new Declaration({ prop: 'color', value: 'black' })
    *   root.append(color)
    * }
    * ```
    *
    * ```js
    * const root = postcss.parse('a { color: black }')
    * const decl = root.first.first
    * decl.type       //=> 'decl'
    * decl.toString() //=> ' color: black'
    * ```
    */
  @JSImport("postcss", "Declaration")
  @js.native
  open class Declaration ()
    extends typings.postcss.libDeclarationMod.default {
    def this(defaults: DeclarationProps) = this()
  }
  
  /**
    * Represents a file and contains all its parsed nodes.
    *
    * **Experimental:** some aspects of this node could change within minor
    * or patch version releases.
    *
    * ```js
    * const document = htmlParser(
    *   '<html><style>a{color:black}</style><style>b{z-index:2}</style>'
    * )
    * document.type         //=> 'document'
    * document.nodes.length //=> 2
    * ```
    */
  @JSImport("postcss", "Document")
  @js.native
  open class Document_ ()
    extends typings.postcss.libDocumentMod.default {
    def this(defaults: DocumentProps) = this()
  }
  
  /**
    * Represents the source CSS.
    *
    * ```js
    * const root  = postcss.parse(css, { from: file })
    * const input = root.source.input
    * ```
    */
  @JSImport("postcss", "Input")
  @js.native
  open class Input protected ()
    extends typings.postcss.libInputMod.default {
    /**
      * @param css  Input CSS source.
      * @param opts Process options.
      */
    def this(css: String) = this()
    def this(css: String, opts: ProcessOptions) = this()
  }
  
  /**
    * A Promise proxy for the result of PostCSS transformations.
    *
    * A `LazyResult` instance is returned by `Processor#process`.
    *
    * ```js
    * const lazy = postcss([autoprefixer]).process(css)
    * ```
    */
  @JSImport("postcss", "LazyResult")
  @js.native
  open class LazyResult protected ()
    extends typings.postcss.libLazyResultMod.default {
    /**
      * @param processor Processor used for this transformation.
      * @param css       CSS to parse and transform.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: default, css: String, opts: ResultOptions) = this()
  }
  
  // eslint-disable-next-line @typescript-eslint/no-shadow
  @JSImport("postcss", "Node")
  @js.native
  open class Node ()
    extends typings.postcss.libNodeMod.default
  
  /**
    * Contains plugins to process CSS. Create one `Processor` instance,
    * initialize its plugins, and then use that instance on numerous CSS files.
    *
    * ```js
    * const processor = postcss([autoprefixer, postcssNested])
    * processor.process(css1).then(result => console.log(result.css))
    * processor.process(css2).then(result => console.log(result.css))
    * ```
    */
  @JSImport("postcss", "Processor")
  @js.native
  /**
    * @param plugins PostCSS plugins
    */
  open class Processor () extends default {
    def this(plugins: js.Array[AcceptedPlugin]) = this()
  }
  
  /**
    * Provides the result of the PostCSS transformations.
    *
    * A Result instance is returned by `LazyResult#then`
    * or `Root#toResult` methods.
    *
    * ```js
    * postcss([autoprefixer]).process(css).then(result => {
    *  console.log(result.css)
    * })
    * ```
    *
    * ```js
    * const result2 = postcss.parse(css).toResult()
    * ```
    */
  @JSImport("postcss", "Result")
  @js.native
  open class Result protected ()
    extends typings.postcss.libResultMod.default {
    /**
      * @param processor Processor used for this transformation.
      * @param root      Root node after all transformations.
      * @param opts      Options from the `Processor#process` or `Root#toResult`.
      */
    def this(processor: default, root: Root_, opts: ResultOptions) = this()
    def this(processor: default, root: Document, opts: ResultOptions) = this()
  }
  
  /**
    * Represents a CSS file and contains all its parsed nodes.
    *
    * ```js
    * const root = postcss.parse('a{color:black} b{z-index:2}')
    * root.type         //=> 'root'
    * root.nodes.length //=> 2
    * ```
    */
  @JSImport("postcss", "Root")
  @js.native
  open class Root_ ()
    extends typings.postcss.libRootMod.default {
    def this(defaults: RootProps) = this()
  }
  
  /**
    * Represents a CSS rule: a selector followed by a declaration block.
    *
    * ```js
    * Once (root, { Rule }) {
    *   let a = new Rule({ selector: 'a' })
    *   a.append(…)
    *   root.append(a)
    * }
    * ```
    *
    * ```js
    * const root = postcss.parse('a{}')
    * const rule = root.first
    * rule.type       //=> 'rule'
    * rule.toString() //=> 'a{}'
    * ```
    */
  @JSImport("postcss", "Rule")
  @js.native
  open class Rule_ ()
    extends typings.postcss.libRuleMod.default {
    def this(defaults: RuleProps) = this()
  }
  
  /**
    * Represents a plugin’s warning. It can be created using `Node#warn`.
    *
    * ```js
    * if (decl.important) {
    *   decl.warn(result, 'Avoid !important', { word: '!important' })
    * }
    * ```
    */
  @JSImport("postcss", "Warning")
  @js.native
  open class Warning protected ()
    extends typings.postcss.libWarningMod.default {
    /**
      * @param text Warning message.
      * @param opts Warning options.
      */
    def this(text: String) = this()
    def this(text: String, opts: WarningOptions) = this()
  }
  
  inline def atRule(): typings.postcss.libAtRuleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("atRule")().asInstanceOf[typings.postcss.libAtRuleMod.default]
  inline def atRule(defaults: AtRuleProps): typings.postcss.libAtRuleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("atRule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libAtRuleMod.default]
  
  inline def comment(): typings.postcss.libCommentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("comment")().asInstanceOf[typings.postcss.libCommentMod.default]
  inline def comment(defaults: CommentProps): typings.postcss.libCommentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("comment")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libCommentMod.default]
  
  inline def decl(): typings.postcss.libDeclarationMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("decl")().asInstanceOf[typings.postcss.libDeclarationMod.default]
  inline def decl(defaults: DeclarationProps): typings.postcss.libDeclarationMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("decl")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libDeclarationMod.default]
  
  inline def document(): typings.postcss.libDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")().asInstanceOf[typings.postcss.libDocumentMod.default]
  inline def document(defaults: DocumentProps): typings.postcss.libDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libDocumentMod.default]
  
  @JSImport("postcss", "fromJSON")
  @js.native
  def fromJSON: JSONHydrator = js.native
  inline def fromJSON_=(x: JSONHydrator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(x.asInstanceOf[js.Any])
  
  @JSImport("postcss", "list")
  @js.native
  val list: typings.postcss.libListMod.List = js.native
  
  @JSImport("postcss", "parse")
  @js.native
  def parse: Parser[typings.postcss.libRootMod.default] = js.native
  inline def parse_=(x: Parser[typings.postcss.libRootMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  inline def root(): typings.postcss.libRootMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[typings.postcss.libRootMod.default]
  inline def root(defaults: RootProps): typings.postcss.libRootMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libRootMod.default]
  
  inline def rule(): typings.postcss.libRuleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("rule")().asInstanceOf[typings.postcss.libRuleMod.default]
  inline def rule(defaults: RuleProps): typings.postcss.libRuleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("rule")(defaults.asInstanceOf[js.Any]).asInstanceOf[typings.postcss.libRuleMod.default]
  
  @JSImport("postcss", "stringify")
  @js.native
  def stringify: Stringifier = js.native
  inline def stringify_=(x: Stringifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcss.mod.Plugin
    - typings.postcss.mod.PluginCreator[scala.Any]
    - typings.postcss.mod.OldPlugin[scala.Any]
    - typings.postcss.mod.TransformCallback
    - typings.postcss.anon.Postcss
    - typings.postcss.libProcessorMod.default
  */
  type AcceptedPlugin = _AcceptedPlugin | PluginCreator[Any] | OldPlugin[Any] | TransformCallback
  
  type AtRuleProcessor = js.Function2[
    /* atRule */ typings.postcss.libAtRuleMod.default, 
    /* helper */ Helpers, 
    js.Promise[Unit] | Unit
  ]
  
  type Builder = js.Function3[
    /* part */ String, 
    /* node */ js.UndefOr[AnyNode], 
    /* type */ js.UndefOr[start | end], 
    Unit
  ]
  
  type CommentProcessor = js.Function2[/* comment */ Comment, /* helper */ Helpers, js.Promise[Unit] | Unit]
  
  type DeclarationProcessor = js.Function2[
    /* decl */ typings.postcss.libDeclarationMod.default, 
    /* helper */ Helpers, 
    js.Promise[Unit] | Unit
  ]
  
  type DocumentProcessor = js.Function2[/* document */ Document, /* helper */ Helpers, js.Promise[Unit] | Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof postcss * / any */ trait Helpers extends StObject {
    
    var postcss: Postcss
    
    var result: typings.postcss.libResultMod.default
  }
  object Helpers {
    
    inline def apply(postcss: Postcss, result: typings.postcss.libResultMod.default): Helpers = {
      val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Helpers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Helpers] (val x: Self) extends AnyVal {
      
      inline def setPostcss(value: Postcss): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
      
      inline def setResult(value: typings.postcss.libResultMod.default): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONHydrator extends StObject {
    
    def apply(data: js.Array[js.Object]): js.Array[typings.postcss.libNodeMod.default] = js.native
    def apply(data: js.Object): typings.postcss.libNodeMod.default = js.native
  }
  
  @js.native
  trait OldPlugin[T] extends Transformer {
    
    def apply(): Transformer = js.native
    def apply(opts: T): Transformer = js.native
    
    var postcss: Transformer = js.native
  }
  
  type Parser[RootNode] = js.Function2[
    /* css */ String | ToString, 
    /* opts */ js.UndefOr[PickProcessOptionsmapfrom], 
    RootNode
  ]
  
  trait Plugin
    extends StObject
       with Processors
       with _AcceptedPlugin {
    
    var postcssPlugin: String
    
    var prepare: js.UndefOr[js.Function1[/* result */ typings.postcss.libResultMod.default, Processors]] = js.undefined
  }
  object Plugin {
    
    inline def apply(postcssPlugin: String): Plugin = {
      val __obj = js.Dynamic.literal(postcssPlugin = postcssPlugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      inline def setPostcssPlugin(value: String): Self = StObject.set(x, "postcssPlugin", value.asInstanceOf[js.Any])
      
      inline def setPrepare(value: /* result */ typings.postcss.libResultMod.default => Processors): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
      
      inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    }
  }
  
  @js.native
  trait PluginCreator[PluginOptions] extends StObject {
    
    def apply(): Plugin | default = js.native
    def apply(opts: PluginOptions): Plugin | default = js.native
    
    var postcss: `true` = js.native
  }
  
  type Postcss = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof postcss */ Any
  
  trait ProcessOptions extends StObject {
    
    /**
      * The path of the CSS source file. You should always set `from`,
      * because it is used in source map generation and syntax error messages.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * Source map options
      */
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
    
    /**
      * Function to generate AST by string.
      */
    var parser: js.UndefOr[
        Syntax | (Parser[typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default])
      ] = js.undefined
    
    /**
      * Class to generate string by AST.
      */
    var stringifier: js.UndefOr[Syntax | Stringifier] = js.undefined
    
    /**
      * Object with parse and stringify.
      */
    var syntax: js.UndefOr[Syntax] = js.undefined
    
    /**
      * The path where you'll put the output CSS file. You should always set `to`
      * to generate correct source maps.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object ProcessOptions {
    
    inline def apply(): ProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setParser(
        value: Syntax | (Parser[typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default])
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction2(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setStringifier(value: Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Processors extends StObject {
    
    /**
      * Will be called on all`AtRule` nodes.
      *
      * Will be called again on node or children changes.
      */
    var AtRule: js.UndefOr[AtRuleProcessor | StringDictionary[AtRuleProcessor]] = js.undefined
    
    /**
      * Will be called on all `AtRule` nodes, when all children will be processed.
      *
      * Will be called again on node or children changes.
      */
    var AtRuleExit: js.UndefOr[AtRuleProcessor | StringDictionary[AtRuleProcessor]] = js.undefined
    
    /**
      * Will be called on all `Comment` nodes.
      *
      * Will be called again on node or children changes.
      */
    var Comment: js.UndefOr[CommentProcessor] = js.undefined
    
    /**
      * Will be called on all `Comment` nodes after listeners
      * for `Comment` event.
      *
      * Will be called again on node or children changes.
      */
    var CommentExit: js.UndefOr[CommentProcessor] = js.undefined
    
    /**
      * Will be called on all `Declaration` nodes after listeners
      * for `Declaration` event.
      *
      * Will be called again on node or children changes.
      */
    var Declaration: js.UndefOr[DeclarationProcessor | StringDictionary[DeclarationProcessor]] = js.undefined
    
    /**
      * Will be called on all `Declaration` nodes.
      *
      * Will be called again on node or children changes.
      */
    var DeclarationExit: js.UndefOr[DeclarationProcessor | StringDictionary[DeclarationProcessor]] = js.undefined
    
    /**
      * Will be called on `Document` node.
      *
      * Will be called again on children changes.
      */
    var Document: js.UndefOr[DocumentProcessor] = js.undefined
    
    /**
      * Will be called on `Document` node, when all children will be processed.
      *
      * Will be called again on children changes.
      */
    var DocumentExit: js.UndefOr[DocumentProcessor] = js.undefined
    
    /**
      * Will be called on `Root` node once.
      */
    var Once: js.UndefOr[RootProcessor] = js.undefined
    
    /**
      * Will be called on `Root` node once, when all children will be processed.
      */
    var OnceExit: js.UndefOr[RootProcessor] = js.undefined
    
    /**
      * Will be called on `Root` node.
      *
      * Will be called again on children changes.
      */
    var Root: js.UndefOr[RootProcessor] = js.undefined
    
    /**
      * Will be called on `Root` node, when all children will be processed.
      *
      * Will be called again on children changes.
      */
    var RootExit: js.UndefOr[RootProcessor] = js.undefined
    
    /**
      * Will be called on all `Rule` nodes.
      *
      * Will be called again on node or children changes.
      */
    var Rule: js.UndefOr[RuleProcessor] = js.undefined
    
    /**
      * Will be called on all `Rule` nodes, when all children will be processed.
      *
      * Will be called again on node or children changes.
      */
    var RuleExit: js.UndefOr[RuleProcessor] = js.undefined
  }
  object Processors {
    
    inline def apply(): Processors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Processors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Processors] (val x: Self) extends AnyVal {
      
      inline def setAtRule(value: AtRuleProcessor | StringDictionary[AtRuleProcessor]): Self = StObject.set(x, "AtRule", value.asInstanceOf[js.Any])
      
      inline def setAtRuleExit(value: AtRuleProcessor | StringDictionary[AtRuleProcessor]): Self = StObject.set(x, "AtRuleExit", value.asInstanceOf[js.Any])
      
      inline def setAtRuleExitFunction2(
        value: (/* atRule */ typings.postcss.libAtRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "AtRuleExit", js.Any.fromFunction2(value))
      
      inline def setAtRuleExitUndefined: Self = StObject.set(x, "AtRuleExit", js.undefined)
      
      inline def setAtRuleFunction2(
        value: (/* atRule */ typings.postcss.libAtRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "AtRule", js.Any.fromFunction2(value))
      
      inline def setAtRuleUndefined: Self = StObject.set(x, "AtRule", js.undefined)
      
      inline def setComment(value: (/* comment */ Comment, /* helper */ Helpers) => js.Promise[Unit] | Unit): Self = StObject.set(x, "Comment", js.Any.fromFunction2(value))
      
      inline def setCommentExit(value: (/* comment */ Comment, /* helper */ Helpers) => js.Promise[Unit] | Unit): Self = StObject.set(x, "CommentExit", js.Any.fromFunction2(value))
      
      inline def setCommentExitUndefined: Self = StObject.set(x, "CommentExit", js.undefined)
      
      inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
      
      inline def setDeclaration(value: DeclarationProcessor | StringDictionary[DeclarationProcessor]): Self = StObject.set(x, "Declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationExit(value: DeclarationProcessor | StringDictionary[DeclarationProcessor]): Self = StObject.set(x, "DeclarationExit", value.asInstanceOf[js.Any])
      
      inline def setDeclarationExitFunction2(
        value: (/* decl */ typings.postcss.libDeclarationMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "DeclarationExit", js.Any.fromFunction2(value))
      
      inline def setDeclarationExitUndefined: Self = StObject.set(x, "DeclarationExit", js.undefined)
      
      inline def setDeclarationFunction2(
        value: (/* decl */ typings.postcss.libDeclarationMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "Declaration", js.Any.fromFunction2(value))
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "Declaration", js.undefined)
      
      inline def setDocument(value: (/* document */ Document, /* helper */ Helpers) => js.Promise[Unit] | Unit): Self = StObject.set(x, "Document", js.Any.fromFunction2(value))
      
      inline def setDocumentExit(value: (/* document */ Document, /* helper */ Helpers) => js.Promise[Unit] | Unit): Self = StObject.set(x, "DocumentExit", js.Any.fromFunction2(value))
      
      inline def setDocumentExitUndefined: Self = StObject.set(x, "DocumentExit", js.undefined)
      
      inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
      
      inline def setOnce(
        value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "Once", js.Any.fromFunction2(value))
      
      inline def setOnceExit(
        value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "OnceExit", js.Any.fromFunction2(value))
      
      inline def setOnceExitUndefined: Self = StObject.set(x, "OnceExit", js.undefined)
      
      inline def setOnceUndefined: Self = StObject.set(x, "Once", js.undefined)
      
      inline def setRoot(
        value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "Root", js.Any.fromFunction2(value))
      
      inline def setRootExit(
        value: (/* root */ typings.postcss.libRootMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "RootExit", js.Any.fromFunction2(value))
      
      inline def setRootExitUndefined: Self = StObject.set(x, "RootExit", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setRule(
        value: (/* rule */ typings.postcss.libRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "Rule", js.Any.fromFunction2(value))
      
      inline def setRuleExit(
        value: (/* rule */ typings.postcss.libRuleMod.default, /* helper */ Helpers) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "RuleExit", js.Any.fromFunction2(value))
      
      inline def setRuleExitUndefined: Self = StObject.set(x, "RuleExit", js.undefined)
      
      inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
    }
  }
  
  type RootProcessor = js.Function2[
    /* root */ typings.postcss.libRootMod.default, 
    /* helper */ Helpers, 
    js.Promise[Unit] | Unit
  ]
  
  type RuleProcessor = js.Function2[
    /* rule */ typings.postcss.libRuleMod.default, 
    /* helper */ Helpers, 
    js.Promise[Unit] | Unit
  ]
  
  @js.native
  trait SourceMap extends SourceMapGenerator {
    
    def toJSON(): RawSourceMap = js.native
  }
  
  trait SourceMapOptions extends StObject {
    
    /**
      * Use absolute path in generated source map.
      */
    var absolute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that PostCSS should add annotation comments to the CSS.
      * By default, PostCSS will always add a comment with a path
      * to the source map. PostCSS will not add annotations to CSS files
      * that do not contain any comments.
      *
      * By default, PostCSS presumes that you want to save the source map as
      * `opts.to + '.map'` and will use this path in the annotation comment.
      * A different path can be set by providing a string value for annotation.
      *
      * If you have set `inline: true`, annotation cannot be disabled.
      */
    var annotation: js.UndefOr[
        String | Boolean | (js.Function2[/* file */ String, /* root */ typings.postcss.libRootMod.default, String])
      ] = js.undefined
    
    /**
      * Override `from` in map’s sources.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates that the source map should be embedded in the output CSS
      * as a Base64-encoded comment. By default, it is `true`.
      * But if all previous maps are external, not inline, PostCSS will not embed
      * the map even if you do not set this option.
      *
      * If you have an inline source map, the result.map property will be empty,
      * as the source map will be contained within the text of `result.css`.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Source map content from a previous processing step (e.g., Sass).
      *
      * PostCSS will try to read the previous source map
      * automatically (based on comments within the source CSS), but you can use
      * this option to identify it manually.
      *
      * If desired, you can omit the previous map with prev: `false`.
      */
    var prev: js.UndefOr[String | Boolean | js.Object | (js.Function1[/* file */ String, String])] = js.undefined
    
    /**
      * Indicates that PostCSS should set the origin content (e.g., Sass source)
      * of the source map. By default, it is true. But if all previous maps do not
      * contain sources content, PostCSS will also leave it out even if you
      * do not set this option.
      */
    var sourcesContent: js.UndefOr[Boolean] = js.undefined
  }
  object SourceMapOptions {
    
    inline def apply(): SourceMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
      
      inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
      
      inline def setAnnotation(
        value: String | Boolean | (js.Function2[/* file */ String, /* root */ typings.postcss.libRootMod.default, String])
      ): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationFunction2(value: (/* file */ String, /* root */ typings.postcss.libRootMod.default) => String): Self = StObject.set(x, "annotation", js.Any.fromFunction2(value))
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setPrev(value: String | Boolean | js.Object | (js.Function1[/* file */ String, String])): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevFunction1(value: /* file */ String => String): Self = StObject.set(x, "prev", js.Any.fromFunction1(value))
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setSourcesContent(value: Boolean): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    }
  }
  
  type Stringifier = js.Function2[/* node */ AnyNode, /* builder */ Builder, Unit]
  
  trait Syntax extends StObject {
    
    /**
      * Function to generate AST by string.
      */
    var parse: js.UndefOr[
        Parser[typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default]
      ] = js.undefined
    
    /**
      * Class to generate string by AST.
      */
    var stringify: js.UndefOr[Stringifier] = js.undefined
  }
  object Syntax {
    
    inline def apply(): Syntax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Syntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
      
      inline def setParse(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setStringify(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringify", js.Any.fromFunction2(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
  
  type TransformCallback = js.Function2[
    /* root */ typings.postcss.libRootMod.default, 
    /* result */ typings.postcss.libResultMod.default, 
    js.Promise[Unit] | Unit
  ]
  
  @js.native
  trait Transformer extends TransformCallback {
    
    var postcssPlugin: String = js.native
    
    var postcssVersion: String = js.native
  }
  
  trait _AcceptedPlugin extends StObject
}
