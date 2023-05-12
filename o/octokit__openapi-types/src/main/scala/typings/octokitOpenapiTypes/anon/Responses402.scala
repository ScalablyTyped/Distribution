package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses402 extends StObject {
  
  var parameters: Path378
  
  var responses: `402`
}
object Responses402 {
  
  inline def apply(parameters: Path378, responses: `402`): Responses402 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses402]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses402] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path378): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `402`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
