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
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppStatusRaw]
  }
}

