package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses489 extends StObject {
  
  var parameters: Path444Query
  
  var responses: `489`
}
object Responses489 {
  
  inline def apply(parameters: Path444Query, responses: `489`): Responses489 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses489]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses489] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `489`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
