package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetArchiveForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
}

object MigrationsGetArchiveForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsGetArchiveForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetArchiveForOrgParams]
  }
}

