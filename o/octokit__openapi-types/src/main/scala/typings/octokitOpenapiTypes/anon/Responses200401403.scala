package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200401403 extends StObject {
  
  var parameters: `55`
  
  var responses: `200401403`
}
object Responses200401403 {
  
  inline def apply(parameters: `55`, responses: `200401403`): Responses200401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200401403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
