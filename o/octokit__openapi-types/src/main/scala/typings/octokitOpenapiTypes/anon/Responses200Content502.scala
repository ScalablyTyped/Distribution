package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content502 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery407
  
  var responses: `200Content502`
}
object Responses200Content502 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery407, responses: `200Content502`): Responses200Content502 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content502]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content502] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content502`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
