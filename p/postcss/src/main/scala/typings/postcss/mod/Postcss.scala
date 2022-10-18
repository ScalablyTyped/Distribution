package typings.postcss.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.libAtRuleMod.AtRuleProps
import typings.postcss.libCommentMod.CommentProps
import typings.postcss.libCssSyntaxErrorMod.RangePosition
import typings.postcss.libDeclarationMod.DeclarationProps
import typings.postcss.libDocumentMod.DocumentProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libResultMod.ResultOptions
import typings.postcss.libRootMod.RootProps
import typings.postcss.libRuleMod.RuleProps
import typings.postcss.libWarningMod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postcss extends StObject {
  
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
  def apply(): typings.postcss.libProcessorMod.default = js.native
  def apply(plugins: AcceptedPlugin*): typings.postcss.libProcessorMod.default = js.native
  def apply(plugins: js.Array[AcceptedPlugin]): typings.postcss.libProcessorMod.default = js.native
  
  var AtRule: Instantiable1[/* defaults */ js.UndefOr[AtRuleProps], typings.postcss.libAtRuleMod.default] = js.native
  
  var Comment: Instantiable1[/* defaults */ js.UndefOr[CommentProps], typings.postcss.libCommentMod.default] = js.native
  
  var Container: Instantiable0[typings.postcss.libContainerMod.default[typings.postcss.libNodeMod.default]] = js.native
  
  var CssSyntaxError: Instantiable6[
    /* message */ String, 
    /* lineOrStartPos */ js.UndefOr[Double | RangePosition], 
    /* columnOrEndPos */ js.UndefOr[Double | RangePosition], 
    /* source */ js.UndefOr[String], 
    /* file */ js.UndefOr[String], 
    /* plugin */ js.UndefOr[String], 
    typings.postcss.libCssSyntaxErrorMod.default
  ] = js.native
  
  var Declaration: Instantiable1[
    /* defaults */ js.UndefOr[DeclarationProps], 
    typings.postcss.libDeclarationMod.default
  ] = js.native
  
  var Input: Instantiable2[
    /* css */ String, 
    /* opts */ js.UndefOr[ProcessOptions], 
    typings.postcss.libInputMod.default
  ] = js.native
  
  var Node: Instantiable1[/* defaults */ js.UndefOr[js.Object], typings.postcss.libNodeMod.default] = js.native
  
  var Result: Instantiable3[
    /* processor */ typings.postcss.libProcessorMod.default, 
    /* root */ Root_ | Document, 
    /* opts */ ResultOptions, 
    typings.postcss.libResultMod.default
  ] = js.native
  
  var Root: Instantiable1[/* defaults */ js.UndefOr[RootProps], typings.postcss.libRootMod.default] = js.native
  
  var Rule: Instantiable1[/* defaults */ js.UndefOr[RuleProps], typings.postcss.libRuleMod.default] = js.native
  
  var Warning: Instantiable2[
    /* text */ String, 
    /* opts */ js.UndefOr[WarningOptions], 
    typings.postcss.libWarningMod.default
  ] = js.native
  
  /**
    * Creates a new `AtRule` node.
    *
    * @param defaults Properties for the new node.
    * @return New at-rule node.
    */
  def atRule(): typings.postcss.libAtRuleMod.default = js.native
  def atRule(defaults: AtRuleProps): typings.postcss.libAtRuleMod.default = js.native
  
  /**
    * Creates a new `Comment` node.
    *
    * @param defaults Properties for the new node.
    * @return New comment node
    */
  def comment(): typings.postcss.libCommentMod.default = js.native
  def comment(defaults: CommentProps): typings.postcss.libCommentMod.default = js.native
  
  /**
    * Creates a new `Declaration` node.
    *
    * @param defaults Properties for the new node.
    * @return New declaration node.
    */
  def decl(): typings.postcss.libDeclarationMod.default = js.native
  def decl(defaults: DeclarationProps): typings.postcss.libDeclarationMod.default = js.native
  
  /**
    * Creates a new `Document` node.
    *
    * @param defaults Properties for the new node.
    * @return New document node.
    */
  def document(): typings.postcss.libDocumentMod.default = js.native
  def document(defaults: DocumentProps): typings.postcss.libDocumentMod.default = js.native
  
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  def fromJSON(data: js.Array[js.Object]): js.Array[typings.postcss.libNodeMod.default] = js.native
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  def fromJSON(data: js.Object): typings.postcss.libNodeMod.default = js.native
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  @JSName("fromJSON")
  var fromJSON_Original: JSONHydrator = js.native
  
  /**
    * Contains the `list` module.
    */
  var list: typings.postcss.libListMod.List = js.native
  
  /**
    * Parses source css and returns a new `Root` or `Document` node,
    * which contains the source CSS nodes.
    *
    * ```js
    * // Simple CSS concatenation with source map support
    * const root1 = postcss.parse(css1, { from: file1 })
    * const root2 = postcss.parse(css2, { from: file2 })
    * root1.append(root2).toResult().css
    * ```
    */
  def parse(css: String): typings.postcss.libRootMod.default = js.native
  def parse(css: String, opts: PickProcessOptionsmapfrom): typings.postcss.libRootMod.default = js.native
  def parse(css: ToString): typings.postcss.libRootMod.default = js.native
  def parse(css: ToString, opts: PickProcessOptionsmapfrom): typings.postcss.libRootMod.default = js.native
  /**
    * Parses source css and returns a new `Root` or `Document` node,
    * which contains the source CSS nodes.
    *
    * ```js
    * // Simple CSS concatenation with source map support
    * const root1 = postcss.parse(css1, { from: file1 })
    * const root2 = postcss.parse(css2, { from: file2 })
    * root1.append(root2).toResult().css
    * ```
    */
  @JSName("parse")
  var parse_Original: Parser[typings.postcss.libRootMod.default] = js.native
  
  /**
    * Creates a new `Root` node.
    *
    * @param defaults Properties for the new node.
    * @return New root node.
    */
  def root(): typings.postcss.libRootMod.default = js.native
  def root(defaults: RootProps): typings.postcss.libRootMod.default = js.native
  
  /**
    * Creates a new `Rule` node.
    *
    * @param default Properties for the new node.
    * @return New rule node.
    */
  def rule(): typings.postcss.libRuleMod.default = js.native
  def rule(defaults: RuleProps): typings.postcss.libRuleMod.default = js.native
  
  /**
    * Default function to convert a node tree into a CSS string.
    */
  def stringify(node: AnyNode, builder: Builder): Unit = js.native
  /**
    * Default function to convert a node tree into a CSS string.
    */
  @JSName("stringify")
  var stringify_Original: Stringifier = js.native
}
