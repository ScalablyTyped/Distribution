package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200401403404 extends StObject {
  
  var parameters: PathPackagetypeUsername
  
  var responses: `200401403404`
}
object Responses200401403404 {
  
  inline def apply(parameters: PathPackagetypeUsername, responses: `200401403404`): Responses200401403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200401403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypeUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
