package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content194 extends StObject {
  
  var parameters: PathRepoUsername
  
  var responses: `200Content194`
}
object Responses200Content194 {
  
  inline def apply(parameters: PathRepoUsername, responses: `200Content194`): Responses200Content194 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content194]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content194] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content194`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
