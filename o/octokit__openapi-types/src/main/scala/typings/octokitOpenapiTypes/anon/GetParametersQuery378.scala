package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery378 extends StObject {
  
  /**
    * Team members will include the members of child teams.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  var get: ParametersQuery378
}
object GetParametersQuery378 {
  
  inline def apply(get: ParametersQuery378): GetParametersQuery378 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery378]
  }
  
  extension [Self <: GetParametersQuery378](x: Self) {
    
    inline def setGet(value: ParametersQuery378): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
