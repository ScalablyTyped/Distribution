package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsListForTeamDiscussionCommentLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
}
object ReactionsListForTeamDiscussionCommentLegacyRequestOptions {
  
  inline def apply(headers: RequestHeaders, request: RequestRequestOptions): ReactionsListForTeamDiscussionCommentLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions")
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentLegacyRequestOptions]
  }
  
  extension [Self <: ReactionsListForTeamDiscussionCommentLegacyRequestOptions](x: Self) {
    
    inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
