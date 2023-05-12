package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQuery473 extends StObject {
  
  var parameters: PathOrgStringQuery473
  
  var responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
}
object ParametersPathOrgStringQuery473 {
  
  inline def apply(
    parameters: PathOrgStringQuery473,
    responses: `200ContentApplicationjsonRepositorycacheusagesTotalcount`
  ): ParametersPathOrgStringQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositorycacheusagesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
