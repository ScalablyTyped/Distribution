package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses64 extends StObject {
  
  var parameters: PathRunnerid
  
  var responses: `64`
}
object Responses64 {
  
  inline def apply(parameters: PathRunnerid, responses: `64`): Responses64 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses64]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses64] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `64`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
