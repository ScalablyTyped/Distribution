package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Plane Detection provides the ability to detect real world surfaces based on estimations of the
  * underlying AR system.
  *
  * ```javascript
  * // start session with plane detection enabled
  * app.xr.start(camera, pc.XRTYPE_VR, pc.XRSPACE_LOCALFLOOR, {
  *     planeDetection: true
  * });
  * ```
  *
  * ```javascript
  * app.xr.planeDetection.on('add', function (plane) {
  *     // new plane been added
  * });
  * ```
  */
@JSImport("playcanvas", "XrPlaneDetection")
@js.native
open class XrPlaneDetection protected () extends EventHandler {
  /**
    * Create a new XrPlaneDetection instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _available: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * Fired when plane detection becomes available.
    *
    * @event XrPlaneDetection#available
    */
  /**
    * Fired when plane detection becomes unavailable.
    *
    * @event XrPlaneDetection#unavailable
    */
  /**
    * Fired when new {@link XrPlane} is added to the list.
    *
    * @event XrPlaneDetection#add
    * @param {XrPlane} plane - Plane that has been added.
    * @example
    * app.xr.planeDetection.on('add', function (plane) {
    *     // new plane is added
    * });
    */
  /**
    * Fired when a {@link XrPlane} is removed from the list.
    *
    * @event XrPlaneDetection#remove
    * @param {XrPlane} plane - Plane that has been removed.
    * @example
    * app.xr.planeDetection.on('remove', function (plane) {
    *     // new plane is removed
    * });
    */
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /**
    * @type {XrPlane[]|null}
    * @private
    */
  /* private */ var _planes: Any = js.native
  
  /**
    * @type {Map<XRPlane, XrPlane>}
    * @private
    */
  /* private */ var _planesIndex: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  /**
    * True if Plane Detection is available. This property can be set to true only during a running
    * session.
    *
    * @type {boolean}
    */
  def available: Boolean = js.native
  
  /**
    * Array of {@link XrPlane} instances that contain individual plane information, or null if
    * plane detection is not available.
    *
    * @type {XrPlane[]|null}
    */
  def planes: js.Array[XrPlane] = js.native
  
  /**
    * True if Plane Detection is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
