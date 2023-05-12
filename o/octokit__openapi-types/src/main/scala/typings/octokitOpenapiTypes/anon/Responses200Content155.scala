package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content155 extends StObject {
  
  var parameters: `154`
  
  var responses: `200Content155`
}
object Responses200Content155 {
  
  inline def apply(parameters: `154`, responses: `200Content155`): Responses200Content155 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content155]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content155] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `154`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content155`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
