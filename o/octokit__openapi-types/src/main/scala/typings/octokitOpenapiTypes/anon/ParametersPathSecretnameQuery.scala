package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameQuery extends StObject {
  
  var parameters: PathSecretnameQuery
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount`
}
object ParametersPathSecretnameQuery {
  
  inline def apply(parameters: PathSecretnameQuery, responses: `200ContentApplicationjsonRepositoriesTotalcount`): ParametersPathSecretnameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSecretnameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretnameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
