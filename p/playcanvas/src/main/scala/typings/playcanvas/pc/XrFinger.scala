package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait XrFinger extends js.Object {
  
  /**
    * Hand that finger relates to
    */
  var hand: XrHand = js.native
  
  /**
    * Index of a finger, numeration is: thumb, index, middle, ring, little
    */
  var index: Double = js.native
  
  /**
    * List of joints that relates to this finger, starting from joint closest to wrist all the way to the tip of a finger
    */
  var joints: js.Array[XrJoint] = js.native
  
  /**
    * Tip of a finger, or null if not available
    */
  var tip: XrJoint | Null = js.native
}
object XrFinger {
  
  @scala.inline
  def apply(hand: XrHand, index: Double, joints: js.Array[XrJoint]): XrFinger = {
    val __obj = js.Dynamic.literal(hand = hand.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], joints = joints.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrFinger]
  }
  
  @scala.inline
  implicit class XrFingerOps[Self <: XrFinger] (val x: Self) extends AnyVal {
    
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
    def setHand(value: XrHand): Self = this.set("hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointsVarargs(value: XrJoint*): Self = this.set("joints", js.Array(value :_*))
    
    @scala.inline
    def setJoints(value: js.Array[XrJoint]): Self = this.set("joints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTip(value: XrJoint): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipNull: Self = this.set("tip", null)
  }
}
