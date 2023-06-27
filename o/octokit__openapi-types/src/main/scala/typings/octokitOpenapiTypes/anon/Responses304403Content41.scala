package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304403Content41 extends StObject {
  
  var parameters: PathGistidString
  
  var responses: `304403Content41`
}
object Responses304403Content41 {
  
  inline def apply(parameters: PathGistidString, responses: `304403Content41`): Responses304403Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304403Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
