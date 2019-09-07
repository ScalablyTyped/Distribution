package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Skeleton
  * @classdesc Represents a skeleton used to play animations.
  * @param {pc.GraphNode} graph The root pc.GraphNode of the skeleton.
  * @property {Boolean} looping Determines whether skeleton is looping its animation.
  */
@JSImport("playcanvas", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.playcanvas.pcNs.Skeleton {
  def this(graph: typings.playcanvas.pcNs.GraphNode) = this()
}

