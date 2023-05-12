package typings.playcanvas.mod

import typings.std.AudioListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an audio listener - used internally.
  *
  * @ignore
  */
@js.native
trait Listener extends StObject {
  
  /**
    * @type {import('./manager.js').SoundManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * Get the orientation matrix of the listener.
    *
    * @returns {Mat4} The orientation matrix of the listener.
    */
  def getOrientation(): Mat4 = js.native
  
  /**
    * Get the position of the listener.
    *
    * @returns {Vec3} The position of the listener.
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the velocity of the listener.
    *
    * @returns {Vec3} The velocity of the listener.
    * @deprecated
    */
  def getVelocity(): Vec3 = js.native
  
  /**
    * Get the listener.
    *
    * @type {AudioListener|null}
    */
  def listener: AudioListener = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var orientation: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var position: Any = js.native
  
  /**
    * Set the orientation matrix of the listener.
    *
    * @param {Mat4} orientation - The new orientation matrix of the listener.
    */
  def setOrientation(orientation: Mat4): Unit = js.native
  
  /**
    * Set the position of the listener.
    *
    * @param {Vec3} position - The new position of the listener.
    */
  def setPosition(position: Vec3): Unit = js.native
  
  /**
    * Set the velocity of the listener.
    *
    * @param {Vec3} velocity - The new velocity of the listener.
    * @deprecated
    */
  def setVelocity(velocity: Vec3): Unit = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var velocity: Any = js.native
}
