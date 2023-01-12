package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAppRemovedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Display name of the teamsApp.
  var teamsAppDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the teamsApp.
  var teamsAppId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsAppRemovedEventMessageDetail {
  
  inline def apply(): TeamsAppRemovedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAppRemovedEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsAppRemovedEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setTeamsAppDisplayName(value: NullableOption[String]): Self = StObject.set(x, "teamsAppDisplayName", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppDisplayNameNull: Self = StObject.set(x, "teamsAppDisplayName", null)
    
    inline def setTeamsAppDisplayNameUndefined: Self = StObject.set(x, "teamsAppDisplayName", js.undefined)
    
    inline def setTeamsAppId(value: NullableOption[String]): Self = StObject.set(x, "teamsAppId", value.asInstanceOf[js.Any])
    
    inline def setTeamsAppIdNull: Self = StObject.set(x, "teamsAppId", null)
    
    inline def setTeamsAppIdUndefined: Self = StObject.set(x, "teamsAppId", js.undefined)
  }
}
