package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  migration_id  :number,   repo_name  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
trait MigrationsUnlockRepoForAuthenticatedUserEndpoint extends js.Object {
  var mediaType: `7`
  var migration_id: Double
  var repo_name: String
}

object MigrationsUnlockRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(mediaType: `7`, migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
}

