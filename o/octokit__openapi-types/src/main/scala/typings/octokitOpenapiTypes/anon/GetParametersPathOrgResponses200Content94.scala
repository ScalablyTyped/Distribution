package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgResponses200Content94 extends StObject {
  
  var get: ParametersPathOrgResponses200Content94
  
  var patch: RequestBodyContentApplicationjson382
}
object GetParametersPathOrgResponses200Content94 {
  
  inline def apply(get: ParametersPathOrgResponses200Content94, patch: RequestBodyContentApplicationjson382): GetParametersPathOrgResponses200Content94 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgResponses200Content94]
  }
  
  extension [Self <: GetParametersPathOrgResponses200Content94](x: Self) {
    
    inline def setGet(value: ParametersPathOrgResponses200Content94): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson382): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
