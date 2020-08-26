package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsGetStatusForAuthenticatedUserResponseData extends js.Object {
  var created_at: String = js.native
  var exclude_attachments: Boolean = js.native
  var guid: String = js.native
  var id: Double = js.native
  var lock_repositories: Boolean = js.native
  var owner: Avatarurl = js.native
  var repositories: js.Array[Allowmergecommit] = js.native
  var state: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object MigrationsGetStatusForAuthenticatedUserResponseData {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: Avatarurl,
    repositories: js.Array[Allowmergecommit],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsGetStatusForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForAuthenticatedUserResponseData]
  }
  @scala.inline
  implicit class MigrationsGetStatusForAuthenticatedUserResponseDataOps[Self <: MigrationsGetStatusForAuthenticatedUserResponseData] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclude_attachments(value: Boolean): Self = this.set("exclude_attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLock_repositories(value: Boolean): Self = this.set("lock_repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: Avatarurl): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoriesVarargs(value: Allowmergecommit*): Self = this.set("repositories", js.Array(value :_*))
    @scala.inline
    def setRepositories(value: js.Array[Allowmergecommit]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

