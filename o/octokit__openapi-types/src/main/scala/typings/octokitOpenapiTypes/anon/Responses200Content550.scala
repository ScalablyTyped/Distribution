package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content550 extends StObject {
  
  var parameters: PathPullnumberRepoQuery407
  
  var responses: `200Content550`
}
object Responses200Content550 {
  
  inline def apply(parameters: PathPullnumberRepoQuery407, responses: `200Content550`): Responses200Content550 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content550]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content550] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepoQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content550`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
