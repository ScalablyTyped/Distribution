package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hand with fingers and joints
  * @property fingers - List of fingers of a hand
  * @property joints - List of joints of hand
  * @property tips - List of joints that are tips of a fingers
  * @property wrist - Wrist of a hand, or null if it is not available by WebXR underlying system
  * @property tracking - True if tracking is available, otherwise tracking might be lost
  * @param inputSource - Input Source that hand is related to
  */
@js.native
trait XrHand extends js.Object {
  
  /**
    * List of fingers of a hand
    */
  var fingers: js.Array[XrFinger] = js.native
  
  /**
    * Returns joint by XRHand id from list in specs: https://immersive-web.github.io/webxr-hand-input/
    * @param id - id of a joint based on specs ID's in XRHand: https://immersive-web.github.io/webxr-hand-input/
    * @returns Joint or null if not available
    */
  def getJointById(id: Double): XrJoint | Null = js.native
  
  /**
    * List of joints of hand
    */
  var joints: js.Array[XrJoint] = js.native
  
  /**
    * List of joints that are tips of a fingers
    */
  var tips: js.Array[XrJoint] = js.native
  
  /**
    * True if tracking is available, otherwise tracking might be lost
    */
  var tracking: Boolean = js.native
  
  /**
    * Wrist of a hand, or null if it is not available by WebXR underlying system
    */
  var wrist: XrJoint | Null = js.native
}
object XrHand {
  
  @scala.inline
  def apply(
    fingers: js.Array[XrFinger],
    getJointById: Double => XrJoint | Null,
    joints: js.Array[XrJoint],
    tips: js.Array[XrJoint],
    tracking: Boolean
  ): XrHand = {
    val __obj = js.Dynamic.literal(fingers = fingers.asInstanceOf[js.Any], getJointById = js.Any.fromFunction1(getJointById), joints = joints.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], tracking = tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrHand]
  }
  
  @scala.inline
  implicit class XrHandOps[Self <: XrHand] (val x: Self) extends AnyVal {
    
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
    def setFingersVarargs(value: XrFinger*): Self = this.set("fingers", js.Array(value :_*))
    
    @scala.inline
    def setFingers(value: js.Array[XrFinger]): Self = this.set("fingers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJointById(value: Double => XrJoint | Null): Self = this.set("getJointById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJointsVarargs(value: XrJoint*): Self = this.set("joints", js.Array(value :_*))
    
    @scala.inline
    def setJoints(value: js.Array[XrJoint]): Self = this.set("joints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: XrJoint*): Self = this.set("tips", js.Array(value :_*))
    
    @scala.inline
    def setTips(value: js.Array[XrJoint]): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracking(value: Boolean): Self = this.set("tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrist(value: XrJoint): Self = this.set("wrist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWristNull: Self = this.set("wrist", null)
  }
}
