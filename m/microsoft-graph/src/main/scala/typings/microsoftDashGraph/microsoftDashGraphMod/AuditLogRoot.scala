package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLogRoot extends Entity {
  // Read-only. Nullable.
  var directoryAudits: js.UndefOr[js.Array[DirectoryAudit]] = js.undefined
  var restrictedSignIns: js.UndefOr[js.Array[RestrictedSignIn]] = js.undefined
  // Read-only. Nullable.
  var signIns: js.UndefOr[js.Array[SignIn]] = js.undefined
}

object AuditLogRoot {
  @scala.inline
  def apply(
    directoryAudits: js.Array[DirectoryAudit] = null,
    id: String = null,
    restrictedSignIns: js.Array[RestrictedSignIn] = null,
    signIns: js.Array[SignIn] = null
  ): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    if (directoryAudits != null) __obj.updateDynamic("directoryAudits")(directoryAudits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (restrictedSignIns != null) __obj.updateDynamic("restrictedSignIns")(restrictedSignIns.asInstanceOf[js.Any])
    if (signIns != null) __obj.updateDynamic("signIns")(signIns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLogRoot]
  }
}

