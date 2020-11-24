package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait XrJoint extends js.Object {
  
  /**
    * Finger that joint relates to
    */
  var finger: XrFinger | Null = js.native
  
  /**
    * Get the world space position of a joint
    * @returns The world space position of a joint
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the world space rotation of a joint
    * @returns The world space rotation of a joint
    */
  def getRotation(): Quat = js.native
  
  /**
    * Hand that joint relates to
    */
  var hand: XrHand = js.native
  
  /**
    * Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of the finger
    */
  var index: Double = js.native
  
  /**
    * The radius of a joint, which is a distance from joint to the edge of a skin
    */
  var radius: Double = js.native
  
  /**
    * True if joint is a tip of a finger
    */
  var tip: Boolean = js.native
  
  /**
    * True if joint is a wrist
    */
  var wrist: Boolean = js.native
}
object XrJoint {
  
  @scala.inline
  def apply(
    getPosition: () => Vec3,
    getRotation: () => Quat,
    hand: XrHand,
    index: Double,
    radius: Double,
    tip: Boolean,
    wrist: Boolean
  ): XrJoint = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getRotation = js.Any.fromFunction0(getRotation), hand = hand.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], wrist = wrist.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrJoint]
  }
  
  @scala.inline
  implicit class XrJointOps[Self <: XrJoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPosition(value: () => Vec3): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRotation(value: () => Quat): Self = this.set("getRotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHand(value: XrHand): Self = this.set("hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip(value: Boolean): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrist(value: Boolean): Self = this.set("wrist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinger(value: XrFinger): Self = this.set("finger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerNull: Self = this.set("finger", null)
  }
}
