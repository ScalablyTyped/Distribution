package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401403404410 extends StObject {
  
  var parameters: PathProjectidNumber
  
  var responses: `304401403404410`
}
object Responses304401403404410 {
  
  inline def apply(parameters: PathProjectidNumber, responses: `304401403404410`): Responses304401403404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401403404410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304401403404410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
