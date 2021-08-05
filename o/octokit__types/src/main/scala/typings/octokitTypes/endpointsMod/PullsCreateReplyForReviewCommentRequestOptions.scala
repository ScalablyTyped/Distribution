package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommentsSlashColoncomment_idSlashreplies
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsCreateReplyForReviewCommentRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommentsSlashColoncomment_idSlashreplies
}
object PullsCreateReplyForReviewCommentRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): PullsCreateReplyForReviewCommentRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/pulls/:pull_number/comments/:comment_id/replies")
    __obj.asInstanceOf[PullsCreateReplyForReviewCommentRequestOptions]
  }
  
  extension [Self <: PullsCreateReplyForReviewCommentRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommentsSlashColoncomment_idSlashreplies
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
