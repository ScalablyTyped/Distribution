package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

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
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Width of the window to display the resultant page in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object OpenUrlOptions {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): OpenUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlOptions]
  }
}

