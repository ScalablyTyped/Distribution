package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppStatusRaw extends ManagedAppStatus {
  // Status report content.
  var content: js.UndefOr[js.Any] = js.undefined
}

object ManagedAppStatusRaw {
  @scala.inline
  def apply(content: js.Any = null, displayName: String = null, id: String = null, version: String = null): ManagedAppStatusRaw = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppStatusRaw]
  }
}

