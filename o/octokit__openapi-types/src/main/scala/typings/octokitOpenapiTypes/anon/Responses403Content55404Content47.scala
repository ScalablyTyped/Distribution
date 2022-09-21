package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content55404Content47 extends StObject {
  
  var parameters: PathGistidString
  
  var responses: `403Content55404Content47`
}
object Responses403Content55404Content47 {
  
  inline def apply(parameters: PathGistidString, responses: `403Content55404Content47`): Responses403Content55404Content47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content55404Content47]
  }
  
  extension [Self <: Responses403Content55404Content47](x: Self) {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content55404Content47`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
