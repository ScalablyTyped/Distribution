package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryDirectionPagePerpage extends StObject {
  
  var parameters: Path370QueryDirectionPagePerpage
  
  var responses: `200Content418`
}
object ParametersPath370QueryDirectionPagePerpage {
  
  inline def apply(parameters: Path370QueryDirectionPagePerpage, responses: `200Content418`): ParametersPath370QueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryDirectionPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryDirectionPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryDirectionPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content418`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
