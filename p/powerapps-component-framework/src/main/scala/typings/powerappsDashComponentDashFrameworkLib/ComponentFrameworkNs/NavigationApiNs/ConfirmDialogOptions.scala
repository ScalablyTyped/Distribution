package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for confirm dialog options.
		 */
trait ConfirmDialogOptions extends js.Object {
  /**
  			 * Height of the confirmation dialog in pixels.
  			 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  			 *  Width of the confirmation dialog pixels.
  			 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ConfirmDialogOptions {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): ConfirmDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogOptions]
  }
}

