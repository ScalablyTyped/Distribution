package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400401403 extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `400401403`
}
object Responses400401403 {
  
  inline def apply(parameters: PathOwnerString, responses: `400401403`): Responses400401403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses400401403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
