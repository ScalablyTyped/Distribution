package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPackagetypePagePerpage extends StObject {
  
  var parameters: QueryPackagetypePagePerpage
  
  var responses: `200Content596400`
}
object ParametersQueryPackagetypePagePerpage {
  
  inline def apply(parameters: QueryPackagetypePagePerpage, responses: `200Content596400`): ParametersQueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPackagetypePagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content596400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
