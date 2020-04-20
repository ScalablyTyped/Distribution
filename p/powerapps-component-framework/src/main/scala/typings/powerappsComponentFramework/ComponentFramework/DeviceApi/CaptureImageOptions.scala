package typings.powerappsComponentFramework.ComponentFramework.DeviceApi

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
  var allowEdit: Boolean
  /**
  			 * Height of the image to capture.
  			 */
  var height: Double
  /**
  			 * Indicates whether to capture image using the front camera of the device.
  			 */
  var preferFrontCamera: Boolean
  /**
  			 * Quality of the image file in percentage.
  			 */
  var quality: Double
  /**
  			 * Width of the image to capture.
  			 */
  var width: Double
}

object CaptureImageOptions {
  @scala.inline
  def apply(allowEdit: Boolean, height: Double, preferFrontCamera: Boolean, quality: Double, width: Double): CaptureImageOptions = {
    val __obj = js.Dynamic.literal(allowEdit = allowEdit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preferFrontCamera = preferFrontCamera.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureImageOptions]
  }
}

