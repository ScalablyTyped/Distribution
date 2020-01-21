package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingSource extends js.Object {
  // Not yet documented
  var displayName: js.UndefOr[String] = js.undefined
  // Not yet documented
  var id: js.UndefOr[String] = js.undefined
}

object SettingSource {
  @scala.inline
  def apply(displayName: String = null, id: String = null): SettingSource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingSource]
  }
}

