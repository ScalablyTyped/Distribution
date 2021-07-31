package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait XrHand extends StObject {
  
  /**
    * List of fingers of a hand
    */
  var fingers: js.Array[XrFinger]
  
  /**
    * Returns joint by XRHand id from list in specs: https://immersive-web.github.io/webxr-hand-input/
    * @param id - id of a joint based on specs ID's in XRHand: https://immersive-web.github.io/webxr-hand-input/
    * @returns Joint or null if not available
    */
  def getJointById(id: Double): XrJoint | Null
  
  /**
    * List of joints of hand
    */
  var joints: js.Array[XrJoint]
  
  /**
    * List of joints that are tips of a fingers
    */
  var tips: js.Array[XrJoint]
  
  /**
    * True if tracking is available, otherwise tracking might be lost
    */
  var tracking: Boolean
  
  /**
    * Wrist of a hand, or null if it is not available by WebXR underlying system
    */
  var wrist: XrJoint | Null
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
    val __obj = js.Dynamic.literal(fingers = fingers.asInstanceOf[js.Any], getJointById = js.Any.fromFunction1(getJointById), joints = joints.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any], tracking = tracking.asInstanceOf[js.Any], wrist = null)
    __obj.asInstanceOf[XrHand]
  }
  
  @scala.inline
  implicit class XrHandMutableBuilder[Self <: XrHand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingers(value: js.Array[XrFinger]): Self = StObject.set(x, "fingers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingersVarargs(value: XrFinger*): Self = StObject.set(x, "fingers", js.Array(value :_*))
    
    @scala.inline
    def setGetJointById(value: Double => XrJoint | Null): Self = StObject.set(x, "getJointById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoints(value: js.Array[XrJoint]): Self = StObject.set(x, "joints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointsVarargs(value: XrJoint*): Self = StObject.set(x, "joints", js.Array(value :_*))
    
    @scala.inline
    def setTips(value: js.Array[XrJoint]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: XrJoint*): Self = StObject.set(x, "tips", js.Array(value :_*))
    
    @scala.inline
    def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrist(value: XrJoint): Self = StObject.set(x, "wrist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWristNull: Self = StObject.set(x, "wrist", null)
  }
}
