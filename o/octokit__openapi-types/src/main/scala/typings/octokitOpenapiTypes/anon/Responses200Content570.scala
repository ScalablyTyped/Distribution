package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content570 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery473
  
  var responses: `200Content570`
}
object Responses200Content570 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery473, responses: `200Content570`): Responses200Content570 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content570]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content570] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwnerQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content570`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
