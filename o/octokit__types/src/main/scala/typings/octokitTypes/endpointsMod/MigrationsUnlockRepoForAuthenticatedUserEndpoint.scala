package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  migration_id :number,   repo_name :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsUnlockRepoForAuthenticatedUserEndpoint extends js.Object {
  var mediaType: `9` = js.native
  var migration_id: Double = js.native
  var repo_name: String = js.native
}

object MigrationsUnlockRepoForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(mediaType: `9`, migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class MigrationsUnlockRepoForAuthenticatedUserEndpointOps[Self <: MigrationsUnlockRepoForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaType(value: `9`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMigration_id(value: Double): Self = this.set("migration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo_name(value: String): Self = this.set("repo_name", value.asInstanceOf[js.Any])
  }
  
}

