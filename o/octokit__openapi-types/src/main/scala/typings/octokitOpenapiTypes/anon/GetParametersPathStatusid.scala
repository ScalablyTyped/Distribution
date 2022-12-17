package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathStatusid extends StObject {
  
  /** Users with pull access can view a deployment status for a deployment: */
  var get: ParametersPathStatusid
}
object GetParametersPathStatusid {
  
  inline def apply(get: ParametersPathStatusid): GetParametersPathStatusid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathStatusid]
  }
  
  extension [Self <: GetParametersPathStatusid](x: Self) {
    
    inline def setGet(value: ParametersPathStatusid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
