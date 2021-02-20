package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSessionsResponse extends StObject {
  
  /** `next_page_token` can be sent in a subsequent ListSessions call to fetch more of the matching sessions. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of requested sessions. */
  var sessions: js.UndefOr[js.Array[Session]] = js.native
}
object ListSessionsResponse {
  
  @scala.inline
  def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  
  @scala.inline
  implicit class ListSessionsResponseMutableBuilder[Self <: ListSessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSessions(value: js.Array[Session]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value :_*))
  }
}
