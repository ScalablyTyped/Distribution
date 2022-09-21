package typings.postcss

import typings.postcss.anon.PickWarningOptionswordind
import typings.postcss.anon.PickWarningOptionswordindEndIndex
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import typings.postcss.warningMod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("postcss/lib/node", JSImport.Default)
  @js.native
  /**
    * @param defaults Value for node properties.
    */
  abstract class default ()
    extends StObject
       with Node {
    def this(defaults: js.Object) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcss.atRuleMod.default
    - typings.postcss.ruleMod.default
    - typings.postcss.declarationMod.default
    - typings.postcss.commentMod.default
    - typings.postcss.rootMod.default
    - typings.postcss.documentMod.default
  */
  trait AnyNode extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcss.atRuleMod.default
    - typings.postcss.ruleMod.default
    - typings.postcss.declarationMod.default
    - typings.postcss.commentMod.default
  */
  trait ChildNode extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.postcss.atRuleMod.AtRuleProps
    - typings.postcss.ruleMod.RuleProps
    - typings.postcss.declarationMod.DeclarationProps
    - typings.postcss.commentMod.CommentProps
  */
  trait ChildProps extends StObject
  object ChildProps {
    
    inline def AtRuleProps(name: String): typings.postcss.atRuleMod.AtRuleProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.postcss.atRuleMod.AtRuleProps]
    }
    
    inline def CommentProps(text: String): typings.postcss.commentMod.CommentProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.postcss.commentMod.CommentProps]
    }
    
    inline def DeclarationProps(prop: String, value: String): typings.postcss.declarationMod.DeclarationProps = {
      val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.postcss.declarationMod.DeclarationProps]
    }
    
    inline def RuleProps(): typings.postcss.ruleMod.RuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.postcss.ruleMod.RuleProps]
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    def after(newNode: String): this.type = js.native
    def after(newNode: js.Array[Node]): this.type = js.native
    def after(newNode: ChildProps): this.type = js.native
    /**
      * Insert new node after current node to current node’s parent.
      *
      * Just alias for `node.parent.insertAfter(node, add)`.
      *
      * ```js
      * decl.after('color: black')
      * ```
      *
      * @param newNode New node.
      * @return This node for methods chain.
      */
    def after(newNode: Node): this.type = js.native
    
    /**
      * Assigns properties to the current node.
      *
      * ```js
      * decl.assign({ prop: 'word-wrap', value: 'break-word' })
      * ```
      *
      * @param overrides New properties to override the node.
      * @return Current node to methods chain.
      */
    def assign(overrides: js.Object): this.type = js.native
    
    def before(newNode: String): this.type = js.native
    def before(newNode: js.Array[Node]): this.type = js.native
    def before(newNode: ChildProps): this.type = js.native
    /**
      * Insert new node before current node to current node’s parent.
      *
      * Just alias for `node.parent.insertBefore(node, add)`.
      *
      * ```js
      * decl.before('content: ""')
      * ```
      *
      * @param newNode New node.
      * @return This node for methods chain.
      */
    def before(newNode: Node): this.type = js.native
    
    /**
      * Clear the code style properties for the node and its children.
      *
      * ```js
      * node.raws.before  //=> ' '
      * node.cleanRaws()
      * node.raws.before  //=> undefined
      * ```
      *
      * @param keepBetween Keep the `raws.between` symbols.
      */
    def cleanRaws(): Unit = js.native
    def cleanRaws(keepBetween: Boolean): Unit = js.native
    
    def clone(overrides: js.Object): this.type = js.native
    
    /**
      * Shortcut to clone the node and insert the resulting cloned node
      * after the current node.
      *
      * @param overrides New properties to override in the clone.
      * @return New node.
      */
    def cloneAfter(): this.type = js.native
    def cloneAfter(overrides: js.Object): this.type = js.native
    
    /**
      * Shortcut to clone the node and insert the resulting cloned node
      * before the current node.
      *
      * ```js
      * decl.cloneBefore({ prop: '-moz-' + decl.prop })
      * ```
      *
      * @param overrides Mew properties to override in the clone.
      *
      * @return New node
      */
    def cloneBefore(): this.type = js.native
    def cloneBefore(overrides: js.Object): this.type = js.native
    
    /**
      * Returns a `CssSyntaxError` instance containing the original position
      * of the node in the source, showing line and column numbers and also
      * a small excerpt to facilitate debugging.
      *
      * If present, an input source map will be used to get the original position
      * of the source, even from a previous compilation step
      * (e.g., from Sass compilation).
      *
      * This method produces very useful error messages.
      *
      * ```js
      * if (!variables[name]) {
      *   throw decl.error(`Unknown variable ${name}`, { word: name })
      *   // CssSyntaxError: postcss-vars:a.sass:4:3: Unknown variable $black
      *   //   color: $black
      *   // a
      *   //          ^
      *   //   background: white
      * }
      * ```
      *
      * @param message Error description.
      * @param opts    Options.
      *
      * @return Error object to throw it.
      */
    def error(message: String): typings.postcss.cssSyntaxErrorMod.default = js.native
    def error(message: String, options: NodeErrorOptions): typings.postcss.cssSyntaxErrorMod.default = js.native
    
    /**
      * Returns the next child of the node’s parent.
      * Returns `undefined` if the current node is the last child.
      *
      * ```js
      * if (comment.text === 'delete next') {
      *   const next = comment.next()
      *   if (next) {
      *     next.remove()
      *   }
      * }
      * ```
      *
      * @return Next node.
      */
    def next(): js.UndefOr[ChildNode] = js.native
    
    /**
      * The node’s parent node.
      *
      * ```js
      * root.nodes[0].parent === root
      * ```
      */
    var parent: js.UndefOr[
        typings.postcss.documentMod.default | typings.postcss.containerMod.default[ChildNode]
      ] = js.native
    
    /**
      * Get the position for a word or an index inside the node.
      *
      * @param opts Options.
      * @return Position.
      */
    def positionBy(): Position = js.native
    def positionBy(opts: PickWarningOptionswordind): Position = js.native
    
    /**
      * Convert string index to line/column.
      *
      * @param index The symbol number in the node’s string.
      * @return Symbol position in file.
      */
    def positionInside(index: Double): Position = js.native
    
    /**
      * Returns the previous child of the node’s parent.
      * Returns `undefined` if the current node is the first child.
      *
      * ```js
      * const annotation = decl.prev()
      * if (annotation.type === 'comment') {
      *   readAnnotation(annotation.text)
      * }
      * ```
      *
      * @return Previous node.
      */
    def prev(): js.UndefOr[ChildNode] = js.native
    
    /**
      * Get the range for a word or start and end index inside the node.
      * The start index is inclusive; the end index is exclusive.
      *
      * @param opts Options.
      * @return Range.
      */
    def rangeBy(): Range = js.native
    def rangeBy(opts: PickWarningOptionswordindEndIndex): Range = js.native
    
    /**
      * Returns a `Node#raws` value. If the node is missing
      * the code style property (because the node was manually built or cloned),
      * PostCSS will try to autodetect the code style property by looking
      * at other nodes in the tree.
      *
      * ```js
      * const root = postcss.parse('a { background: white }')
      * root.nodes[0].append({ prop: 'color', value: 'black' })
      * root.nodes[0].nodes[1].raws.before   //=> undefined
      * root.nodes[0].nodes[1].raw('before') //=> ' '
      * ```
      *
      * @param prop        Name of code style property.
      * @param defaultType Name of default value, it can be missed
      *                    if the value is the same as prop.
      * @return {string} Code style value.
      */
    def raw(prop: String): String = js.native
    def raw(prop: String, defaultType: String): String = js.native
    
    /**
      * Information to generate byte-to-byte equal node string as it was
      * in the origin input.
      *
      * Every parser saves its own properties,
      * but the default CSS parser uses:
      *
      * * `before`: the space symbols before the node. It also stores `*`
      *   and `_` symbols before the declaration (IE hack).
      * * `after`: the space symbols after the last child of the node
      *   to the end of the node.
      * * `between`: the symbols between the property and value
      *   for declarations, selector and `{` for rules, or last parameter
      *   and `{` for at-rules.
      * * `semicolon`: contains true if the last child has
      *   an (optional) semicolon.
      * * `afterName`: the space between the at-rule name and its parameters.
      * * `left`: the space symbols between `/ *` and the comment’s text.
      * * `right`: the space symbols between the comment’s text
      *   and <code>*&#47;</code>.
      * * `important`: the content of the important statement,
      *   if it is not just `!important`.
      *
      * PostCSS cleans selectors, declaration values and at-rule parameters
      * from comments and extra spaces, but it stores origin content in raws
      * properties. As such, if you don’t change a declaration’s value,
      * PostCSS will use the raw value with comments.
      *
      * ```js
      * const root = postcss.parse('a {\n  color:black\n}')
      * root.first.first.raws //=> { before: '\n  ', between: ':' }
      * ```
      */
    var raws: Any = js.native
    
    /**
      * Removes the node from its parent and cleans the parent properties
      * from the node and its children.
      *
      * ```js
      * if (decl.prop.match(/^-webkit-/)) {
      *   decl.remove()
      * }
      * ```
      *
      * @return Node to make calls chain.
      */
    def remove(): this.type = js.native
    
    /**
      * Inserts node(s) before the current node and removes the current node.
      *
      * ```js
      * AtRule: {
      *   mixin: atrule => {
      *     atrule.replaceWith(mixinRules[atrule.params])
      *   }
      * }
      * ```
      *
      * @param nodes Mode(s) to replace current one.
      * @return Current node to methods chain.
      */
    def replaceWith(nodes: (ChildNode | ChildProps | (js.Array[ChildNode | ChildProps]))*): this.type = js.native
    
    /**
      * Finds the Root instance of the node’s tree.
      *
      * ```js
      * root.nodes[0].nodes[0].root() === root
      * ```
      *
      * @return Root parent.
      */
    def root(): typings.postcss.rootMod.default = js.native
    
    /**
      * The input source of the node.
      *
      * The property is used in source map generation.
      *
      * If you create a node manually (e.g., with `postcss.decl()`),
      * that node will not have a `source` property and will be absent
      * from the source map. For this reason, the plugin developer should
      * consider cloning nodes to create new ones (in which case the new node’s
      * source will reference the original, cloned node) or setting
      * the `source` property manually.
      *
      * ```js
      * decl.source.input.from //=> '/home/ai/a.sass'
      * decl.source.start      //=> { line: 10, column: 2 }
      * decl.source.end        //=> { line: 10, column: 12 }
      * ```
      *
      * ```js
      * // Bad
      * const prefixed = postcss.decl({
      *   prop: '-moz-' + decl.prop,
      *   value: decl.value
      * })
      *
      * // Good
      * const prefixed = decl.clone({ prop: '-moz-' + decl.prop })
      * ```
      *
      * ```js
      * if (atrule.name === 'add-link') {
      *   const rule = postcss.rule({ selector: 'a', source: atrule.source })
      *   atrule.parent.insertBefore(atrule, rule)
      * }
      * ```
      */
    var source: js.UndefOr[Source] = js.native
    
    /**
      * Fix circular links on `JSON.stringify()`.
      *
      * @return Cleaned object.
      */
    def toJSON(): js.Object = js.native
    
    def toString(stringifier: Stringifier): String = js.native
    def toString(stringifier: Syntax): String = js.native
    
    /**
      * tring representing the node’s type. Possible values are `root`, `atrule`,
      * `rule`, `decl`, or `comment`.
      *
      * ```js
      * new Declaration({ prop: 'color', value: 'black' }).type //=> 'decl'
      * ```
      */
    var `type`: String = js.native
    
    /**
      * This method is provided as a convenience wrapper for `Result#warn`.
      *
      * ```js
      *   Declaration: {
      *     bad: (decl, { result }) => {
      *       decl.warn(result, 'Deprecated property bad')
      *     }
      *   }
      * ```
      *
      * @param result The `Result` instance that will receive the warning.
      * @param text   Warning message.
      * @param opts   Warning Options.
      *
      * @return Created warning object.
      */
    def warn(result: typings.postcss.resultMod.default, text: String): typings.postcss.warningMod.default = js.native
    def warn(result: typings.postcss.resultMod.default, text: String, opts: WarningOptions): typings.postcss.warningMod.default = js.native
  }
  
  trait NodeErrorOptions extends StObject {
    
    /**
      * An ending index inside a node's string that should be highlighted as
      * source of error.
      */
    var endIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * An index inside a node's string that should be highlighted as source
      * of error.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Plugin name that created this error. PostCSS will set it automatically.
      */
    var plugin: js.UndefOr[String] = js.undefined
    
    /**
      * A word inside a node's string, that should be highlighted as source
      * of error.
      */
    var word: js.UndefOr[String] = js.undefined
  }
  object NodeErrorOptions {
    
    inline def apply(): NodeErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeErrorOptions]
    }
    
    extension [Self <: NodeErrorOptions](x: Self) {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  trait NodeProps extends StObject {
    
    var source: js.UndefOr[Source] = js.undefined
  }
  object NodeProps {
    
    inline def apply(): NodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeProps]
    }
    
    extension [Self <: NodeProps](x: Self) {
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    /**
      * Source line in file. In contrast to `offset` it starts from 1.
      */
    var column: Double
    
    /**
      * Source column in file.
      */
    var line: Double
    
    /**
      * Source offset in file. It starts from 0.
      */
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Range extends StObject {
    
    /**
      * End position, exclusive.
      */
    var end: Position
    
    /**
      * Start position, inclusive.
      */
    var start: Position
  }
  object Range {
    
    inline def apply(end: Position, start: Position): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source extends StObject {
    
    /**
      * The inclusive ending position of the node's source.
      */
    var end: js.UndefOr[Position] = js.undefined
    
    /**
      * The file source of the node.
      */
    var input: typings.postcss.inputMod.default
    
    /**
      * The inclusive starting position of the node’s source.
      */
    var start: js.UndefOr[Position] = js.undefined
  }
  object Source {
    
    inline def apply(input: typings.postcss.inputMod.default): Source = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setInput(value: typings.postcss.inputMod.default): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
