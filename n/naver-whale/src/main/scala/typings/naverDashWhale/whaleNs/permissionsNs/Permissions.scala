package typings.naverDashWhale.whaleNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  /**
    * Optional.
    * List of named permissions (does not include hosts or origins). Anything listed here must appear in the optional_permissions list in the manifest.
    */
  var origins: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional.
    * List of origin permissions. Anything listed here must be a subset of a host that appears in the optional_permissions list in the manifest. For example, if http:// *.example.com/ or http:// * appears in optional_permissions, you can request an origin of http://help.example.com/. Any path is ignored.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object Permissions {
  @scala.inline
  def apply(origins: js.Array[String] = null, permissions: js.Array[String] = null): Permissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Permissions]
  }
}

