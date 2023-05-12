package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403 extends StObject {
  
  var parameters: QueryPage
  
  var responses: `401403`
}
object Responses401403 {
  
  inline def apply(parameters: QueryPage, responses: `401403`): Responses401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
