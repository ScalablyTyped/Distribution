package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content40 extends StObject {
  
  var parameters: PathGistid
  
  var responses: `404Content40`
}
object Responses404Content40 {
  
  inline def apply(parameters: PathGistid, responses: `404Content40`): Responses404Content40 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content40]
  }
  
  extension [Self <: Responses404Content40](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content40`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
