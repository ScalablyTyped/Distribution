package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateSessionsResponse extends StObject {
  
  /** The freshly created sessions. */
  var session: js.UndefOr[js.Array[Session]] = js.undefined
}
object BatchCreateSessionsResponse {
  
  @scala.inline
  def apply(): BatchCreateSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsResponse]
  }
  
  @scala.inline
  implicit class BatchCreateSessionsResponseMutableBuilder[Self <: BatchCreateSessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: js.Array[Session]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setSessionVarargs(value: Session*): Self = StObject.set(x, "session", js.Array(value :_*))
  }
}
