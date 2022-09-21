package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses307403 extends StObject {
  
  var parameters: `491`
  
  var responses: `307403`
}
object Responses307403 {
  
  inline def apply(parameters: `491`, responses: `307403`): Responses307403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses307403]
  }
  
  extension [Self <: Responses307403](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `307403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
