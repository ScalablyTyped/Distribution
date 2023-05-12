package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content285 extends StObject {
  
  var parameters: PathIssuenumberQueryPage
  
  var responses: `200Content285`
}
object Responses200Content285 {
  
  inline def apply(parameters: PathIssuenumberQueryPage, responses: `200Content285`): Responses200Content285 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content285]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content285] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content285`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
