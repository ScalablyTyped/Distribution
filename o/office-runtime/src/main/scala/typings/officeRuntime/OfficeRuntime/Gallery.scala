package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent an individual gallery control.
  * @beta
  */
trait Gallery extends Control {
  /**
    * Used to refresh a gallery control including optional data to be passed to the gallery control at the time of refresh action.
    */
  var refreshData: js.UndefOr[js.Object] = js.undefined
}

object Gallery {
  @scala.inline
  def apply(id: String, enabled: js.UndefOr[Boolean] = js.undefined, refreshData: js.Object = null): Gallery = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (refreshData != null) __obj.updateDynamic("refreshData")(refreshData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gallery]
  }
}

