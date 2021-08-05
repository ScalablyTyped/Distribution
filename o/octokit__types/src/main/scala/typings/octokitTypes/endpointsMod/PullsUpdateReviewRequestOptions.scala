package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsUpdateReviewRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PUT
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_id
}
object PullsUpdateReviewRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): PullsUpdateReviewRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PUT", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/pulls/:pull_number/reviews/:review_id")
    __obj.asInstanceOf[PullsUpdateReviewRequestOptions]
  }
  
  extension [Self <: PullsUpdateReviewRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_id
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
