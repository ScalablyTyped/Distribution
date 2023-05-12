package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerRepoQuery473 extends StObject {
  
  var parameters: PathEnvironmentnameOwnerRepoQuery473
  
  var responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
}
object ParametersPathEnvironmentnameOwnerRepoQuery473 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerRepoQuery473,
    responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
  ): ParametersPathEnvironmentnameOwnerRepoQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpoliciesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
