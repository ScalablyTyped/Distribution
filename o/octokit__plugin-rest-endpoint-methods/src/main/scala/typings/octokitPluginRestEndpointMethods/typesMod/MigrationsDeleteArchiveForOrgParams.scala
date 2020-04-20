package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsDeleteArchiveForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
}

object MigrationsDeleteArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsDeleteArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsDeleteArchiveForOrgParams]
  }
}

