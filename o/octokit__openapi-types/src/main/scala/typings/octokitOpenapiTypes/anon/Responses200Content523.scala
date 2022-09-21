package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content523 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery426
  
  var responses: `200Content523`
}
object Responses200Content523 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery426, responses: `200Content523`): Responses200Content523 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content523]
  }
  
  extension [Self <: Responses200Content523](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content523`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
