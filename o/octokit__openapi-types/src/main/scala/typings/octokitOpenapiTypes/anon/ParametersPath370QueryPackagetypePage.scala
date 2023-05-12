package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryPackagetypePage extends StObject {
  
  var parameters: Path370QueryPackagetypePage
  
  var responses: `200400`
}
object ParametersPath370QueryPackagetypePage {
  
  inline def apply(parameters: Path370QueryPackagetypePage, responses: `200400`): ParametersPath370QueryPackagetypePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPackagetypePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
