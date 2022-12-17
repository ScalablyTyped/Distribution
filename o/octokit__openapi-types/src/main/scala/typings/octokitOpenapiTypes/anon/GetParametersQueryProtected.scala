package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryProtected extends StObject {
  
  var get: ParametersQueryProtected
}
object GetParametersQueryProtected {
  
  inline def apply(get: ParametersQueryProtected): GetParametersQueryProtected = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryProtected]
  }
  
  extension [Self <: GetParametersQueryProtected](x: Self) {
    
    inline def setGet(value: ParametersQueryProtected): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
