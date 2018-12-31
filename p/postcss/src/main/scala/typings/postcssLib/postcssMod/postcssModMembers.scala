package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", JSImport.Namespace)
@js.native
object postcssModMembers extends js.Object {
  def apply(): postcssLib.postcssMod.postcssNs.Processor = js.native
  def apply(plugins: postcssLib.postcssMod.postcssNs.AcceptedPlugin*): postcssLib.postcssMod.postcssNs.Processor = js.native
  def apply(plugins: js.Array[postcssLib.postcssMod.postcssNs.AcceptedPlugin]): postcssLib.postcssMod.postcssNs.Processor = js.native
  /**
    * Creates a new AtRule node.
    * @param defaults Properties for the new AtRule node.
    * @returns The new node.
    */
  def atRule(): postcssLib.postcssMod.postcssNs.AtRule = js.native
  def atRule(defaults: postcssLib.postcssMod.postcssNs.AtRuleNewProps): postcssLib.postcssMod.postcssNs.AtRule = js.native
  /**
    * Creates a new Comment node.
    * @param defaults Properties for the new Comment node.
    * @returns The new node.
    */
  def comment(): postcssLib.postcssMod.postcssNs.Comment = js.native
  def comment(defaults: postcssLib.postcssMod.postcssNs.CommentNewProps): postcssLib.postcssMod.postcssNs.Comment = js.native
  /**
    * Creates a new Declaration node.
    * @param defaults Properties for the new Declaration node.
    * @returns The new node.
    */
  def decl(): postcssLib.postcssMod.postcssNs.Declaration = js.native
  def decl(defaults: postcssLib.postcssMod.postcssNs.DeclarationNewProps): postcssLib.postcssMod.postcssNs.Declaration = js.native
  /**
    * Parses source CSS.
    * @param css The CSS to parse.
    * @param options
    * @returns {} A new Root node, which contains the source CSS nodes.
    */
  def parse(css: java.lang.String): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: java.lang.String, options: postcssLib.Anon_From): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.Anon_ToString): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.Anon_ToString, options: postcssLib.Anon_From): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.postcssMod.postcssNs.LazyResult): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.postcssMod.postcssNs.LazyResult, options: postcssLib.Anon_From): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.postcssMod.postcssNs.Result): postcssLib.postcssMod.postcssNs.Root = js.native
  def parse(css: postcssLib.postcssMod.postcssNs.Result, options: postcssLib.Anon_From): postcssLib.postcssMod.postcssNs.Root = js.native
  /**
    * Creates a PostCSS plugin with a standard API.
    * @param name Plugin name. Same as in name property in package.json. It will
    * be saved in plugin.postcssPlugin property.
    * @param initializer Will receive plugin options and should return functions
    * to modify nodes in input CSS.
    */
  def plugin[T](name: java.lang.String, initializer: postcssLib.postcssMod.postcssNs.PluginInitializer[T]): postcssLib.postcssMod.postcssNs.Plugin[T] = js.native
  /**
    * Creates a new Root node.
    * @param defaults Properties for the new Root node.
    * @returns The new node.
    */
  def root(): postcssLib.postcssMod.postcssNs.Root = js.native
  def root(defaults: js.Object): postcssLib.postcssMod.postcssNs.Root = js.native
  /**
    * Creates a new Rule node.
    * @param defaults Properties for the new Rule node.
    * @returns The new node.
    */
  def rule(): postcssLib.postcssMod.postcssNs.Rule = js.native
  def rule(defaults: postcssLib.postcssMod.postcssNs.RuleNewProps): postcssLib.postcssMod.postcssNs.Rule = js.native
  /**
    * Default function to convert a node tree into a CSS string.
    */
  def stringify(
    node: postcssLib.postcssMod.postcssNs.Node,
    builder: postcssLib.postcssMod.postcssNs.StringifierNs.Builder
  ): scala.Unit = js.native
}

