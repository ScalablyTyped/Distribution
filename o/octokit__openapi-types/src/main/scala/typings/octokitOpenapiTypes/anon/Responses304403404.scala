package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304403404 extends StObject {
  
  var parameters: PathGistid
  
  var responses: `304403404`
}
object Responses304403404 {
  
  inline def apply(parameters: PathGistid, responses: `304403404`): Responses304403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304403404]
  }
  
  extension [Self <: Responses304403404](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
