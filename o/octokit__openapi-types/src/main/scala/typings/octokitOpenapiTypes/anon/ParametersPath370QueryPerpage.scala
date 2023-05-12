package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryPerpage extends StObject {
  
  var parameters: Path370QueryPerpage
  
  var responses: `200Content18`
}
object ParametersPath370QueryPerpage {
  
  inline def apply(parameters: Path370QueryPerpage, responses: `200Content18`): ParametersPath370QueryPerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryPerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content18`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
