package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamCreatedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Description for the team.
  var teamDescription: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the team.
  var teamDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the team.
  var teamId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamCreatedEventMessageDetail {
  
  inline def apply(): TeamCreatedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamCreatedEventMessageDetail]
  }
  
  extension [Self <: TeamCreatedEventMessageDetail](x: Self) {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setTeamDescription(value: NullableOption[String]): Self = StObject.set(x, "teamDescription", value.asInstanceOf[js.Any])
    
    inline def setTeamDescriptionNull: Self = StObject.set(x, "teamDescription", null)
    
    inline def setTeamDescriptionUndefined: Self = StObject.set(x, "teamDescription", js.undefined)
    
    inline def setTeamDisplayName(value: NullableOption[String]): Self = StObject.set(x, "teamDisplayName", value.asInstanceOf[js.Any])
    
    inline def setTeamDisplayNameNull: Self = StObject.set(x, "teamDisplayName", null)
    
    inline def setTeamDisplayNameUndefined: Self = StObject.set(x, "teamDisplayName", js.undefined)
    
    inline def setTeamId(value: NullableOption[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdNull: Self = StObject.set(x, "teamId", null)
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
