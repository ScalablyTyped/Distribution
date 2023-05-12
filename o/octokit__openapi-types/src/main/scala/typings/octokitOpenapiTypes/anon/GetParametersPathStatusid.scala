package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathStatusid extends StObject {
  
  /**
    * Get a deployment status
    * @description Users with pull access can view a deployment status for a deployment:
    */
  var get: ParametersPathStatusid
}
object GetParametersPathStatusid {
  
  inline def apply(get: ParametersPathStatusid): GetParametersPathStatusid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathStatusid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathStatusid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathStatusid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
