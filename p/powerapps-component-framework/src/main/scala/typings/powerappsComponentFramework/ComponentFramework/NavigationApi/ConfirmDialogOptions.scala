package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

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
  var height: js.UndefOr[Double] = js.undefined
  /**
  			 *  Width of the confirmation dialog pixels.
  			 */
  var width: js.UndefOr[Double] = js.undefined
}

object ConfirmDialogOptions {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): ConfirmDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogOptions]
  }
}

