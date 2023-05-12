package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagename extends StObject {
  
  var parameters: PathPackagename
  
  var responses: `200Content98`
}
object ParametersPathPackagename {
  
  inline def apply(parameters: PathPackagename, responses: `200Content98`): ParametersPathPackagename = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagename] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content98`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
