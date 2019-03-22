package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for OpenUrl options.
		 */
trait OpenUrlOptions extends js.Object {
  /**
  			 * Height of the window to display the resultant page in pixels.
  			 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * Width of the window to display the resultant page in pixels.
  			 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object OpenUrlOptions {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): OpenUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlOptions]
  }
}

