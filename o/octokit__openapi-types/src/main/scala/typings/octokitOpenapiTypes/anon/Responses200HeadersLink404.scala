package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200HeadersLink404 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200HeadersLink404`
}
object Responses200HeadersLink404 {
  
  inline def apply(parameters: PathOwner, responses: `200HeadersLink404`): Responses200HeadersLink404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200HeadersLink404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200HeadersLink404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersLink404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
