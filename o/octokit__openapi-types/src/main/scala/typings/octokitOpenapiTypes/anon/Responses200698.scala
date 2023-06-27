package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200698 extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200698`
}
object Responses200698 {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200698`): Responses200698 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200698]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200698] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200698`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
