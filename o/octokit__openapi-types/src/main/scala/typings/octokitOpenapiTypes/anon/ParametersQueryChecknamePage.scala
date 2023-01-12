package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryChecknamePage extends StObject {
  
  var parameters: QueryChecknamePage
  
  var responses: `200ContentApplicationjsonChecksuites`
}
object ParametersQueryChecknamePage {
  
  inline def apply(parameters: QueryChecknamePage, responses: `200ContentApplicationjsonChecksuites`): ParametersQueryChecknamePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryChecknamePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryChecknamePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryChecknamePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonChecksuites`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
