package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content41422Content414 extends StObject {
  
  var parameters: PathOwnerRepoUsername
  
  var responses: `403Content41422Content414`
}
object Responses403Content41422Content414 {
  
  inline def apply(parameters: PathOwnerRepoUsername, responses: `403Content41422Content414`): Responses403Content41422Content414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content41422Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content41422Content414] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content41422Content414`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
