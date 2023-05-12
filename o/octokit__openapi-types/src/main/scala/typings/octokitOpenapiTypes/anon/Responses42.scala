package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses42 extends StObject {
  
  var parameters: PathThreadid
  
  var responses: `42`
}
object Responses42 {
  
  inline def apply(parameters: PathThreadid, responses: `42`): Responses42 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses42]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses42] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `42`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
