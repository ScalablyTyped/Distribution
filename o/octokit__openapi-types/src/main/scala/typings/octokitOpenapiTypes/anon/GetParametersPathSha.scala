package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathSha extends StObject {
  
  var get: ParametersPathSha
}
object GetParametersPathSha {
  
  inline def apply(get: ParametersPathSha): GetParametersPathSha = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathSha]
  }
  
  extension [Self <: GetParametersPathSha](x: Self) {
    
    inline def setGet(value: ParametersPathSha): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
