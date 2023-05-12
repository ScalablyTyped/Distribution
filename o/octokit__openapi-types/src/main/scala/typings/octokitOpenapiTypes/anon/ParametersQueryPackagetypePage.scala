package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPackagetypePage extends StObject {
  
  var parameters: QueryPackagetypePage
  
  var responses: `200Content78400`
}
object ParametersQueryPackagetypePage {
  
  inline def apply(parameters: QueryPackagetypePage, responses: `200Content78400`): ParametersQueryPackagetypePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPackagetypePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content78400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
