package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a skeleton used to play animations.
  */
@JSImport("playcanvas", "Skeleton")
@js.native
open class Skeleton protected () extends StObject {
  /**
    * Create a new Skeleton instance.
    *
    * @param {import('../graph-node.js').GraphNode} graph - The root {@link GraphNode} of the
    * skeleton.
    */
  def this(graph: GraphNode) = this()
  
  /**
    * @type {import('./animation.js').Animation}
    * @private
    */
  /* private */ var _animation: Any = js.native
  
  var _interpolatedKeys: js.Array[Any] = js.native
  
  var _time: Double = js.native
  
  /**
    * Progresses the animation assigned to the specified skeleton by the supplied time delta. If
    * the delta takes the animation passed its end point, if the skeleton is set to loop, the
    * animation will continue from the beginning. Otherwise, the animation's current time will
    * remain at its duration (i.e. the end).
    *
    * @param {number} delta - The time in seconds to progress the skeleton's animation.
    */
  def addTime(delta: Double): Unit = js.native
  
  def animation: Animation = js.native
  /**
    * Animation currently assigned to skeleton.
    *
    * @type {import('./animation.js').Animation}
    */
  def animation_=(arg: Animation): Unit = js.native
  
  /**
    * Blends two skeletons together.
    *
    * @param {Skeleton} skel1 - Skeleton holding the first pose to be blended.
    * @param {Skeleton} skel2 - Skeleton holding the second pose to be blended.
    * @param {number} alpha - The value controlling the interpolation in relation to the two input
    * skeletons. The value is in the range 0 to 1, 0 generating skel1, 1 generating skel2 and
    * anything in between generating a spherical interpolation between the two.
    */
  def blend(skel1: Skeleton, skel2: Skeleton, alpha: Double): Unit = js.native
  
  def currentTime: Double = js.native
  /**
    * Current time of currently active animation in seconds. This value is between zero and the
    * duration of the animation.
    *
    * @type {number}
    */
  def currentTime_=(arg: Double): Unit = js.native
  
  var graph: GraphNode = js.native
  
  /**
    * Determines whether skeleton is looping its animation.
    *
    * @type {boolean}
    */
  var looping: Boolean = js.native
  
  /**
    * Read-only property that returns number of nodes of a skeleton.
    *
    * @type {number}
    */
  def numNodes: Double = js.native
  
  /**
    * Links a skeleton to a node hierarchy. The nodes animated skeleton are then subsequently used
    * to drive the local transformation matrices of the node hierarchy.
    *
    * @param {import('../graph-node.js').GraphNode} graph - The root node of the graph that the
    * skeleton is to drive.
    */
  def setGraph(graph: GraphNode): Unit = js.native
  
  /**
    * Synchronizes the currently linked node hierarchy with the current state of the skeleton.
    * Internally, this function converts the interpolated keyframe at each node in the skeleton
    * into the local transformation matrix at each corresponding node in the linked node
    * hierarchy.
    */
  def updateGraph(): Unit = js.native
}
