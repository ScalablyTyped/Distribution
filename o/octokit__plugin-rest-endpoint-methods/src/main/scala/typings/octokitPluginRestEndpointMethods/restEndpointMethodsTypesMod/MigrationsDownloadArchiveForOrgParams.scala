package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsDownloadArchiveForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
}

object MigrationsDownloadArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsDownloadArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsDownloadArchiveForOrgParams]
  }
}

