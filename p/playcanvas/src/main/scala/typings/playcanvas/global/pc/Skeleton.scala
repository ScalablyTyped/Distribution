package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a skeleton used to play animations.
  * @property looping - Determines whether skeleton is looping its animation.
  * @param graph - The root pc.GraphNode of the skeleton.
  */
@JSGlobal("pc.Skeleton")
@js.native
class Skeleton protected ()
  extends typings.playcanvas.pc.Skeleton {
  def this(graph: typings.playcanvas.pc.GraphNode) = this()
}

