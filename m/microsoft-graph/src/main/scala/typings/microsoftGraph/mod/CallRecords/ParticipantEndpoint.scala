package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantEndpoint
  extends StObject
     with Endpoint {
  
  // The feedback provided by the user of this endpoint about the quality of the session.
  var feedback: js.UndefOr[NullableOption[UserFeedback]] = js.undefined
  
  // Identity associated with the endpoint.
  var identity: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object ParticipantEndpoint {
  
  inline def apply(): ParticipantEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantEndpoint]
  }
  
  extension [Self <: ParticipantEndpoint](x: Self) {
    
    inline def setFeedback(value: NullableOption[UserFeedback]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackNull: Self = StObject.set(x, "feedback", null)
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setIdentity(value: NullableOption[IdentitySet]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
  }
}
