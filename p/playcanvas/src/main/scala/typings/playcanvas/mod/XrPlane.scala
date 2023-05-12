package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected Plane instance that provides position, rotation and polygon points. Plane is a subject
  * to change during its lifetime.
  */
@JSImport("playcanvas", "XrPlane")
@js.native
open class XrPlane protected () extends EventHandler {
  /**
    * Create a new XrPlane instance.
    *
    * @param {import('./xr-plane-detection.js').XrPlaneDetection} planeDetection - Plane detection
    * system.
    * @param {*} xrPlane - XRPlane that is instantiated by WebXR system.
    * @hideconstructor
    */
  def this(planeDetection: XrPlaneDetection, xrPlane: Any) = this()
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _id: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _lastChangedTime: Any = js.native
  
  /**
    * @type {string}
    * @private
    */
  /* private */ var _orientation: Any = js.native
  
  /**
    * @type {import('./xr-plane-detection.js').XrPlaneDetection}
    * @private
    */
  /* private */ var _planeDetection: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _position: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _rotation: Any = js.native
  
  /**
    * @type {XRPlane}
    * @private
    */
  /* private */ var _xrPlane: Any = js.native
  
  /**
    * Fired when {@link XrPlane} is removed.
    *
    * @event XrPlane#remove
    * @example
    * plane.once('remove', function () {
    *     // plane is not available anymore
    * });
    */
  /**
    * Fired when {@link XrPlane} attributes such as: orientation and/or points have been changed.
    * Position and rotation can change at any time without triggering a `change` event.
    *
    * @event XrPlane#change
    * @example
    * plane.on('change', function () {
    *     // plane has been changed
    * });
    */
  /** @ignore */
  def destroy(): Unit = js.native
  
  /**
    * Get the world space position of a plane.
    *
    * @returns {Vec3} The world space position of a plane.
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the world space rotation of a plane.
    *
    * @returns {Quat} The world space rotation of a plane.
    */
  def getRotation(): Quat = js.native
  
  /**
    * Unique identifier of a plane.
    *
    * @type {number}
    */
  def id: Double = js.native
  
  /**
    * Plane's specific orientation (horizontal or vertical) or null if orientation is anything else.
    *
    * @type {string|null}
    */
  def orientation: String = js.native
  
  /**
    * Array of DOMPointReadOnly objects. DOMPointReadOnly is an object with `x y z` properties
    * that defines a local point of a plane's polygon.
    *
    * @type {object[]}
    * @example
    * // prepare reusable objects
    * const vecA = new pc.Vec3();
    * const vecB = new pc.Vec3();
    * const color = new pc.Color(1, 1, 1);
    *
    * // update Mat4 to plane position and rotation
    * transform.setTRS(plane.getPosition(), plane.getRotation(), pc.Vec3.ONE);
    *
    * // draw lines between points
    * for (let i = 0; i < plane.points.length; i++) {
    *     vecA.copy(plane.points[i]);
    *     vecB.copy(plane.points[(i + 1) % plane.points.length]);
    *
    *     // transform from planes local to world coords
    *     transform.transformPoint(vecA, vecA);
    *     transform.transformPoint(vecB, vecB);
    *
    *     // render line
    *     app.drawLine(vecA, vecB, color);
    * }
    */
  def points: js.Array[Any] = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
