package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Light Estimation provides illumination data from the real world, which is estimated by the
  * underlying AR system. It provides a reflection Cube Map, that represents the reflection
  * estimation from the viewer position. A more simplified approximation of light is provided by L2
  * Spherical Harmonics data. And the most simple level of light estimation is the most prominent
  * directional light, its rotation, intensity and color.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrLightEstimation")
@js.native
open class XrLightEstimation protected () extends EventHandler {
  /**
    * Create a new XrLightEstimation instance.
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
    * @type {Color}
    * @private
    */
  /* private */ var _color: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _intensity: Any = js.native
  
  /**
    * @type {XRLightProbe|null}
    * @private
    */
  /* private */ var _lightProbe: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _lightProbeRequested: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /**
    * Fired when light estimation data becomes available.
    *
    * @event XrLightEstimation#available
    */
  /**
    * Fired when light estimation has failed to start.
    *
    * @event XrLightEstimation#error
    * @param {Error} error - Error object related to failure of light estimation start.
    * @example
    * app.xr.lightEstimation.on('error', function (ex) {
    *     // has failed to start
    * });
    */
  /** @private */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _rotation: Any = js.native
  
  /**
    * @type {Float32Array}
    * @private
    */
  /* private */ var _sphericalHarmonics: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  /**
    * True if estimated light information is available.
    *
    * @type {boolean}
    * @example
    * if (app.xr.lightEstimation.available) {
    *     entity.light.intensity = app.xr.lightEstimation.intensity;
    * }
    */
  def available: Boolean = js.native
  
  /**
    * Color of what is estimated to be the most prominent directional light. Or null if data is
    * not available.
    *
    * @type {Color|null}
    */
  def color: Color = js.native
  
  /**
    * End estimation of illumination data.
    */
  def end(): Unit = js.native
  
  /**
    * Intensity of what is estimated to be the most prominent directional light. Or null if data
    * is not available.
    *
    * @type {number|null}
    */
  def intensity: Double = js.native
  
  /**
    * Rotation of what is estimated to be the most prominent directional light. Or null if data is
    * not available.
    *
    * @type {Quat|null}
    */
  def rotation: Quat = js.native
  
  /**
    * Spherical harmonics coefficients of what is estimated to be the most prominent directional
    * light. Or null if data is not available.
    *
    * @type {Float32Array|null}
    * @ignore
    */
  def sphericalHarmonics: js.typedarray.Float32Array = js.native
  
  /**
    * Start estimation of illumination data. Availability of such data will come later and an
    * `available` event will be fired. If it failed to start estimation, an `error` event will be
    * fired.
    *
    * @example
    * app.xr.on('start', function () {
    *     if (app.xr.lightEstimation.supported) {
    *         app.xr.lightEstimation.start();
    *     }
    * });
    */
  def start(): Unit = js.native
  
  /**
    * True if Light Estimation is supported. This information is available only during an active AR
    * session.
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
