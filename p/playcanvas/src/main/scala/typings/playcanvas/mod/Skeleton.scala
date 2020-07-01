package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a skeleton used to play animations.
  * @property looping - Determines whether skeleton is looping its animation.
  * @param graph - The root pc.GraphNode of the skeleton.
  */
@JSImport("playcanvas", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.playcanvas.pc.Skeleton {
  def this(graph: typings.playcanvas.pc.GraphNode) = this()
  /**
    * Animation currently assigned to skeleton.
    */
  /* CompleteClass */
  override var animation: typings.playcanvas.pc.Animation = js.native
  /**
    * Current time of currently active animation in seconds.
    This value is between zero and the duration of the animation.
    */
  /* CompleteClass */
  override var currentTime: Double = js.native
  /**
    * Determines whether skeleton is looping its animation.
    */
  /* CompleteClass */
  override var looping: Boolean = js.native
  /**
    * Read-only property that returns number of nodes of a skeleton.
    */
  /* CompleteClass */
  override val numNodes: Double = js.native
  /**
    * Progresses The animation assigned to The specified skeleton by The
    supplied time delta. If the delta takes the animation passed its end point, if
    the skeleton is set to loop, the animation will continue from the beginning.
    Otherwise, the animation's current time will remain at its duration (i.e. the
    end).
    * @param delta - The time in seconds to progress the skeleton's animation.
    */
  /* CompleteClass */
  override def addTime(delta: Double): Unit = js.native
  /**
    * Blends two skeletons together.
    * @param skel1 - Skeleton holding the first pose to be blended.
    * @param skel2 - Skeleton holding the second pose to be blended.
    * @param alpha - The value controlling the interpolation in relation to the two input
    skeletons. The value is in the range 0 to 1, 0 generating skel1, 1 generating skel2 and anything
    in between generating a spherical interpolation between the two.
    */
  /* CompleteClass */
  override def blend(skel1: typings.playcanvas.pc.Skeleton, skel2: typings.playcanvas.pc.Skeleton, alpha: Double): Unit = js.native
  /**
    * Links a skeleton to a node hierarchy. The nodes animated skeleton are
    then subsequently used to drive the local transformation matrices of the node
    hierarchy.
    * @param graph - The root node of the graph that the skeleton is to drive.
    */
  /* CompleteClass */
  override def setGraph(graph: typings.playcanvas.pc.GraphNode): Unit = js.native
  /**
    * Synchronizes the currently linked node hierarchy with the current state of the
    skeleton. Internally, this function converts the interpolated keyframe at each node in the
    skeleton into the local transformation matrix at each corresponding node in the linked node
    hierarchy.
    */
  /* CompleteClass */
  override def updateGraph(): Unit = js.native
}

