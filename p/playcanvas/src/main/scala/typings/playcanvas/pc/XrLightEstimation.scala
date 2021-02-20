package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new XrLightEstimation. Note that this is created internally by the {@link pc.XrManager}.
  * @property supported - True if Light Estimation is supported. This information is available only during an active AR session.
  * @property intensity - Intensity of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @property color - Color of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @property rotation - Rotation of what is estimated to be the most prominent directional light. Or null if data is not available.
  * @param manager - WebXR Manager.
  */
@js.native
trait XrLightEstimation extends EventHandler {
  
  /**
    * True if estimated light information is available.
    * @example
    * if (app.xr.lightEstimation.available) {
    *     entity.light.intensity = app.xr.lightEstimation.intensity;
    * }
    */
  var available: Boolean = js.native
  
  /**
    * Color of what is estimated to be the most prominent directional light. Or null if data is not available.
    */
  var color: Color | Null = js.native
  
  /**
    * End estimation of illumination data.
    */
  def end(): Unit = js.native
  
  /**
    * Intensity of what is estimated to be the most prominent directional light. Or null if data is not available.
    */
  var intensity: Double | Null = js.native
  
  /**
    * Rotation of what is estimated to be the most prominent directional light. Or null if data is not available.
    */
  var rotation: Quat | Null = js.native
  
  /**
    * Start estimation of illimunation data.
    * Availability of such data will come later and an `available` event will be fired.
    * If it failed to start estimation, an `error` event will be fired.
    * @example
    * app.xr.on('start', function () {
    *     if (app.xr.lightEstimation.supported) {
    *         app.xr.lightEstimation.start();
    *     }
    * });
    */
  def start(): Unit = js.native
  
  /**
    * True if Light Estimation is supported. This information is available only during an active AR session.
    */
  var supported: Boolean = js.native
}
