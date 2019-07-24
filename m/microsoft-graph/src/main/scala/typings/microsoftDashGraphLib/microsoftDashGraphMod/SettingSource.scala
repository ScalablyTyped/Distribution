package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingSource extends js.Object {
  // Not yet documented
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object SettingSource {
  @scala.inline
  def apply(displayName: java.lang.String = null, id: java.lang.String = null): SettingSource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[SettingSource]
  }
}

