package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200439 extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `200439`
}
object Responses200439 {
  
  inline def apply(parameters: PathOrgSecretname, responses: `200439`): Responses200439 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200439]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200439] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200439`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
