package typings.offlineJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineChecks extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[OfflineCheck] = js.undefined
  // TODO "xhr" and "image" probably have different options.
  // However, this is not stated in the project documentation.
  var xhr: js.UndefOr[OfflineCheck] = js.undefined
}

object OfflineChecks {
  @scala.inline
  def apply(active: String = null, image: OfflineCheck = null, xhr: OfflineCheck = null): OfflineChecks = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineChecks]
  }
}

