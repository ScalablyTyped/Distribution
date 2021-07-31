package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListPullRequestsAssociatedWithCommitRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls
}
object ReposListPullRequestsAssociatedWithCommitRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposListPullRequestsAssociatedWithCommitRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/commits/:commit_sha/pulls")
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitRequestOptions]
  }
  
  @scala.inline
  implicit class ReposListPullRequestsAssociatedWithCommitRequestOptionsMutableBuilder[Self <: ReposListPullRequestsAssociatedWithCommitRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
