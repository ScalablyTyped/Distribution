package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for saving settings.
  */
trait SaveSettingsOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates whether the setting will be replaced if stale.
    */
  var overwriteIfStale: js.UndefOr[Boolean] = js.undefined
}

object SaveSettingsOptions {
  @scala.inline
  def apply(asyncContext: js.Any = null, overwriteIfStale: js.UndefOr[Boolean] = js.undefined): SaveSettingsOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    if (!js.isUndefined(overwriteIfStale)) __obj.updateDynamic("overwriteIfStale")(overwriteIfStale)
    __obj.asInstanceOf[SaveSettingsOptions]
  }
}

