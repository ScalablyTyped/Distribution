package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
}

object MigrationsGetStatusForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsGetStatusForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetStatusForOrgParams]
  }
}

