package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content41422Content414 extends StObject {
  
  var parameters: PathOrgRepositoryidSecretname
  
  var responses: `404Content41422Content414`
}
object Responses404Content41422Content414 {
  
  inline def apply(parameters: PathOrgRepositoryidSecretname, responses: `404Content41422Content414`): Responses404Content41422Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content41422Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content41422Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRepositoryidSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
