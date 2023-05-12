package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404409422 extends StObject {
  
  var parameters: `141`
  
  var responses: `404409422`
}
object Responses404409422 {
  
  inline def apply(parameters: `141`, responses: `404409422`): Responses404409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404409422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404409422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
