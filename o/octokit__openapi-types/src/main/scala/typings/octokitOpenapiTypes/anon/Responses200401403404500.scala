package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200401403404500 extends StObject {
  
  var parameters: Path450
  
  var responses: `200401403404500`
}
object Responses200401403404500 {
  
  inline def apply(parameters: Path450, responses: `200401403404500`): Responses200401403404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200401403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200401403404500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path450): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
