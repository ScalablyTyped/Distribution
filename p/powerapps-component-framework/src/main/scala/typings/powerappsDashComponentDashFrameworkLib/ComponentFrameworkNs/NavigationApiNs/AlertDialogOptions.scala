package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for alert dialog options.
		 */
trait AlertDialogOptions extends js.Object {
  /**
  			 * Height of the alert dialog in pixels.
  			 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * Width of the alert dialog pixels.
  			 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AlertDialogOptions {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): AlertDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogOptions]
  }
}

