package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBuildidOwner extends StObject {
  
  var get: ParametersPathBuildidOwner
}
object GetParametersPathBuildidOwner {
  
  inline def apply(get: ParametersPathBuildidOwner): GetParametersPathBuildidOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBuildidOwner]
  }
  
  extension [Self <: GetParametersPathBuildidOwner](x: Self) {
    
    inline def setGet(value: ParametersPathBuildidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
