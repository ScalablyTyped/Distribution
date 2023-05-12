package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses371 extends StObject {
  
  var parameters: Path370
  
  var responses: `371`
}
object Responses371 {
  
  inline def apply(parameters: Path370, responses: `371`): Responses371 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses371]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses371] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `371`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
