package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryEnvironmentPage extends StObject {
  
  var parameters: QueryEnvironmentPage
  
  var responses: `200Content551HeadersLinkString`
}
object ParametersQueryEnvironmentPage {
  
  inline def apply(parameters: QueryEnvironmentPage, responses: `200Content551HeadersLinkString`): ParametersQueryEnvironmentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryEnvironmentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryEnvironmentPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryEnvironmentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content551HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
