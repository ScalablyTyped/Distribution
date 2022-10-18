package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEventidOwner extends StObject {
  
  var get: ParametersPathEventidOwner
}
object GetParametersPathEventidOwner {
  
  inline def apply(get: ParametersPathEventidOwner): GetParametersPathEventidOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEventidOwner]
  }
  
  extension [Self <: GetParametersPathEventidOwner](x: Self) {
    
    inline def setGet(value: ParametersPathEventidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
