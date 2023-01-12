package typings.postcssValuesParser

import typings.postcss.libNodeMod.NodeErrorOptions
import typings.postcss.libNodeMod.Source
import typings.postcss.libWarningMod.WarningOptions
import typings.postcss.mod.CssSyntaxError
import typings.postcss.mod.Result
import typings.postcssValuesParser.anon.Map
import typings.postcssValuesParser.postcssValuesParserStrings.atrule
import typings.postcssValuesParser.postcssValuesParserStrings.comment
import typings.postcssValuesParser.postcssValuesParserStrings.end
import typings.postcssValuesParser.postcssValuesParserStrings.func
import typings.postcssValuesParser.postcssValuesParserStrings.interpolation
import typings.postcssValuesParser.postcssValuesParserStrings.numeric
import typings.postcssValuesParser.postcssValuesParserStrings.operator
import typings.postcssValuesParser.postcssValuesParserStrings.punctuation
import typings.postcssValuesParser.postcssValuesParserStrings.quoted
import typings.postcssValuesParser.postcssValuesParserStrings.root
import typings.postcssValuesParser.postcssValuesParserStrings.start
import typings.postcssValuesParser.postcssValuesParserStrings.unicodeRange
import typings.postcssValuesParser.postcssValuesParserStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postcss-values-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeToString(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(css: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def parse(css: String, options: ParseOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  @JSImport("postcss-values-parser", "stringify")
  @js.native
  val stringify: Stringifier = js.native
  
  @js.native
  trait AtWord
    extends StObject
       with ContainerBase
       with ChildNode {
    
    var name: String = js.native
    
    var params: String = js.native
    
    var parent: Container = js.native
    
    var `type`: atrule = js.native
  }
  
  type Builder = js.Function3[
    /* part */ String, 
    /* node */ js.UndefOr[Node], 
    /* type */ js.UndefOr[start | end], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcssValuesParser.mod.AtWord
    - typings.postcssValuesParser.mod.Comment
    - typings.postcssValuesParser.mod.Func
    - typings.postcssValuesParser.mod.Interpolation
    - typings.postcssValuesParser.mod.Numeric
    - typings.postcssValuesParser.mod.Operator
    - typings.postcssValuesParser.mod.Punctuation
    - typings.postcssValuesParser.mod.Quoted
    - typings.postcssValuesParser.mod.UnicodeRange
    - typings.postcssValuesParser.mod.Word
  */
  trait ChildNode
    extends StObject
       with Node
  
  @js.native
  trait Comment
    extends StObject
       with NodeBase
       with ChildNode {
    
    var `inline`: Boolean = js.native
    
    var parent: Container = js.native
    
    var text: String = js.native
    
    var `type`: comment = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcssValuesParser.mod.Root
    - typings.postcssValuesParser.mod.Func
    - typings.postcssValuesParser.mod.Interpolation
  */
  trait Container extends StObject
  
  @js.native
  trait ContainerBase
    extends StObject
       with NodeBase {
    
    def append(nodes: (ChildNode | js.Object | String)*): this.type = js.native
    
    def each(callback: js.Function2[/* node */ ChildNode, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def every(
      callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Any]
    ): Boolean = js.native
    def every(
      callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Any],
      thisArg: Any
    ): Boolean = js.native
    
    var first: js.UndefOr[ChildNode] = js.native
    
    def index(child: Double): Double = js.native
    def index(child: ChildNode): Double = js.native
    
    def insertAfter(oldNode: Double, newNode: String): this.type = js.native
    def insertAfter(oldNode: Double, newNode: js.Object): this.type = js.native
    def insertAfter(oldNode: Double, newNode: ChildNode): this.type = js.native
    def insertAfter(oldNode: ChildNode, newNode: String): this.type = js.native
    def insertAfter(oldNode: ChildNode, newNode: js.Object): this.type = js.native
    def insertAfter(oldNode: ChildNode, newNode: ChildNode): this.type = js.native
    
    def insertBefore(oldNode: Double, newNode: String): this.type = js.native
    def insertBefore(oldNode: Double, newNode: js.Object): this.type = js.native
    def insertBefore(oldNode: Double, newNode: ChildNode): this.type = js.native
    def insertBefore(oldNode: ChildNode, newNode: String): this.type = js.native
    def insertBefore(oldNode: ChildNode, newNode: js.Object): this.type = js.native
    def insertBefore(oldNode: ChildNode, newNode: ChildNode): this.type = js.native
    
    var last: js.UndefOr[ChildNode] = js.native
    
    // Inherited from postcss.ContainerBase, but with our Node type.
    var nodes: js.Array[ChildNode] = js.native
    
    def prepend(nodes: (ChildNode | js.Object | String)*): this.type = js.native
    
    def removeAll(): this.type = js.native
    
    def removeChild(child: Double): this.type = js.native
    def removeChild(child: ChildNode): this.type = js.native
    
    def some(
      callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Boolean]
    ): Boolean = js.native
    def some(
      callback: js.Function3[/* node */ ChildNode, /* index */ Double, /* nodes */ js.Array[ChildNode], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def walk(callback: js.Function2[/* node */ ChildNode, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkAtWords(callback: js.Function2[/* atWord */ AtWord, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkComments(callback: js.Function2[/* comment */ Comment, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkFuncs(callback: js.Function2[/* decl */ Func, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkInterpolations(callback: js.Function2[/* interpolation */ Interpolation, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkNumerics(callback: js.Function2[/* numeric */ Numeric, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkOperators(callback: js.Function2[/* operator */ Operator, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkPunctuations(callback: js.Function2[/* punctuation */ Punctuation, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkQuoteds(callback: js.Function2[/* quoted */ Quoted, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkType(`type`: String, callback: js.Function2[/* node */ ChildNode, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkUnicodeRanges(callback: js.Function2[/* unicodeRange */ UnicodeRange, /* index */ Double, Any]): Boolean | Unit = js.native
    
    def walkWords(callback: js.Function2[/* word */ Word, /* index */ Double, Any]): Boolean | Unit = js.native
  }
  
  @js.native
  trait Func
    extends StObject
       with ContainerBase
       with ChildNode
       with Container {
    
    var isColor: Boolean = js.native
    
    var isVar: Boolean = js.native
    
    var name: String = js.native
    
    var params: String = js.native
    
    var parent: Container = js.native
    
    var `type`: func = js.native
  }
  
  @js.native
  trait Interpolation
    extends StObject
       with ContainerBase
       with ChildNode
       with Container {
    
    var params: String = js.native
    
    var parent: Container = js.native
    
    var prefix: String = js.native
    
    var `type`: interpolation = js.native
  }
  
  trait InterpolationOptions extends StObject {
    
    var prefix: String
  }
  object InterpolationOptions {
    
    inline def apply(prefix: String): InterpolationOptions = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterpolationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcssValuesParser.mod.Root
    - typings.postcssValuesParser.mod.ChildNode
  */
  trait Node extends StObject
  
  @js.native
  trait NodeBase extends StObject {
    
    def after(newNode: String): this.type = js.native
    def after(newNode: js.Array[ChildNode]): this.type = js.native
    def after(newNode: js.Object): this.type = js.native
    def after(newNode: ChildNode): this.type = js.native
    
    def before(newNode: String): this.type = js.native
    def before(newNode: js.Array[ChildNode]): this.type = js.native
    def before(newNode: js.Object): this.type = js.native
    def before(newNode: ChildNode): this.type = js.native
    
    def clone(overrides: js.Object): this.type = js.native
    
    def cloneAfter(): this.type = js.native
    def cloneAfter(overrides: js.Object): this.type = js.native
    
    def cloneBefore(): this.type = js.native
    def cloneBefore(overrides: js.Object): this.type = js.native
    
    def error(message: String): CssSyntaxError = js.native
    def error(message: String, options: NodeErrorOptions): CssSyntaxError = js.native
    
    // Inherited from postcss.ContainerBase, but with our Node type.
    def next(): ChildNode | Unit = js.native
    
    def prev(): ChildNode | Unit = js.native
    
    def raw(prop: String): Any = js.native
    def raw(prop: String, defaultType: String): Any = js.native
    
    var raws: Any = js.native
    
    def remove(): this.type = js.native
    
    def replaceWith(nodes: (ChildNode | js.Object)*): this.type = js.native
    
    def root(): Root = js.native
    
    // Inherited from postcss.ContainerBase with no changes.
    var source: js.UndefOr[Source] = js.native
    
    def toString(stringifier: Stringifier): String = js.native
    def toString(stringifier: Syntax): String = js.native
    
    def warn(result: Result, text: String): Unit = js.native
    def warn(result: Result, text: String, opts: WarningOptions): Unit = js.native
  }
  
  @js.native
  trait Numeric
    extends StObject
       with NodeBase
       with ChildNode {
    
    var parent: Container = js.native
    
    var `type`: numeric = js.native
    
    var unit: String = js.native
    
    var value: String = js.native
  }
  
  @js.native
  trait Operator
    extends StObject
       with NodeBase
       with ChildNode {
    
    var parent: Container = js.native
    
    var `type`: operator = js.native
    
    var value: String = js.native
  }
  
  trait ParseOptions extends StObject {
    
    var ignoreUnknownWords: js.UndefOr[Boolean] = js.undefined
    
    var interpolation: js.UndefOr[Boolean | InterpolationOptions] = js.undefined
    
    var variables: js.UndefOr[VariablesOptions] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreUnknownWords(value: Boolean): Self = StObject.set(x, "ignoreUnknownWords", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownWordsUndefined: Self = StObject.set(x, "ignoreUnknownWords", js.undefined)
      
      inline def setInterpolation(value: Boolean | InterpolationOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setVariables(value: VariablesOptions): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  @js.native
  trait Punctuation
    extends StObject
       with NodeBase
       with ChildNode {
    
    var parent: Container = js.native
    
    var `type`: punctuation = js.native
    
    var value: String = js.native
  }
  
  @js.native
  trait Quoted
    extends StObject
       with NodeBase
       with ChildNode {
    
    var contents: String = js.native
    
    var parent: Container = js.native
    
    var quote: String = js.native
    
    var `type`: quoted = js.native
    
    var value: String = js.native
  }
  
  @js.native
  trait Root
    extends StObject
       with ContainerBase
       with Container
       with Node {
    
    var parent: Unit = js.native
    
    def toResult(): Result = js.native
    def toResult(options: Map): Result = js.native
    
    var `type`: root = js.native
  }
  
  type Stringifier = js.Function2[/* node */ Node, /* builder */ Builder, Unit]
  
  trait Syntax extends StObject {
    
    var stringify: js.UndefOr[Stringifier] = js.undefined
  }
  object Syntax {
    
    inline def apply(): Syntax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Syntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
      
      inline def setStringify(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringify", js.Any.fromFunction2(value))
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
  
  @js.native
  trait UnicodeRange
    extends StObject
       with NodeBase
       with ChildNode {
    
    var name: String = js.native
    
    var parent: Container = js.native
    
    var `type`: unicodeRange = js.native
  }
  
  trait VariablesOptions extends StObject {
    
    var prefixes: js.Array[String]
  }
  object VariablesOptions {
    
    inline def apply(prefixes: js.Array[String]): VariablesOptions = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariablesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariablesOptions] (val x: Self) extends AnyVal {
      
      inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
    }
  }
  
  @js.native
  trait Word
    extends StObject
       with NodeBase
       with ChildNode {
    
    var isColor: Boolean = js.native
    
    var isHex: Boolean = js.native
    
    var isUrl: Boolean = js.native
    
    var isVariable: Boolean = js.native
    
    var parent: Container = js.native
    
    var `type`: word = js.native
    
    var value: String = js.native
  }
}
