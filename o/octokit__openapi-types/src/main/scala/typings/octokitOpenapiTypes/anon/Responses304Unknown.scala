package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304Unknown extends StObject {
  
  var parameters: PathGistid
  
  var responses: `304Unknown`
}
object Responses304Unknown {
  
  inline def apply(parameters: PathGistid, responses: `304Unknown`): Responses304Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304Unknown]
  }
  
  extension [Self <: Responses304Unknown](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
