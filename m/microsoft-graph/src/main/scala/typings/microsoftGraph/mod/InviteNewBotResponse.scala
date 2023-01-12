package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteNewBotResponse
  extends StObject
     with ParticipantJoiningResponse {
  
  // URI to receive new incoming call notification.
  var inviteUri: js.UndefOr[NullableOption[String]] = js.undefined
}
object InviteNewBotResponse {
  
  inline def apply(): InviteNewBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteNewBotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InviteNewBotResponse] (val x: Self) extends AnyVal {
    
    inline def setInviteUri(value: NullableOption[String]): Self = StObject.set(x, "inviteUri", value.asInstanceOf[js.Any])
    
    inline def setInviteUriNull: Self = StObject.set(x, "inviteUri", null)
    
    inline def setInviteUriUndefined: Self = StObject.set(x, "inviteUri", js.undefined)
  }
}
