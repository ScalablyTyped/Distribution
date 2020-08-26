package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListSelectedReposForOrgSecretResponseData extends js.Object {
  var repositories: js.Array[Archiveurl] = js.native
  var total_count: Double = js.native
}

object ActionsListSelectedReposForOrgSecretResponseData {
  @scala.inline
  def apply(repositories: js.Array[Archiveurl], total_count: Double): ActionsListSelectedReposForOrgSecretResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelectedReposForOrgSecretResponseData]
  }
  @scala.inline
  implicit class ActionsListSelectedReposForOrgSecretResponseDataOps[Self <: ActionsListSelectedReposForOrgSecretResponseData] (val x: Self) extends AnyVal {
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
    def setRepositoriesVarargs(value: Archiveurl*): Self = this.set("repositories", js.Array(value :_*))
    @scala.inline
    def setRepositories(value: js.Array[Archiveurl]): Self = this.set("repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

