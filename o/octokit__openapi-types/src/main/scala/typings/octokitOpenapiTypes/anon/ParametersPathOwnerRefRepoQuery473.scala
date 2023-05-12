package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepoQuery473 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery473
  
  var responses: `200ContentApplicationjsonStatuses`
}
object ParametersPathOwnerRefRepoQuery473 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery473, responses: `200ContentApplicationjsonStatuses`): ParametersPathOwnerRefRepoQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRefRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonStatuses`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
