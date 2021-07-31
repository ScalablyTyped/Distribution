package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents joint of a finger
  * @property index - Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of the finger
  * @property hand - Hand that joint relates to
  * @property finger - Finger that joint relates to
  * @property wrist - True if joint is a wrist
  * @property tip - True if joint is a tip of a finger
  * @property radius - The radius of a joint, which is a distance from joint to the edge of a skin
  * @param index - Index of a joint within a finger
  * @param id - Id of a joint based on XRHand specs
  * @param hand - Hand that joint relates to
  * @param [finger] - Finger that joint is related to, can be null in case of wrist joint
  */
@JSGlobal("pc.XrJoint")
@js.native
class XrJoint protected ()
  extends StObject
     with typings.playcanvas.pc.XrJoint {
  def this(index: Double, id: Double, hand: typings.playcanvas.pc.XrHand) = this()
  def this(
    index: Double,
    id: Double,
    hand: typings.playcanvas.pc.XrHand,
    finger: typings.playcanvas.pc.XrFinger
  ) = this()
  
  /**
    * Finger that joint relates to
    */
  /* CompleteClass */
  var finger: typings.playcanvas.pc.XrFinger | Null = js.native
  
  /**
    * Get the world space position of a joint
    * @returns The world space position of a joint
    */
  /* CompleteClass */
  override def getPosition(): typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * Get the world space rotation of a joint
    * @returns The world space rotation of a joint
    */
  /* CompleteClass */
  override def getRotation(): typings.playcanvas.pc.Quat = js.native
  
  /**
    * Hand that joint relates to
    */
  /* CompleteClass */
  var hand: typings.playcanvas.pc.XrHand = js.native
  
  /**
    * Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of the finger
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * The radius of a joint, which is a distance from joint to the edge of a skin
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * True if joint is a tip of a finger
    */
  /* CompleteClass */
  var tip: Boolean = js.native
  
  /**
    * True if joint is a wrist
    */
  /* CompleteClass */
  var wrist: Boolean = js.native
}
