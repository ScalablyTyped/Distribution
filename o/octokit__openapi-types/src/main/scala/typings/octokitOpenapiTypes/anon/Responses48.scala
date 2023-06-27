package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses48 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `48`
}
object Responses48 {
  
  inline def apply(parameters: PathThreadid, responses: `48`): Responses48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
