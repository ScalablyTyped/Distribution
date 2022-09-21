package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamInfo
  extends StObject
     with Entity {
  
  // The name of the team.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var team: js.UndefOr[NullableOption[Team]] = js.undefined
  
  // The ID of the Azure Active Directory tenant.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamInfo {
  
  inline def apply(): TeamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamInfo]
  }
  
  extension [Self <: TeamInfo](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTeam(value: NullableOption[Team]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTeamNull: Self = StObject.set(x, "team", null)
    
    inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
