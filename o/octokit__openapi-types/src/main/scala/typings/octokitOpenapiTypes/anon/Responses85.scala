package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses85 extends StObject {
  
  var parameters: PathRepositoryidSecretname
  
  var responses: `85`
}
object Responses85 {
  
  inline def apply(parameters: PathRepositoryidSecretname, responses: `85`): Responses85 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses85]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses85] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `85`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
