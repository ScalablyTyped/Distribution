package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForOrgEndpoint extends js.Object {
  var migration_id: scala.Double
  var org: java.lang.String
  var repo_name: java.lang.String
}

object MigrationsUnlockRepoForOrgEndpoint {
  @scala.inline
  def apply(migration_id: scala.Double, org: java.lang.String, repo_name: java.lang.String): MigrationsUnlockRepoForOrgEndpoint = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, org = org, repo_name = repo_name)
  
    __obj.asInstanceOf[MigrationsUnlockRepoForOrgEndpoint]
  }
}

