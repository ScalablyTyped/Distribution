package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsListForTeamDiscussionCommentInOrgRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: GET
  
  var request: RequestRequestOptions
  
  var url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
}
object ReactionsListForTeamDiscussionCommentInOrgRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReactionsListForTeamDiscussionCommentInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "GET", request = request.asInstanceOf[js.Any], url = "/orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions")
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentInOrgRequestOptions]
  }
  
  @scala.inline
  implicit class ReactionsListForTeamDiscussionCommentInOrgRequestOptionsMutableBuilder[Self <: ReactionsListForTeamDiscussionCommentInOrgRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
