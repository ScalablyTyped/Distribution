package typings.playcanvas.mod

import typings.playcanvas.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/components/camera/component.js').CameraComponent} CameraComponent */
/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('../framework/entity.js').Entity} Entity */
/**
  * Callback used by {@link XrManager#endXr} and {@link XrManager#startXr}.
  *
  * @callback XrErrorCallback
  * @param {Error|null} err - The Error object or null if operation was successful.
  */
/**
  * Manage and update XR session and its states.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrManager")
@js.native
open class XrManager protected () extends EventHandler {
  /**
    * Create a new XrManager instance.
    *
    * @param {AppBase} app - The main application.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  /**
    * @type {Object<string, boolean>}
    * @private
    */
  /* private */ var _available: Any = js.native
  
  /**
    * @type {XRWebGLLayer|null}
    * @private
    */
  /* private */ var _baseLayer: Any = js.native
  
  /**
    * @type {CameraComponent}
    * @private
    */
  /* private */ var _camera: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _depthFar: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _depthNear: Any = js.native
  
  /** @private */
  /* private */ var _deviceAvailabilityCheck: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _height: Any = js.native
  
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
    * @param {XRSession} session - XR session.
    * @param {string} spaceType - Space type to request for the session.
    * @param {Function} callback - Callback to call when session is started.
    * @private
    */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @param {string} type - Session type.
    * @param {string} spaceType - Reference space type.
    * @param {*} options - Session options.
    * @param {XrErrorCallback} callback - Error callback.
    * @private
    */
  /* private */ var _onStartOptionsReady: Any = js.native
  
  /**
    * @type {XRReferenceSpace|null}
    * @private
    */
  /* private */ var _referenceSpace: Any = js.native
  
  /**
    * @type {XRSession|null}
    * @private
    */
  /* private */ var _session: Any = js.native
  
  /**
    * @param {string} type - Session type.
    * @private
    */
  /* private */ var _sessionSupportCheck: Any = js.native
  
  /**
    * @param {number} near - Near plane distance.
    * @param {number} far - Far plane distance.
    * @private
    */
  /* private */ var _setClipPlanes: Any = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var _spaceType: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var _type: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _width: Any = js.native
  
  /**
    * True if XR session is running.
    *
    * @type {boolean}
    */
  def active: Boolean = js.native
  
  /**
    * @type {AppBase}
    * @ignore
    */
  var app: AppBase = js.native
  
  /**
    * Active camera for which XR session is running or null.
    *
    * @type {Entity|null}
    */
  def camera: Entity = js.native
  
  /**
    * Provides access to depth sensing capabilities.
    *
    * @type {XrDepthSensing}
    * @ignore
    */
  var depthSensing: XrDepthSensing = js.native
  
  /**
    * Fired when availability of specific XR type is changed.
    *
    * @event XrManager#available
    * @param {string} type - The session type that has changed availability.
    * @param {boolean} available - True if specified session type is now available.
    * @example
    * app.xr.on('available', function (type, available) {
    *     console.log('"' + type + '" XR session is now ' + (available ? 'available' : 'unavailable'));
    * });
    */
  /**
    * Fired when availability of specific XR type is changed.
    *
    * @event XrManager#available:[type]
    * @param {boolean} available - True if specified session type is now available.
    * @example
    * app.xr.on('available:' + pc.XRTYPE_VR, function (available) {
    *     console.log('Immersive VR session is now ' + (available ? 'available' : 'unavailable'));
    * });
    */
  /**
    * Fired when XR session is started.
    *
    * @event XrManager#start
    * @example
    * app.xr.on('start', function () {
    *     // XR session has started
    * });
    */
  /**
    * Fired when XR session is ended.
    *
    * @event XrManager#end
    * @example
    * app.xr.on('end', function () {
    *     // XR session has ended
    * });
    */
  /**
    * Fired when XR session is updated, providing relevant XRFrame object.
    *
    * @event XrManager#update
    * @param {object} frame - [XRFrame](https://developer.mozilla.org/en-US/docs/Web/API/XRFrame)
    * object that can be used for interfacing directly with WebXR APIs.
    * @example
    * app.xr.on('update', function (frame) {
    *
    * });
    */
  /**
    * Fired when XR session is failed to start or failed to check for session type support.
    *
    * @event XrManager#error
    * @param {Error} error - Error object related to failure of session start or check of session
    * type support.
    * @example
    * app.xr.on('error', function (ex) {
    *     // XR session has failed to start, or failed to check for session type support
    * });
    */
  /**
    * Destroys the XrManager instance.
    *
    * @ignore
    */
  def destroy(): Unit = js.native
  
  /**
    * Provides access to DOM overlay capabilities.
    *
    * @type {XrDomOverlay}
    * @ignore
    */
  var domOverlay: XrDomOverlay = js.native
  
  /**
    * Attempts to end XR session and optionally fires callback when session is ended or failed to
    * end.
    *
    * @param {XrErrorCallback} [callback] - Optional callback function called once session is
    * started. The callback has one argument Error - it is null if successfully started XR
    * session.
    * @example
    * app.keyboard.on('keydown', function (evt) {
    *     if (evt.key === pc.KEY_ESCAPE && app.xr.active) {
    *         app.xr.end();
    *     }
    * });
    */
  def end(): Unit = js.native
  def end(callback: XrErrorCallback): Unit = js.native
  
  /**
    * Provides the ability to perform hit tests on the representation of real world geometry
    * of the underlying AR system.
    *
    * @type {XrHitTest}
    */
  var hitTest: XrHitTest = js.native
  
  /**
    * Provides access to image tracking capabilities.
    *
    * @type {XrImageTracking}
    * @ignore
    */
  var imageTracking: XrImageTracking = js.native
  
  /**
    * Provides access to Input Sources.
    *
    * @type {XrInput}
    */
  var input: XrInput = js.native
  
  /**
    * Check if specific type of session is available.
    *
    * @param {string} type - Session type. Can be one of the following:
    *
    * - {@link XRTYPE_INLINE}: Inline - always available type of session. It has limited features
    * availability and is rendered into HTML element.
    * - {@link XRTYPE_VR}: Immersive VR - session that provides exclusive access to VR device with
    * best available tracking features.
    * - {@link XRTYPE_AR}: Immersive AR - session that provides exclusive access to VR/AR device
    * that is intended to be blended with real-world environment.
    *
    * @example
    * if (app.xr.isAvailable(pc.XRTYPE_VR)) {
    *     // VR is available
    * }
    * @returns {boolean} True if specified session type is available.
    */
  def isAvailable(`type`: String): Boolean = js.native
  
  /**
    * Provides access to light estimation capabilities.
    *
    * @type {XrLightEstimation}
    * @ignore
    */
  var lightEstimation: XrLightEstimation = js.native
  
  /**
    * Provides access to plane detection capabilities.
    *
    * @type {XrPlaneDetection}
    * @ignore
    */
  var planeDetection: XrPlaneDetection = js.native
  
  /**
    * Provides access to XRSession of WebXR.
    *
    * @type {object|null}
    */
  def session: Any = js.native
  
  /**
    * Returns reference space type of currently running XR session or null if no session is
    * running. Can be any of XRSPACE_*.
    *
    * @type {string|null}
    */
  def spaceType: String = js.native
  
  /**
    * Attempts to start XR session for provided {@link CameraComponent} and optionally fires
    * callback when session is created or failed to create. Integrated XR APIs need to be enabled
    * by providing relevant options.
    *
    * @param {CameraComponent} camera - It will be used to render XR session and manipulated based
    * on pose tracking.
    * @param {string} type - Session type. Can be one of the following:
    *
    * - {@link XRTYPE_INLINE}: Inline - always available type of session. It has limited features
    * availability and is rendered into HTML element.
    * - {@link XRTYPE_VR}: Immersive VR - session that provides exclusive access to VR device with
    * best available tracking features.
    * - {@link XRTYPE_AR}: Immersive AR - session that provides exclusive access to VR/AR device
    * that is intended to be blended with real-world environment.
    *
    * @param {string} spaceType - Reference space type. Can be one of the following:
    *
    * - {@link XRSPACE_VIEWER}: Viewer - always supported space with some basic tracking
    * capabilities.
    * - {@link XRSPACE_LOCAL}: Local - represents a tracking space with a native origin near the
    * viewer at the time of creation. It is meant for seated or basic local XR sessions.
    * - {@link XRSPACE_LOCALFLOOR}: Local Floor - represents a tracking space with a native origin
    * at the floor in a safe position for the user to stand. The y axis equals 0 at floor level.
    * Floor level value might be estimated by the underlying platform. It is meant for seated or
    * basic local XR sessions.
    * - {@link XRSPACE_BOUNDEDFLOOR}: Bounded Floor - represents a tracking space with its native
    * origin at the floor, where the user is expected to move within a pre-established boundary.
    * - {@link XRSPACE_UNBOUNDED}: Unbounded - represents a tracking space where the user is
    * expected to move freely around their environment, potentially long distances from their
    * starting point.
    *
    * @param {object} [options] - Object with additional options for XR session initialization.
    * @param {string[]} [options.optionalFeatures] - Optional features for XRSession start. It is
    * used for getting access to additional WebXR spec extensions.
    * @param {boolean} [options.imageTracking] - Set to true to attempt to enable
    * {@link XrImageTracking}.
    * @param {boolean} [options.planeDetection] - Set to true to attempt to enable
    * {@link XrPlaneDetection}.
    * @param {XrErrorCallback} [options.callback] - Optional callback function called once session
    * is started. The callback has one argument Error - it is null if successfully started XR
    * session.
    * @param {object} [options.depthSensing] - Optional object with depth sensing parameters to
    * attempt to enable {@link XrDepthSensing}.
    * @param {string} [options.depthSensing.usagePreference] - Optional usage preference for depth
    * sensing, can be 'cpu-optimized' or 'gpu-optimized' (XRDEPTHSENSINGUSAGE_*), defaults to
    * 'cpu-optimized'. Most preferred and supported will be chosen by the underlying depth sensing
    * system.
    * @param {string} [options.depthSensing.dataFormatPreference] - Optional data format
    * preference for depth sensing, can be 'luminance-alpha' or 'float32'
    * (XRDEPTHSENSINGFORMAT_*), defaults to 'luminance-alpha'. Most preferred and supported will
    * be chosen by the underlying depth sensing system.
    * @example
    * button.on('click', function () {
    *     app.xr.start(camera, pc.XRTYPE_VR, pc.XRSPACE_LOCALFLOOR);
    * });
    * @example
    * button.on('click', function () {
    *     app.xr.start(camera, pc.XRTYPE_AR, pc.XRSPACE_LOCALFLOOR, {
    *         depthSensing: { }
    *     });
    * });
    */
  def start(camera: CameraComponent, `type`: String, spaceType: String): Unit = js.native
  def start(camera: CameraComponent, `type`: String, spaceType: String, options: Callback): Unit = js.native
  
  /**
    * True if XR is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
  
  /**
    * Returns type of currently running XR session or null if no session is running. Can be any of
    * XRTYPE_*.
    *
    * @type {string|null}
    */
  def `type`: String = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    *
    * @returns {boolean} True if update was successful, false otherwise.
    * @ignore
    */
  def update(frame: Any): Boolean = js.native
  
  /**
    * @type {Array<*>}
    * @ignore
    */
  var views: js.Array[Any] = js.native
  
  /**
    * @type {Array<*>}
    * @ignore
    */
  var viewsPool: js.Array[Any] = js.native
  
  /**
    * Indicates whether WebXR content is currently visible to the user, and if it is, whether it's
    * the primary focus. Can be 'hidden', 'visible' or 'visible-blurred'.
    *
    * @type {string}
    * @ignore
    */
  def visibilityState: String = js.native
}
