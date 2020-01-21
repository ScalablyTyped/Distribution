package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

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
  var height: js.UndefOr[Double] = js.undefined
  /**
  			 * Width of the alert dialog pixels.
  			 */
  var width: js.UndefOr[Double] = js.undefined
}

object AlertDialogOptions {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): AlertDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogOptions]
  }
}

