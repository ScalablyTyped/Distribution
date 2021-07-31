package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsCreateForTeamDiscussionLegacyRequestOptions extends StObject {
  
  var headers: RequestHeaders
  
  var method: POST
  
  var request: RequestRequestOptions
  
  var url: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions
}
object ReactionsCreateForTeamDiscussionLegacyRequestOptions {
  
  @scala.inline
  def apply(headers: RequestHeaders, request: RequestRequestOptions): ReactionsCreateForTeamDiscussionLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = "POST", request = request.asInstanceOf[js.Any], url = "/teams/:team_id/discussions/:discussion_number/reactions")
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionLegacyRequestOptions]
  }
  
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionLegacyRequestOptionsMutableBuilder[Self <: ReactionsCreateForTeamDiscussionLegacyRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
