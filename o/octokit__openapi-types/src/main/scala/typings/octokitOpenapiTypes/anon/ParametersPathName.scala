package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathName extends StObject {
  
  var parameters: PathName
  
  var responses: `200Content33`
}
object ParametersPathName {
  
  inline def apply(parameters: PathName, responses: `200Content33`): ParametersPathName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content33`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
