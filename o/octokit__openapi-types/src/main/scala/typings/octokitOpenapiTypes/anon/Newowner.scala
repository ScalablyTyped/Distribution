package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Newowner extends StObject {
  
  /** @description The new name to be given to the repository. */
  var new_name: js.UndefOr[String] = js.undefined
  
  /** @description The username or organization name the repository will be transferred to. */
  var new_owner: String
  
  /** @description ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories. */
  var team_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object Newowner {
  
  inline def apply(new_owner: String): Newowner = {
    val __obj = js.Dynamic.literal(new_owner = new_owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Newowner] (val x: Self) extends AnyVal {
    
    inline def setNew_name(value: String): Self = StObject.set(x, "new_name", value.asInstanceOf[js.Any])
    
    inline def setNew_nameUndefined: Self = StObject.set(x, "new_name", js.undefined)
    
    inline def setNew_owner(value: String): Self = StObject.set(x, "new_owner", value.asInstanceOf[js.Any])
    
    inline def setTeam_ids(value: js.Array[Double]): Self = StObject.set(x, "team_ids", value.asInstanceOf[js.Any])
    
    inline def setTeam_idsUndefined: Self = StObject.set(x, "team_ids", js.undefined)
    
    inline def setTeam_idsVarargs(value: Double*): Self = StObject.set(x, "team_ids", js.Array(value*))
  }
}
