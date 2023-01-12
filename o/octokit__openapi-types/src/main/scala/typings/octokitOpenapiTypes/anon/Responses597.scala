package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses597 extends StObject {
  
  var parameters: Path577Query407
  
  var responses: `597`
}
object Responses597 {
  
  inline def apply(parameters: Path577Query407, responses: `597`): Responses597 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses597]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses597] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path577Query407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `597`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
