package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForOrgParams extends js.Object {
  var migration_id: Double
  var org: String
  var repo_name: String
}

object MigrationsUnlockRepoForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org: String, repo_name: String): MigrationsUnlockRepoForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsUnlockRepoForOrgParams]
  }
}

