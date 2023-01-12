package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabledorgs extends StObject {
  
  var disabled_orgs: js.UndefOr[Double] = js.undefined
  
  var total_orgs: js.UndefOr[Double] = js.undefined
  
  var total_team_members: js.UndefOr[Double] = js.undefined
  
  var total_teams: js.UndefOr[Double] = js.undefined
}
object Disabledorgs {
  
  inline def apply(): Disabledorgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabledorgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disabledorgs] (val x: Self) extends AnyVal {
    
    inline def setDisabled_orgs(value: Double): Self = StObject.set(x, "disabled_orgs", value.asInstanceOf[js.Any])
    
    inline def setDisabled_orgsUndefined: Self = StObject.set(x, "disabled_orgs", js.undefined)
    
    inline def setTotal_orgs(value: Double): Self = StObject.set(x, "total_orgs", value.asInstanceOf[js.Any])
    
    inline def setTotal_orgsUndefined: Self = StObject.set(x, "total_orgs", js.undefined)
    
    inline def setTotal_team_members(value: Double): Self = StObject.set(x, "total_team_members", value.asInstanceOf[js.Any])
    
    inline def setTotal_team_membersUndefined: Self = StObject.set(x, "total_team_members", js.undefined)
    
    inline def setTotal_teams(value: Double): Self = StObject.set(x, "total_teams", value.asInstanceOf[js.Any])
    
    inline def setTotal_teamsUndefined: Self = StObject.set(x, "total_teams", js.undefined)
  }
}
