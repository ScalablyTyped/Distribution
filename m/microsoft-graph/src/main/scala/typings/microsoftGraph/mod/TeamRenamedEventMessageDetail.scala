package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamRenamedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The updated name of the team.
  var teamDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the team.
  var teamId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamRenamedEventMessageDetail {
  
  inline def apply(): TeamRenamedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamRenamedEventMessageDetail]
  }
  
  extension [Self <: TeamRenamedEventMessageDetail](x: Self) {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setTeamDisplayName(value: NullableOption[String]): Self = StObject.set(x, "teamDisplayName", value.asInstanceOf[js.Any])
    
    inline def setTeamDisplayNameNull: Self = StObject.set(x, "teamDisplayName", null)
    
    inline def setTeamDisplayNameUndefined: Self = StObject.set(x, "teamDisplayName", js.undefined)
    
    inline def setTeamId(value: NullableOption[String]): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdNull: Self = StObject.set(x, "teamId", null)
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
