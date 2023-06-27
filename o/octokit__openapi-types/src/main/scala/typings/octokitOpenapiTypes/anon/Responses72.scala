package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses72 extends StObject {
  
  var parameters: PathRunnerid
  
  var responses: `72`
}
object Responses72 {
  
  inline def apply(parameters: PathRunnerid, responses: `72`): Responses72 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses72]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses72] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `72`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
