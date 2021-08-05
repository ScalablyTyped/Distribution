package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateSessionsResponse extends StObject {
  
  /** The freshly created sessions. */
  var session: js.UndefOr[js.Array[Session]] = js.undefined
}
object BatchCreateSessionsResponse {
  
  inline def apply(): BatchCreateSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsResponse]
  }
  
  extension [Self <: BatchCreateSessionsResponse](x: Self) {
    
    inline def setSession(value: js.Array[Session]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionVarargs(value: Session*): Self = StObject.set(x, "session", js.Array(value :_*))
  }
}
