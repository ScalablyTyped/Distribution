package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403404422 extends StObject {
  
  var parameters: PathGistid
  
  var responses: `403404422`
}
object Responses403404422 {
  
  inline def apply(parameters: PathGistid, responses: `403404422`): Responses403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403404422]
  }
  
  extension [Self <: Responses403404422](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
