package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwner extends StObject {
  
  var get: ParametersPathOwner
}
object GetParametersPathOwner {
  
  inline def apply(get: ParametersPathOwner): GetParametersPathOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwner] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
