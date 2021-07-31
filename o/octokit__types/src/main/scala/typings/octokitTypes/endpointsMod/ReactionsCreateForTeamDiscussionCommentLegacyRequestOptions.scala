package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
}
object ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions")
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionCommentLegacyRequestOptionsMutableBuilder[Self <: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
