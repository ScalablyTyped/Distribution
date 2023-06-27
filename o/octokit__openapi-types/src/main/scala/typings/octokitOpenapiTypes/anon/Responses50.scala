package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses50 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `50`
}
object Responses50 {
  
  inline def apply(parameters: PathThreadid, responses: `50`): Responses50 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses50]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses50] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `50`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
