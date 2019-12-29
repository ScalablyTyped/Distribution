package typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to modify default `edit` and `window` MenuItems in Mac.
  */
trait CreateMacBuiltinOption extends js.Object {
  /**
    * {Boolean} (Optional) do not populate the Edit menu
    */
  var hideEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * {Boolean} (Optional) do not populate the Window menu
    */
  var hideWindow: js.UndefOr[Boolean] = js.undefined
}

object CreateMacBuiltinOption {
  @scala.inline
  def apply(hideEdit: js.UndefOr[Boolean] = js.undefined, hideWindow: js.UndefOr[Boolean] = js.undefined): CreateMacBuiltinOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideEdit)) __obj.updateDynamic("hideEdit")(hideEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWindow)) __obj.updateDynamic("hideWindow")(hideWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMacBuiltinOption]
  }
}

