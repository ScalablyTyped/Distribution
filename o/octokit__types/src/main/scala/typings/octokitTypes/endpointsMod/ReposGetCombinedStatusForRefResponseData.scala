package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetCombinedStatusForRefResponseData extends StObject {
  
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
  implicit class ReposGetCombinedStatusForRefResponseDataMutableBuilder[Self <: ReposGetCombinedStatusForRefResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses(value: js.Array[Context]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: Context*): Self = StObject.set(x, "statuses", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
