package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a CSS rule: a selector followed by a declaration block.
  */
@js.native
trait Rule
  extends ContainerBase
     with ChildNode
     with Container {
  /**
    * Returns the rule's parent node.
    */
  var parent: Container = js.native
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: String = js.native
  /**
    * An array containing the rule's individual selectors.
    * Groups of selectors are split at commas.
    */
  var selectors: js.Array[String] = js.native
  var `type`: typings.postcss.postcssStrings.rule = js.native
}

@JSImport("postcss", "rule")
@js.native
object rule extends js.Object {
  /**
    * Creates a new Rule node.
    * @param defaults Properties for the new Rule node.
    * @returns The new node.
    */
  def apply(): Rule = js.native
  def apply(defaults: RuleNewProps): Rule = js.native
}

