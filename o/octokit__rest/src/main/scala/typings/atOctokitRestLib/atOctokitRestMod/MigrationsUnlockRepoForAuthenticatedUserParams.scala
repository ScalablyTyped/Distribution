package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForAuthenticatedUserParams extends js.Object {
  var migration_id: scala.Double
  var repo_name: java.lang.String
}

object MigrationsUnlockRepoForAuthenticatedUserParams {
  @scala.inline
  def apply(migration_id: scala.Double, repo_name: java.lang.String): MigrationsUnlockRepoForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id, repo_name = repo_name)
  
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserParams]
  }
}

