package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathKey extends StObject {
  
  var get: ParametersPathKey
}
object GetParametersPathKey {
  
  inline def apply(get: ParametersPathKey): GetParametersPathKey = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathKey]
  }
  
  extension [Self <: GetParametersPathKey](x: Self) {
    
    inline def setGet(value: ParametersPathKey): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
