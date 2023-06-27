package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304403422 extends StObject {
  
  var parameters: `562`
  
  var responses: `200304403422`
}
object Responses200304403422 {
  
  inline def apply(parameters: `562`, responses: `200304403422`): Responses200304403422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304403422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200304403422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `562`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
