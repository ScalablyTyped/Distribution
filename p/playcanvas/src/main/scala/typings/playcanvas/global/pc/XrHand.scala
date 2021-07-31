package typings.playcanvas.global.pc

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
@JSGlobal("pc.XrHand")
@js.native
class XrHand protected ()
  extends StObject
     with typings.playcanvas.pc.XrHand {
  def this(inputSource: typings.playcanvas.pc.XrInputSource) = this()
  
  /**
    * List of fingers of a hand
    */
  /* CompleteClass */
  var fingers: js.Array[typings.playcanvas.pc.XrFinger] = js.native
  
  /**
    * Returns joint by XRHand id from list in specs: https://immersive-web.github.io/webxr-hand-input/
    * @param id - id of a joint based on specs ID's in XRHand: https://immersive-web.github.io/webxr-hand-input/
    * @returns Joint or null if not available
    */
  /* CompleteClass */
  override def getJointById(id: Double): typings.playcanvas.pc.XrJoint | Null = js.native
  
  /**
    * List of joints of hand
    */
  /* CompleteClass */
  var joints: js.Array[typings.playcanvas.pc.XrJoint] = js.native
  
  /**
    * List of joints that are tips of a fingers
    */
  /* CompleteClass */
  var tips: js.Array[typings.playcanvas.pc.XrJoint] = js.native
  
  /**
    * True if tracking is available, otherwise tracking might be lost
    */
  /* CompleteClass */
  var tracking: Boolean = js.native
  
  /**
    * Wrist of a hand, or null if it is not available by WebXR underlying system
    */
  /* CompleteClass */
  var wrist: typings.playcanvas.pc.XrJoint | Null = js.native
}
