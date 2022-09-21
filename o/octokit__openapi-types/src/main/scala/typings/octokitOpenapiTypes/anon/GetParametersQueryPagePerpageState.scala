package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageState extends StObject {
  
  var get: ParametersQueryPagePerpageState
}
object GetParametersQueryPagePerpageState {
  
  inline def apply(get: ParametersQueryPagePerpageState): GetParametersQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageState]
  }
  
  extension [Self <: GetParametersQueryPagePerpageState](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
