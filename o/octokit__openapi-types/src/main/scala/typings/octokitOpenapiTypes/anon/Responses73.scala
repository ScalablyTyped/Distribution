package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses73 extends StObject {
  
  var parameters: PathRunnerid
  
  var responses: `73`
}
object Responses73 {
  
  inline def apply(parameters: PathRunnerid, responses: `73`): Responses73 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses73]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses73] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `73`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
