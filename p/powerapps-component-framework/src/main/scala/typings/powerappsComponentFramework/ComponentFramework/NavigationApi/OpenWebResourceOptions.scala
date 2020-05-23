package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for OpenWebResource options.
  */
trait OpenWebResourceOptions extends js.Object {
  /**
    * Height of the window to display the resultant page in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to open the web resource in a new window.
    */
  var openInNewWindow: Boolean
  /**
    * Width of the window to display the resultant page in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object OpenWebResourceOptions {
  @scala.inline
  def apply(
    openInNewWindow: Boolean,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): OpenWebResourceOptions = {
    val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWebResourceOptions]
  }
}

