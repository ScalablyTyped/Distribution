package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryFeatured extends StObject {
  
  var parameters: QueryFeatured
  
  var responses: `200Content33`
}
object ParametersQueryFeatured {
  
  inline def apply(parameters: QueryFeatured, responses: `200Content33`): ParametersQueryFeatured = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryFeatured]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryFeatured] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryFeatured): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content33`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
