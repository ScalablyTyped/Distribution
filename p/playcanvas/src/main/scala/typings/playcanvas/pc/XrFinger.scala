package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents finger with related joints and index
  * @property index - Index of a finger, numeration is: thumb, index, middle, ring, little
  * @property hand - Hand that finger relates to
  * @property joints - List of joints that relates to this finger, starting from joint closest to wrist all the way to the tip of a finger
  * @property tip - Tip of a finger, or null if not available
  * @param index - Index of a finger
  * @param hand - Hand that finger relates to
  */
trait XrFinger extends StObject {
  
  /**
    * Hand that finger relates to
    */
  var hand: XrHand
  
  /**
    * Index of a finger, numeration is: thumb, index, middle, ring, little
    */
  var index: Double
  
  /**
    * List of joints that relates to this finger, starting from joint closest to wrist all the way to the tip of a finger
    */
  var joints: js.Array[XrJoint]
  
  /**
    * Tip of a finger, or null if not available
    */
  var tip: XrJoint | Null
}
object XrFinger {
  
  @scala.inline
  def apply(hand: XrHand, index: Double, joints: js.Array[XrJoint]): XrFinger = {
    val __obj = js.Dynamic.literal(hand = hand.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], joints = joints.asInstanceOf[js.Any], tip = null)
    __obj.asInstanceOf[XrFinger]
  }
  
  @scala.inline
  implicit class XrFingerMutableBuilder[Self <: XrFinger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHand(value: XrHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoints(value: js.Array[XrJoint]): Self = StObject.set(x, "joints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointsVarargs(value: XrJoint*): Self = StObject.set(x, "joints", js.Array(value :_*))
    
    @scala.inline
    def setTip(value: XrJoint): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipNull: Self = StObject.set(x, "tip", null)
  }
}
