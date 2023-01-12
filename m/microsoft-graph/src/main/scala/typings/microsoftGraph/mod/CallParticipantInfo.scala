package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallParticipantInfo extends StObject {
  
  // Identity of the call participant.
  var participant: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object CallParticipantInfo {
  
  inline def apply(): CallParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallParticipantInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallParticipantInfo] (val x: Self) extends AnyVal {
    
    inline def setParticipant(value: NullableOption[IdentitySet]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantNull: Self = StObject.set(x, "participant", null)
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
  }
}
