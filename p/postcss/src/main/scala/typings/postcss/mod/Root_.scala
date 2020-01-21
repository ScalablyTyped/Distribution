package typings.postcss.mod

import typings.postcss.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a CSS file and contains all its parsed nodes.
  */
@js.native
trait Root_
  extends ContainerBase
     with Container
     with Node {
  /**
    * Inherited from Container. Should always be undefined for a Root node.
    */
  var parent: Unit = js.native
  var `type`: typings.postcss.postcssStrings.root = js.native
  /**
    * @returns A Result instance representing the root's CSS.
    */
  def toResult(): Result = js.native
  def toResult(options: AnonMap): Result = js.native
}

