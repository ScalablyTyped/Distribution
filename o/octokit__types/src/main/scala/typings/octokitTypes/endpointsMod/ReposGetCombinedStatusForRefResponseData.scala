package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetCombinedStatusForRefResponseData extends js.Object {
  
  var commit_url: String = js.native
  
  var repository: Archiveurl = js.native
  
  var sha: String = js.native
  
  var state: String = js.native
  
  var statuses: js.Array[Context] = js.native
  
  var total_count: Double = js.native
  
  var url: String = js.native
}
object ReposGetCombinedStatusForRefResponseData {
  
  @scala.inline
  def apply(
    commit_url: String,
    repository: Archiveurl,
    sha: String,
    state: String,
    statuses: js.Array[Context],
    total_count: Double,
    url: String
  ): ReposGetCombinedStatusForRefResponseData = {
    val __obj = js.Dynamic.literal(commit_url = commit_url.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponseData]
  }
  
  @scala.inline
  implicit class ReposGetCombinedStatusForRefResponseDataOps[Self <: ReposGetCombinedStatusForRefResponseData] (val x: Self) extends AnyVal {
    
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
    def setCommit_url(value: String): Self = this.set("commit_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: Context*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[Context]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
