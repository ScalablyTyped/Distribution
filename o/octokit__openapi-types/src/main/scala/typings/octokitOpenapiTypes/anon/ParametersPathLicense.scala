package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathLicense extends StObject {
  
  var parameters: PathLicense
  
  var responses: `200Content46`
}
object ParametersPathLicense {
  
  inline def apply(parameters: PathLicense, responses: `200Content46`): ParametersPathLicense = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathLicense] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathLicense): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content46`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
