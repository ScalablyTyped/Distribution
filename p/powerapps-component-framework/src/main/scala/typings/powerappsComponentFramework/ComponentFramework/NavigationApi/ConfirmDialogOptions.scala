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
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): ConfirmDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogOptions]
  }
}

