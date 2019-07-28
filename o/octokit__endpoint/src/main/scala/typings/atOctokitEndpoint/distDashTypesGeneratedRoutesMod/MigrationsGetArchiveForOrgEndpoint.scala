package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetArchiveForOrgEndpoint extends js.Object {
  var migration_id: Double
  var org: String
}

object MigrationsGetArchiveForOrgEndpoint {
  @scala.inline
  def apply(migration_id: Double, org: String): MigrationsGetArchiveForOrgEndpoint = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, org = org)
  
    __obj.asInstanceOf[MigrationsGetArchiveForOrgEndpoint]
  }
}

