package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLogRoot extends Entity {
  /** Read-only. Nullable. */
  var directoryAudits: js.UndefOr[js.Array[DirectoryAudit]] = js.undefined
  var restrictedSignIns: js.UndefOr[js.Array[RestrictedSignIn]] = js.undefined
  /** Read-only. Nullable. */
  var signIns: js.UndefOr[js.Array[SignIn]] = js.undefined
}

object AuditLogRoot {
  @scala.inline
  def apply(
    directoryAudits: js.Array[DirectoryAudit] = null,
    id: java.lang.String = null,
    restrictedSignIns: js.Array[RestrictedSignIn] = null,
    signIns: js.Array[SignIn] = null
  ): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    if (directoryAudits != null) __obj.updateDynamic("directoryAudits")(directoryAudits)
    if (id != null) __obj.updateDynamic("id")(id)
    if (restrictedSignIns != null) __obj.updateDynamic("restrictedSignIns")(restrictedSignIns)
    if (signIns != null) __obj.updateDynamic("signIns")(signIns)
    __obj.asInstanceOf[AuditLogRoot]
  }
}

