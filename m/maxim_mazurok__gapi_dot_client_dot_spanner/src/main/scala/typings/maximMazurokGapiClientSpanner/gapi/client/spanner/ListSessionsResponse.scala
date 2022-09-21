package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSessionsResponse extends StObject {
  
  /** `next_page_token` can be sent in a subsequent ListSessions call to fetch more of the matching sessions. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of requested sessions. */
  var sessions: js.UndefOr[js.Array[Session]] = js.undefined
}
object ListSessionsResponse {
  
  inline def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  
  extension [Self <: ListSessionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessions(value: js.Array[Session]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value*))
  }
}
