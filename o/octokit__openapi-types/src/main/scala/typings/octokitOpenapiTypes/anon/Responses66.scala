package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses66 extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `66`
}
object Responses66 {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `66`): Responses66 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses66]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses66] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `66`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
