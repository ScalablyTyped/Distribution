package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403404500 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `401403404500`
}
object Responses401403404500 {
  
  inline def apply(parameters: PathOwner, responses: `401403404500`): Responses401403404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401403404500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
