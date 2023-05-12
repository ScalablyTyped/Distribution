package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses75 extends StObject {
  
  var parameters: PathRepositoryidSecretname
  
  var responses: `75`
}
object Responses75 {
  
  inline def apply(parameters: PathRepositoryidSecretname, responses: `75`): Responses75 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses75]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses75] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
