package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsUpdateImportEndpoint extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[String] = js.native
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[String] = js.native
}

object MigrationsUpdateImportEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportEndpoint]
  }
  @scala.inline
  implicit class MigrationsUpdateImportEndpointOps[Self <: MigrationsUpdateImportEndpoint] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setVcs_password(value: String): Self = this.set("vcs_password", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcs_password: Self = this.set("vcs_password", js.undefined)
    @scala.inline
    def setVcs_username(value: String): Self = this.set("vcs_username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcs_username: Self = this.set("vcs_username", js.undefined)
  }
  
}

