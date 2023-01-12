package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryContentPagePerpage extends StObject {
  
  var parameters: QueryContentPagePerpage
  
  var responses: `200Content112404`
}
object ParametersQueryContentPagePerpage {
  
  inline def apply(parameters: QueryContentPagePerpage, responses: `200Content112404`): ParametersQueryContentPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryContentPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryContentPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryContentPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content112404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
