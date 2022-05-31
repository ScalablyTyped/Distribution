package typings.openlayers.global.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object has {
  
  /**
    * True if both the library and browser support Canvas.  Always `false`
    * if `ol.ENABLE_CANVAS` is set to `false` at compile time.
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.CANVAS")
  @js.native
  val CANVAS: Boolean = js.native
  
  /**
    * Indicates if DeviceOrientation is supported in the user's browser.
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.DEVICE_ORIENTATION")
  @js.native
  val DEVICE_ORIENTATION: Boolean = js.native
  
  /**
    * The ratio between physical pixels and device-independent pixels
    * (dips) on the device (`window.devicePixelRatio`).
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.DEVICE_PIXEL_RATIO")
  @js.native
  val DEVICE_PIXEL_RATIO: Double = js.native
  
  /**
    * Is HTML5 geolocation supported in the current browser?
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.GEOLOCATION")
  @js.native
  val GEOLOCATION: Boolean = js.native
  
  /**
    * True if browser supports touch events.
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.TOUCH")
  @js.native
  val TOUCH: Boolean = js.native
  
  /**
    * True if both OpenLayers and browser support WebGL.  Always `false`
    * if `ol.ENABLE_WEBGL` is set to `false` at compile time.
    * @const
    * @api stable
    */
  @JSGlobal("ol.has.WEBGL")
  @js.native
  val WEBGL: Boolean = js.native
}
