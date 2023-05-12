package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionPagePerpage extends StObject {
  
  var parameters: QueryDirectionPagePerpage
  
  var responses: `200ContentApplicationvndgithubv3starjson`
}
object ParametersQueryDirectionPagePerpage {
  
  inline def apply(parameters: QueryDirectionPagePerpage, responses: `200ContentApplicationvndgithubv3starjson`): ParametersQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryDirectionPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryDirectionPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
