package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumber extends StObject {
  
  var parameters: PathIssuenumber
  
  var responses: `301304`
}
object ParametersPathIssuenumber {
  
  inline def apply(parameters: PathIssuenumber, responses: `301304`): ParametersPathIssuenumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
