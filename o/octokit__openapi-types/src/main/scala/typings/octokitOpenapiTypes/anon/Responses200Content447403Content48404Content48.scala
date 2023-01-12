package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content447403Content48404Content48 extends StObject {
  
  var parameters: PathTeamidNumberQuery407
  
  var responses: `200Content447403Content48404Content48`
}
object Responses200Content447403Content48404Content48 {
  
  inline def apply(parameters: PathTeamidNumberQuery407, responses: `200Content447403Content48404Content48`): Responses200Content447403Content48404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content447403Content48404Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content447403Content48404Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content447403Content48404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
