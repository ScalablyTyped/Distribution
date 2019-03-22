package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.DeviceApiNs

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
  var accept: java.lang.String
  /**
  			 * Indicates whether to allow selecting multiple files.
  			 */
  var allowMultipleFiles: scala.Boolean
  /**
  			 * Maximum size of the files(s) to be selected.
  			 */
  var maximumAllowedFileSize: scala.Double
}

object PickFileOptions {
  @scala.inline
  def apply(accept: java.lang.String, allowMultipleFiles: scala.Boolean, maximumAllowedFileSize: scala.Double): PickFileOptions = {
    val __obj = js.Dynamic.literal(accept = accept, allowMultipleFiles = allowMultipleFiles, maximumAllowedFileSize = maximumAllowedFileSize)
  
    __obj.asInstanceOf[PickFileOptions]
  }
}

