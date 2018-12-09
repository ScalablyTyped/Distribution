package typings
package olLib.deviceorientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/deviceorientation", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.DeviceOrientation {
  /**
       * @classdesc
       * The ol.DeviceOrientation class provides access to information from
       * DeviceOrientation events.  See the [HTML 5 DeviceOrientation Specification](
       * http://www.w3.org/TR/orientation-event/) for more details.
       *
       * Many new computers, and especially mobile phones
       * and tablets, provide hardware support for device orientation. Web
       * developers targeting mobile devices will be especially interested in this
       * class.
       *
       * Device orientation data are relative to a common starting point. For mobile
       * devices, the starting point is to lay your phone face up on a table with the
       * top of the phone pointing north. This represents the zero state. All
       * angles are then relative to this state. For computers, it is the same except
       * the screen is open at 90 degrees.
       *
       * Device orientation is reported as three angles - `alpha`, `beta`, and
       * `gamma` - relative to the starting position along the three planar axes X, Y
       * and Z. The X axis runs from the left edge to the right edge through the
       * middle of the device. Similarly, the Y axis runs from the bottom to the top
       * of the device through the middle. The Z axis runs from the back to the front
       * through the middle. In the starting position, the X axis points to the
       * right, the Y axis points away from you and the Z axis points straight up
       * from the device lying flat.
       *
       * The three angles representing the device orientation are relative to the
       * three axes. `alpha` indicates how much the device has been rotated around the
       * Z axis, which is commonly interpreted as the compass heading (see note
       * below). `beta` indicates how much the device has been rotated around the X
       * axis, or how much it is tilted from front to back.  `gamma` indicates how
       * much the device has been rotated around the Y axis, or how much it is tilted
       * from left to right.
       *
       * For most browsers, the `alpha` value returns the compass heading so if the
       * device points north, it will be 0.  With Safari on iOS, the 0 value of
       * `alpha` is calculated from when device orientation was first requested.
       * ol.DeviceOrientation provides the `heading` property which normalizes this
       * behavior across all browsers for you.
       *
       * It is important to note that the HTML 5 DeviceOrientation specification
       * indicates that `alpha`, `beta` and `gamma` are in degrees while the
       * equivalent properties in ol.DeviceOrientation are in radians for consistency
       * with all other uses of angles throughout OpenLayers.
       *
       * To get notified of device orientation changes, register a listener for the
       * generic `change` event on your `ol.DeviceOrientation` instance.
       *
       * @see {@link http://www.w3.org/TR/orientation-event/}
       *
       * @param opt_options Options.
       * @api
       */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.DeviceOrientationOptions) = this()
}

