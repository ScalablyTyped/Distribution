package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesUpdateCommentRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: PATCH
  
  var request: RequestRequestOptions
  
  var url: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_id
}
object IssuesUpdateCommentRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): IssuesUpdateCommentRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "PATCH", request = request.asInstanceOf[js.Any], url = "/repos/:owner/:repo/issues/comments/:comment_id")
    __obj.asInstanceOf[IssuesUpdateCommentRequestOptions]
  }
  
  @scala.inline
  implicit class IssuesUpdateCommentRequestOptionsMutableBuilder[Self <: IssuesUpdateCommentRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_id): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
