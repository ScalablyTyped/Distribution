package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForOrgEndpoint extends js.Object {
  var migration_id: Double
  var org: String
  var repo_name: String
}

object MigrationsUnlockRepoForOrgEndpoint {
  @scala.inline
  def apply(migration_id: Double, org: String, repo_name: String): MigrationsUnlockRepoForOrgEndpoint = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, org = org, repo_name = repo_name)
  
    __obj.asInstanceOf[MigrationsUnlockRepoForOrgEndpoint]
  }
}

