package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath607Query378 extends StObject {
  
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team members`](https://docs.github.com/rest/reference/teams#list-team-members) endpoint.
    *
    * Team members will include the members of child teams.
    */
  var get: ParametersPath607Query378
}
object GetParametersPath607Query378 {
  
  inline def apply(get: ParametersPath607Query378): GetParametersPath607Query378 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath607Query378]
  }
  
  extension [Self <: GetParametersPath607Query378](x: Self) {
    
    inline def setGet(value: ParametersPath607Query378): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
