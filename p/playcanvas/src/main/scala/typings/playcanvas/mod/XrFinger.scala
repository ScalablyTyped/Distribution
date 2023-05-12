package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents finger with related joints and index.
  */
@js.native
trait XrFinger extends StObject {
  
  /**
    * @type {import('./xr-hand.js').XrHand}
    * @private
    */
  /* private */ var _hand: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _index: Any = js.native
  
  /**
    * @type {import('./xr-joint.js').XrJoint[]}
    * @private
    */
  /* private */ var _joints: Any = js.native
  
  /**
    * @type {import('./xr-joint.js').XrJoint|null}
    * @private
    */
  /* private */ var _tip: Any = js.native
  
  /**
    * Hand that finger relates to.
    *
    * @type {import('./xr-hand.js').XrHand}
    */
  def hand: XrHand = js.native
  
  /**
    * Index of a finger, numeration is: thumb, index, middle, ring, little.
    *
    * @type {number}
    */
  def index: Double = js.native
  
  /**
    * List of joints that relates to this finger, starting from joint closest to wrist all the way
    * to the tip of a finger.
    *
    * @type {import('./xr-joint.js').XrJoint[]}
    */
  def joints: js.Array[XrJoint] = js.native
  
  /**
    * Tip of a finger, or null if not available.
    *
    * @type {import('./xr-joint.js').XrJoint|null}
    */
  def tip: XrJoint = js.native
}
