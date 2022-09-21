package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantJoiningNotification
  extends StObject
     with Entity {
  
  var call: js.UndefOr[NullableOption[Call]] = js.undefined
}
object ParticipantJoiningNotification {
  
  inline def apply(): ParticipantJoiningNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantJoiningNotification]
  }
  
  extension [Self <: ParticipantJoiningNotification](x: Self) {
    
    inline def setCall(value: NullableOption[Call]): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallNull: Self = StObject.set(x, "call", null)
    
    inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
  }
}
