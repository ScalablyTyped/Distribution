package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBuildid extends StObject {
  
  var get: ParametersPathBuildid
}
object GetParametersPathBuildid {
  
  inline def apply(get: ParametersPathBuildid): GetParametersPathBuildid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBuildid]
  }
  
  extension [Self <: GetParametersPathBuildid](x: Self) {
    
    inline def setGet(value: ParametersPathBuildid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
