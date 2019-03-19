package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a CSS file and contains all its parsed nodes.
  */
@js.native
trait Root
  extends ContainerBase
     with Container
     with Node {
  /**
    * Inherited from Container. Should always be undefined for a Root node.
    */
  var parent: scala.Unit = js.native
  var `type`: postcssLib.postcssLibStrings.root = js.native
  /**
    * @returns A Result instance representing the root's CSS.
    */
  def toResult(): Result = js.native
  def toResult(options: postcssLib.Anon_Map): Result = js.native
}

