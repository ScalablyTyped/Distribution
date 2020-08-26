package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposTransferEndpoint extends js.Object {
  /**
    * **Required:** The username or organization name the repository will be transferred to.
    */
  var new_owner: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.native
}

object ReposTransferEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposTransferEndpoint]
  }
  @scala.inline
  implicit class ReposTransferEndpointOps[Self <: ReposTransferEndpoint] (val x: Self) extends AnyVal {
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
    def setNew_owner(value: String): Self = this.set("new_owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_owner: Self = this.set("new_owner", js.undefined)
    @scala.inline
    def setTeam_idsVarargs(value: Double*): Self = this.set("team_ids", js.Array(value :_*))
    @scala.inline
    def setTeam_ids(value: js.Array[Double]): Self = this.set("team_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam_ids: Self = this.set("team_ids", js.undefined)
  }
  
}

