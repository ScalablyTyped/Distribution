package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.DeviceApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface of input argument 'options' in context.device.captureImage
		 */
trait CaptureImageOptions extends js.Object {
  /**
  			 * Indicates whether to edit the image before saving.
  			 */
  var allowEdit: scala.Boolean
  /**
  			 * Height of the image to capture.
  			 */
  var height: scala.Double
  /**
  			 * Indicates whether to capture image using the front camera of the device.
  			 */
  var preferFrontCamera: scala.Boolean
  /**
  			 * Quality of the image file in percentage.
  			 */
  var quality: scala.Double
  /**
  			 * Width of the image to capture.
  			 */
  var width: scala.Double
}

object CaptureImageOptions {
  @scala.inline
  def apply(
    allowEdit: scala.Boolean,
    height: scala.Double,
    preferFrontCamera: scala.Boolean,
    quality: scala.Double,
    width: scala.Double
  ): CaptureImageOptions = {
    val __obj = js.Dynamic.literal(allowEdit = allowEdit, height = height, preferFrontCamera = preferFrontCamera, quality = quality, width = width)
  
    __obj.asInstanceOf[CaptureImageOptions]
  }
}

