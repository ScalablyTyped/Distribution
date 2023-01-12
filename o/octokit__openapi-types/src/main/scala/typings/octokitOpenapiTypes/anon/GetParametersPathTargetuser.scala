package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTargetuser extends StObject {
  
  var get: ParametersPathTargetuser
}
object GetParametersPathTargetuser {
  
  inline def apply(get: ParametersPathTargetuser): GetParametersPathTargetuser = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTargetuser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTargetuser] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTargetuser): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
