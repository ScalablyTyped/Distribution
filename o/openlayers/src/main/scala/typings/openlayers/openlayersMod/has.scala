package typings.openlayers.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "has")
@js.native
object has extends js.Object {
  /**
    * True if both the library and browser support Canvas.  Always `false`
    * if `ol.ENABLE_CANVAS` is set to `false` at compile time.
    * @const
    * @api stable
    */
  val CANVAS: Boolean = js.native
  /**
    * Indicates if DeviceOrientation is supported in the user's browser.
    * @const
    * @api stable
    */
  val DEVICE_ORIENTATION: Boolean = js.native
  /**
    * The ratio between physical pixels and device-independent pixels
    * (dips) on the device (`window.devicePixelRatio`).
    * @const
    * @api stable
    */
  val DEVICE_PIXEL_RATIO: Double = js.native
  /**
    * Is HTML5 geolocation supported in the current browser?
    * @const
    * @api stable
    */
  val GEOLOCATION: Boolean = js.native
  /**
    * True if browser supports touch events.
    * @const
    * @api stable
    */
  val TOUCH: Boolean = js.native
  /**
    * True if both OpenLayers and browser support WebGL.  Always `false`
    * if `ol.ENABLE_WEBGL` is set to `false` at compile time.
    * @const
    * @api stable
    */
  val WEBGL: Boolean = js.native
}

