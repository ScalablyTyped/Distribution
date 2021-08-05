package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingContext extends StObject {
  
  // The ID of the participant that is under observation. Read-only.
  var observedParticipantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity that the call is happening on behalf of.
  var onBehalfOf: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The ID of the participant that triggered the incoming call. Read-only.
  var sourceParticipantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity that transferred the call.
  var transferor: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object IncomingContext {
  
  inline def apply(): IncomingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingContext]
  }
  
  extension [Self <: IncomingContext](x: Self) {
    
    inline def setObservedParticipantId(value: NullableOption[String]): Self = StObject.set(x, "observedParticipantId", value.asInstanceOf[js.Any])
    
    inline def setObservedParticipantIdNull: Self = StObject.set(x, "observedParticipantId", null)
    
    inline def setObservedParticipantIdUndefined: Self = StObject.set(x, "observedParticipantId", js.undefined)
    
    inline def setOnBehalfOf(value: NullableOption[IdentitySet]): Self = StObject.set(x, "onBehalfOf", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfNull: Self = StObject.set(x, "onBehalfOf", null)
    
    inline def setOnBehalfOfUndefined: Self = StObject.set(x, "onBehalfOf", js.undefined)
    
    inline def setSourceParticipantId(value: NullableOption[String]): Self = StObject.set(x, "sourceParticipantId", value.asInstanceOf[js.Any])
    
    inline def setSourceParticipantIdNull: Self = StObject.set(x, "sourceParticipantId", null)
    
    inline def setSourceParticipantIdUndefined: Self = StObject.set(x, "sourceParticipantId", js.undefined)
    
    inline def setTransferor(value: NullableOption[IdentitySet]): Self = StObject.set(x, "transferor", value.asInstanceOf[js.Any])
    
    inline def setTransferorNull: Self = StObject.set(x, "transferor", null)
    
    inline def setTransferorUndefined: Self = StObject.set(x, "transferor", js.undefined)
  }
}
