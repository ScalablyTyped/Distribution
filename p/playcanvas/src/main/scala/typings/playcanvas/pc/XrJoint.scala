package typings.playcanvas.pc

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
trait XrJoint extends StObject {
  
  /**
    * Finger that joint relates to
    */
  var finger: XrFinger | Null
  
  /**
    * Get the world space position of a joint
    * @returns The world space position of a joint
    */
  def getPosition(): Vec3
  
  /**
    * Get the world space rotation of a joint
    * @returns The world space rotation of a joint
    */
  def getRotation(): Quat
  
  /**
    * Hand that joint relates to
    */
  var hand: XrHand
  
  /**
    * Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of the finger
    */
  var index: Double
  
  /**
    * The radius of a joint, which is a distance from joint to the edge of a skin
    */
  var radius: Double
  
  /**
    * True if joint is a tip of a finger
    */
  var tip: Boolean
  
  /**
    * True if joint is a wrist
    */
  var wrist: Boolean
}
object XrJoint {
  
  inline def apply(
    getPosition: () => Vec3,
    getRotation: () => Quat,
    hand: XrHand,
    index: Double,
    radius: Double,
    tip: Boolean,
    wrist: Boolean
  ): XrJoint = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getRotation = js.Any.fromFunction0(getRotation), hand = hand.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], wrist = wrist.asInstanceOf[js.Any], finger = null)
    __obj.asInstanceOf[XrJoint]
  }
  
  extension [Self <: XrJoint](x: Self) {
    
    inline def setFinger(value: XrFinger): Self = StObject.set(x, "finger", value.asInstanceOf[js.Any])
    
    inline def setFingerNull: Self = StObject.set(x, "finger", null)
    
    inline def setGetPosition(value: () => Vec3): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetRotation(value: () => Quat): Self = StObject.set(x, "getRotation", js.Any.fromFunction0(value))
    
    inline def setHand(value: XrHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTip(value: Boolean): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setWrist(value: Boolean): Self = StObject.set(x, "wrist", value.asInstanceOf[js.Any])
  }
}
