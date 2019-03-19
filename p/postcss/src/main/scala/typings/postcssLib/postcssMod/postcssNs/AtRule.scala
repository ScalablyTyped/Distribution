package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an at-rule. If it's followed in the CSS by a {} block, this
  * node will have a nodes property representing its children.
  */
@js.native
trait AtRule
  extends ContainerBase
     with ChildNode
     with Container {
  /**
    * The identifier that immediately follows the @.
    */
  var name: java.lang.String = js.native
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: java.lang.String = js.native
  /**
    * Returns the atrule's parent node.
    */
  var parent: Container = js.native
  var `type`: postcssLib.postcssLibStrings.atrule = js.native
}

