package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content48404Content40 extends StObject {
  
  var parameters: PathGistidString
  
  var responses: `403Content48404Content40`
}
object Responses403Content48404Content40 {
  
  inline def apply(parameters: PathGistidString, responses: `403Content48404Content40`): Responses403Content48404Content40 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content48404Content40]
  }
  
  extension [Self <: Responses403Content48404Content40](x: Self) {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48404Content40`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
