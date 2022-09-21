package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the joint of a finger.
  */
@js.native
trait XrJoint extends StObject {
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _dirtyLocal: Any = js.native
  
  /**
    * @type {XrFinger}
    * @private
    */
  /* private */ var _finger: Any = js.native
  
  /**
    * @type {XrHand}
    * @private
    */
  /* private */ var _hand: Any = js.native
  
  /**
    * @type {string}
    * @private
    */
  /* private */ var _id: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _index: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _localPosition: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _localRotation: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var _localTransform: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _position: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _radius: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _rotation: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _tip: Any = js.native
  
  /** @private */
  /* private */ var _updateTransforms: Any = js.native
  
  /**
    * @type {Mat4}
    * @private
    */
  /* private */ var _worldTransform: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _wrist: Any = js.native
  
  /**
    * Finger that joint relates to.
    *
    * @type {XrFinger|null}
    */
  def finger: XrFinger = js.native
  
  /**
    * Get the world space position of a joint.
    *
    * @returns {Vec3} The world space position of a joint.
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the world space rotation of a joint.
    *
    * @returns {Quat} The world space rotation of a joint.
    */
  def getRotation(): Quat = js.native
  
  /**
    * Hand that joint relates to.
    *
    * @type {XrHand}
    */
  def hand: XrHand = js.native
  
  /**
    * Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of
    * the finger.
    *
    * @type {number}
    */
  def index: Double = js.native
  
  /**
    * The radius of a joint, which is a distance from joint to the edge of a skin.
    *
    * @type {number}
    */
  def radius: Double = js.native
  
  /**
    * True if joint is a tip of a finger.
    *
    * @type {boolean}
    */
  def tip: Boolean = js.native
  
  /**
    * @param {*} pose - XRJointPose of this joint.
    * @ignore
    */
  def update(pose: Any): Unit = js.native
  
  /**
    * True if joint is a wrist.
    *
    * @type {boolean}
    */
  def wrist: Boolean = js.native
}
