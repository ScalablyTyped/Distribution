package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_pull_request_reviews
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdatePullRequestReviewProtectionRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_pull_request_reviews
}
object ReposUpdatePullRequestReviewProtectionRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReposUpdatePullRequestReviewProtectionRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/branches/:branch/protection/required_pull_request_reviews")
    __obj.asInstanceOf[ReposUpdatePullRequestReviewProtectionRequestOptions]
  }
  
  @scala.inline
  implicit class ReposUpdatePullRequestReviewProtectionRequestOptionsMutableBuilder[Self <: ReposUpdatePullRequestReviewProtectionRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashreposSlashColonownerSlashColonrepoSlashbranchesSlashColonbranchSlashprotectionSlashrequired_pull_request_reviews
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
