package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateSessionsRequest extends StObject {
  
  /**
    * Required. The number of sessions to be created in this batch call. The API may return fewer than the requested number of sessions. If a specific number of sessions are desired, the
    * client can make additional calls to BatchCreateSessions (adjusting session_count as necessary).
    */
  var sessionCount: js.UndefOr[Double] = js.undefined
  
  /** Parameters to be applied to each created session. */
  var sessionTemplate: js.UndefOr[Session] = js.undefined
}
object BatchCreateSessionsRequest {
  
  inline def apply(): BatchCreateSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateSessionsRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    inline def setSessionTemplate(value: Session): Self = StObject.set(x, "sessionTemplate", value.asInstanceOf[js.Any])
    
    inline def setSessionTemplateUndefined: Self = StObject.set(x, "sessionTemplate", js.undefined)
  }
}
