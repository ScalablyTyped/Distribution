package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content47 extends StObject {
  
  var parameters: PathGistid
  
  var responses: `404Content47`
}
object Responses404Content47 {
  
  inline def apply(parameters: PathGistid, responses: `404Content47`): Responses404Content47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content47]
  }
  
  extension [Self <: Responses404Content47](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
