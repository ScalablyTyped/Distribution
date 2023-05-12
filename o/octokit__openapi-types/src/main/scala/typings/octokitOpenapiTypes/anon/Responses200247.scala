package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200247 extends StObject {
  
  var parameters: PathCommitsha
  
  var responses: `200247`
}
object Responses200247 {
  
  inline def apply(parameters: PathCommitsha, responses: `200247`): Responses200247 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200247]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200247] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitsha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200247`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
