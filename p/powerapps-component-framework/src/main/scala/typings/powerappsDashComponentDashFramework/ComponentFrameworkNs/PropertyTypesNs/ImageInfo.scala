package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyTypesNs

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
  var Tooltip: String
  /**
  			 * The Url of the conditional image.
  			 */
  var Url: String
}

object ImageInfo {
  @scala.inline
  def apply(Tooltip: String, Url: String): ImageInfo = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip, Url = Url)
  
    __obj.asInstanceOf[ImageInfo]
  }
}

