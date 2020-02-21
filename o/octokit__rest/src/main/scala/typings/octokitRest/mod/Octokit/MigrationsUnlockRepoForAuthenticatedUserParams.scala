package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForAuthenticatedUserParams extends js.Object {
  var migration_id: Double
  var repo_name: String
}

object MigrationsUnlockRepoForAuthenticatedUserParams {
  @scala.inline
  def apply(migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserParams]
  }
}

