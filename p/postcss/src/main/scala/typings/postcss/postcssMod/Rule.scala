package typings.postcss.postcssMod

import typings.postcss.postcssStrings.rule
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
  var `type`: rule = js.native
}

