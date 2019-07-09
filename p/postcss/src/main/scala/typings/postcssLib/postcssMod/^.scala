package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Parses source CSS.
    * @param css The CSS to parse.
    * @param options
    * @returns {} A new Root node, which contains the source CSS nodes.
    */
  val parse: Parser = js.native
  /**
    * Default function to convert a node tree into a CSS string.
    */
  val stringify: Stringifier = js.native
  /**
    * @param plugins Can also be included with the Processor#use method.
    * @returns A processor that will apply plugins as CSS processors.
    */
  def apply(): Processor = js.native
  def apply(plugins: AcceptedPlugin*): Processor = js.native
  def apply(plugins: js.Array[AcceptedPlugin]): Processor = js.native
  /**
    * Creates a new AtRule node.
    * @param defaults Properties for the new AtRule node.
    * @returns The new node.
    */
  def atRule(): AtRule = js.native
  def atRule(defaults: AtRuleNewProps): AtRule = js.native
  /**
    * Creates a new Comment node.
    * @param defaults Properties for the new Comment node.
    * @returns The new node.
    */
  def comment(): Comment = js.native
  def comment(defaults: CommentNewProps): Comment = js.native
  /**
    * Creates a new Declaration node.
    * @param defaults Properties for the new Declaration node.
    * @returns The new node.
    */
  def decl(): Declaration = js.native
  def decl(defaults: DeclarationNewProps): Declaration = js.native
  /**
    * Creates a PostCSS plugin with a standard API.
    * @param name Plugin name. Same as in name property in package.json. It will
    * be saved in plugin.postcssPlugin property.
    * @param initializer Will receive plugin options and should return functions
    * to modify nodes in input CSS.
    */
  def plugin[T](name: java.lang.String, initializer: PluginInitializer[T]): Plugin[T] = js.native
  /**
    * Creates a new Root node.
    * @param defaults Properties for the new Root node.
    * @returns The new node.
    */
  def root(): Root = js.native
  def root(defaults: js.Object): Root = js.native
  /**
    * Creates a new Rule node.
    * @param defaults Properties for the new Rule node.
    * @returns The new node.
    */
  def rule(): Rule = js.native
  def rule(defaults: RuleNewProps): Rule = js.native
}

