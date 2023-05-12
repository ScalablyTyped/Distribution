package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath69QueryPagePerpage extends StObject {
  
  var parameters: Path69QueryPagePerpage
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount`
}
object ParametersPath69QueryPagePerpage {
  
  inline def apply(parameters: Path69QueryPagePerpage, responses: `200ContentApplicationjsonRepositoriesTotalcount`): ParametersPath69QueryPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath69QueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath69QueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path69QueryPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
