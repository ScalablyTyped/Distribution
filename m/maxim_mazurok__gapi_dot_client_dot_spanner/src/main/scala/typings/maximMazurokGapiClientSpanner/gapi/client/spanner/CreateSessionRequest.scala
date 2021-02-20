package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSessionRequest extends StObject {
  
  /** Required. The session to create. */
  var session: js.UndefOr[Session] = js.native
}
object CreateSessionRequest {
  
  @scala.inline
  def apply(): CreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSessionRequest]
  }
  
  @scala.inline
  implicit class CreateSessionRequestMutableBuilder[Self <: CreateSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
