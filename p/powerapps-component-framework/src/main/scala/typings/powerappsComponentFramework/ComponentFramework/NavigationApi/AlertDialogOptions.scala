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
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): AlertDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertDialogOptions]
  }
}

