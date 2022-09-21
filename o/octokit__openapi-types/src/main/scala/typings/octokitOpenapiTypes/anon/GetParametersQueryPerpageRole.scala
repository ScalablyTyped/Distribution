package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageRole extends StObject {
  
  /**
    * Team members will include the members of child teams.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  var get: ParametersQueryPerpageRole
}
object GetParametersQueryPerpageRole {
  
  inline def apply(get: ParametersQueryPerpageRole): GetParametersQueryPerpageRole = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageRole]
  }
  
  extension [Self <: GetParametersQueryPerpageRole](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageRole): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
