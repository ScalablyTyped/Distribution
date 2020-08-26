package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposRemoveUserAccessRestrictionsEndpoint extends js.Object {
  var branch: String = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * users parameter
    */
  var users: js.Array[String] = js.native
}

object ReposRemoveUserAccessRestrictionsEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposRemoveUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveUserAccessRestrictionsEndpoint]
  }
  @scala.inline
  implicit class ReposRemoveUserAccessRestrictionsEndpointOps[Self <: ReposRemoveUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

