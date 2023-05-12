package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryNamePagePerpage extends StObject {
  
  var parameters: QueryNamePagePerpage
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersQueryNamePagePerpage {
  
  inline def apply(parameters: QueryNamePagePerpage, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersQueryNamePagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryNamePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryNamePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryNamePagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
