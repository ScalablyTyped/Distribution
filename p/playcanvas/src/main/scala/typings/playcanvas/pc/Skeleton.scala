package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a skeleton used to play animations.
  * @property looping - Determines whether skeleton is looping its animation.
  * @param graph - The root pc.GraphNode of the skeleton.
  */
trait Skeleton extends js.Object {
  /**
    * Animation currently assigned to skeleton.
    */
  var animation: Animation
  /**
    * Current time of currently active animation in seconds.
    This value is between zero and the duration of the animation.
    */
  var currentTime: Double
  /**
    * Determines whether skeleton is looping its animation.
    */
  var looping: Boolean
  /**
    * Read-only property that returns number of nodes of a skeleton.
    */
  val numNodes: Double
  /**
    * Progresses The animation assigned to The specified skeleton by The
    supplied time delta. If the delta takes the animation passed its end point, if
    the skeleton is set to loop, the animation will continue from the beginning.
    Otherwise, the animation's current time will remain at its duration (i.e. the
    end).
    * @param delta - The time in seconds to progress the skeleton's animation.
    */
  def addTime(delta: Double): Unit
  /**
    * Blends two skeletons together.
    * @param skel1 - Skeleton holding the first pose to be blended.
    * @param skel2 - Skeleton holding the second pose to be blended.
    * @param alpha - The value controlling the interpolation in relation to the two input
    * skeletons. The value is in the range 0 to 1, 0 generating skel1, 1 generating skel2 and anything
    in between generating a spherical interpolation between the two.
    */
  def blend(skel1: Skeleton, skel2: Skeleton, alpha: Double): Unit
  /**
    * Links a skeleton to a node hierarchy. The nodes animated skeleton are
    then subsequently used to drive the local transformation matrices of the node
    hierarchy.
    * @param graph - The root node of the graph that the skeleton is to drive.
    */
  def setGraph(graph: GraphNode): Unit
  /**
    * Synchronizes the currently linked node hierarchy with the current state of the
    skeleton. Internally, this function converts the interpolated keyframe at each node in the
    skeleton into the local transformation matrix at each corresponding node in the linked node
    hierarchy.
    */
  def updateGraph(): Unit
}

object Skeleton {
  @scala.inline
  def apply(
    addTime: Double => Unit,
    animation: Animation,
    blend: (Skeleton, Skeleton, Double) => Unit,
    currentTime: Double,
    looping: Boolean,
    numNodes: Double,
    setGraph: GraphNode => Unit,
    updateGraph: () => Unit
  ): Skeleton = {
    val __obj = js.Dynamic.literal(addTime = js.Any.fromFunction1(addTime), animation = animation.asInstanceOf[js.Any], blend = js.Any.fromFunction3(blend), currentTime = currentTime.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], numNodes = numNodes.asInstanceOf[js.Any], setGraph = js.Any.fromFunction1(setGraph), updateGraph = js.Any.fromFunction0(updateGraph))
    __obj.asInstanceOf[Skeleton]
  }
}

