package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual menu item whose state is set with the call to `requestUpdate`.
  * @beta
  */
trait MenuControl extends js.Object {
  /**
    * Indicates whether the menu item should be enabled (default) or disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the menu item as specified in the manifest.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The position of the item in the menu.
    */
  var position: js.UndefOr[Double] = js.undefined
}

object MenuControl {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, id: String = null, position: Int | Double = null): MenuControl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuControl]
  }
}

