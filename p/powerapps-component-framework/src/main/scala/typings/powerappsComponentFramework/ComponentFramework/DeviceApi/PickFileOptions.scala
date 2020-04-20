package typings.powerappsComponentFramework.ComponentFramework.DeviceApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface of input argument 'pickupFileOption' in context.device.pickupFile
		 */
trait PickFileOptions extends js.Object {
  /**
  			 * Image file types to select. Valid values are "audio", "video", or "image".
  			 */
  var accept: String
  /**
  			 * Indicates whether to allow selecting multiple files.
  			 */
  var allowMultipleFiles: Boolean
  /**
  			 * Maximum size of the files(s) to be selected.
  			 */
  var maximumAllowedFileSize: Double
}

object PickFileOptions {
  @scala.inline
  def apply(accept: String, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileOptions]
  }
}

