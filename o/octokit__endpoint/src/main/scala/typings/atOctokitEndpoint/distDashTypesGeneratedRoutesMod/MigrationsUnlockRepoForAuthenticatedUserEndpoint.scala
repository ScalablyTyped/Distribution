package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForAuthenticatedUserEndpoint extends js.Object {
  var migration_id: Double
  var repo_name: String
}

object MigrationsUnlockRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, repo_name = repo_name)
  
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
}

