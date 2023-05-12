package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content571 extends StObject {
  
  var parameters: PathOwnerRefRepoQuery473
  
  var responses: `200Content571`
}
object Responses200Content571 {
  
  inline def apply(parameters: PathOwnerRefRepoQuery473, responses: `200Content571`): Responses200Content571 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content571]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content571] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content571`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
