package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content270 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200Content270`
}
object Responses200Content270 {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200Content270`): Responses200Content270 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content270]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content270] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content270`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
