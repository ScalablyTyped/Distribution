package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304Unknown401Content48 extends StObject {
  
  var parameters: PathThreadidNumber
  
  var responses: `304Unknown401Content48`
}
object Responses304Unknown401Content48 {
  
  inline def apply(parameters: PathThreadidNumber, responses: `304Unknown401Content48`): Responses304Unknown401Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304Unknown401Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304Unknown401Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
