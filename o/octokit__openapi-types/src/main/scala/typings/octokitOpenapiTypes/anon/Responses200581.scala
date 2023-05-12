package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200581 extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200581`
}
object Responses200581 {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200581`): Responses200581 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200581]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200581] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200581`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
