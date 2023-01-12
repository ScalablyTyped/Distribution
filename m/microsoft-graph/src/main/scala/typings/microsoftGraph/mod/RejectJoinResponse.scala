package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectJoinResponse
  extends StObject
     with ParticipantJoiningResponse {
  
  // The rejection reason. Possible values are None, Busy, and Forbidden.
  var reason: js.UndefOr[RejectReason] = js.undefined
}
object RejectJoinResponse {
  
  inline def apply(): RejectJoinResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectJoinResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectJoinResponse] (val x: Self) extends AnyVal {
    
    inline def setReason(value: RejectReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
