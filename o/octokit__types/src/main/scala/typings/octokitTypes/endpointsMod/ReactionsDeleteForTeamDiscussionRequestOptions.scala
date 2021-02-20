package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactionsSlashColonreaction_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactionsDeleteForTeamDiscussionRequestOptions extends StObject {
  
  var headers: RequestHeaders = js.native
  
  var method: DELETE = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactionsSlashColonreaction_id = js.native
}
object ReactionsDeleteForTeamDiscussionRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactionsSlashColonreaction_id
  ): ReactionsDeleteForTeamDiscussionRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionRequestOptions]
  }
  
  @scala.inline
  implicit class ReactionsDeleteForTeamDiscussionRequestOptionsMutableBuilder[Self <: ReactionsDeleteForTeamDiscussionRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactionsSlashColonreaction_id
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
