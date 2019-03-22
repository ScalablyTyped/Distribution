package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The structure returned by getCellImageInfo and propagated down to the control to display conditional images.
		 */
trait ImageInfo extends js.Object {
  /**
  			 * The tooltip associated with that image.
  			 */
  var Tooltip: java.lang.String
  /**
  			 * The Url of the conditional image.
  			 */
  var Url: java.lang.String
}

object ImageInfo {
  @scala.inline
  def apply(Tooltip: java.lang.String, Url: java.lang.String): ImageInfo = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip, Url = Url)
  
    __obj.asInstanceOf[ImageInfo]
  }
}

