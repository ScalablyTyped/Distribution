package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodespacenameString extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `200304401403404500`
}
object ParametersPathCodespacenameString {
  
  inline def apply(parameters: PathCodespacenameString, responses: `200304401403404500`): ParametersPathCodespacenameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodespacenameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCodespacenameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
