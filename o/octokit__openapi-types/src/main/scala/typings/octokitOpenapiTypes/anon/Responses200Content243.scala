package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content243 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var responses: `200Content243`
}
object Responses200Content243 {
  
  inline def apply(parameters: PathRepoSecretname, responses: `200Content243`): Responses200Content243 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content243]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content243] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content243`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
