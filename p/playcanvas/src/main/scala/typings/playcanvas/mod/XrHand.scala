package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hand with fingers and joints.
  *
  * @augments EventHandler
  */
@js.native
trait XrHand extends EventHandler {
  
  /**
    * @param {number} index - Finger index.
    * @returns {boolean} True if finger is closed and false otherwise.
    * @private
    */
  /* private */ var _fingerIsClosed: Any = js.native
  
  /**
    * @type {XrFinger[]}
    * @private
    */
  /* private */ var _fingers: Any = js.native
  
  /**
    * @type {XrInputSource}
    * @private
    */
  /* private */ var _inputSource: Any = js.native
  
  /**
    * @type {XrJoint[]}
    * @private
    */
  /* private */ var _joints: Any = js.native
  
  /**
    * @type {Object<string, XrJoint>}
    * @private
    */
  /* private */ var _jointsById: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * @type {XrJoint[]}
    * @private
    */
  /* private */ var _tips: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _tracking: Any = js.native
  
  /**
    * @type {XrJoint|null}
    * @private
    */
  /* private */ var _wrist: Any = js.native
  
  /**
    * List of fingers of a hand.
    *
    * @type {XrFinger[]}
    */
  def fingers: js.Array[XrFinger] = js.native
  
  /**
    * Returns joint by XRHand id from list in specs: https://immersive-web.github.io/webxr-hand-input/.
    *
    * @param {string} id - Id of a joint based on specs ID's in XRHand: https://immersive-web.github.io/webxr-hand-input/.
    * @returns {XrJoint|null} Joint or null if not available.
    */
  def getJointById(id: String): XrJoint | Null = js.native
  
  /**
    * List of joints of hand.
    *
    * @type {XrJoint[]}
    */
  def joints: js.Array[XrJoint] = js.native
  
  /**
    * List of joints that are fingertips.
    *
    * @type {XrJoint[]}
    */
  def tips: js.Array[XrJoint] = js.native
  
  /**
    * True if tracking is available, otherwise tracking might be lost.
    *
    * @type {boolean}
    */
  def tracking: Boolean = js.native
  
  /**
    * Fired when tracking becomes available.
    *
    * @event XrHand#tracking
    */
  /**
    * Fired when tracking is lost.
    *
    * @event XrHand#trackinglost
    */
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
  
  /**
    * Wrist of a hand, or null if it is not available by WebXR underlying system.
    *
    * @type {XrJoint|null}
    */
  def wrist: XrJoint = js.native
}
