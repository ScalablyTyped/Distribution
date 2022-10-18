package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath292Query309 extends StObject {
  
  var get: ParametersPath292Query309
  
  var put: Responses200Content592404
}
object GetParametersPath292Query309 {
  
  inline def apply(get: ParametersPath292Query309, put: Responses200Content592404): GetParametersPath292Query309 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath292Query309]
  }
  
  extension [Self <: GetParametersPath292Query309](x: Self) {
    
    inline def setGet(value: ParametersPath292Query309): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content592404): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
