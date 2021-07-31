package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_number
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsGetDiscussionCommentLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_number
}
object TeamsGetDiscussionCommentLegacyRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): TeamsGetDiscussionCommentLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/discussions/:discussion_number/comments/:comment_number")
    __obj.asInstanceOf[TeamsGetDiscussionCommentLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class TeamsGetDiscussionCommentLegacyRequestOptionsMutableBuilder[Self <: TeamsGetDiscussionCommentLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_number
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
