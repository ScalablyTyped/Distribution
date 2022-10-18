package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryOutdatedPage extends StObject {
  
  var parameters: QueryOutdatedPage
  
  var responses: `200Content233`
}
object ParametersQueryOutdatedPage {
  
  inline def apply(parameters: QueryOutdatedPage, responses: `200Content233`): ParametersQueryOutdatedPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryOutdatedPage]
  }
  
  extension [Self <: ParametersQueryOutdatedPage](x: Self) {
    
    inline def setParameters(value: QueryOutdatedPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content233`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
