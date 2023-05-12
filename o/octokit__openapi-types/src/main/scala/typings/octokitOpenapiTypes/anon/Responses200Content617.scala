package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content617 extends StObject {
  
  var parameters: PathPullnumberRepoQuery473
  
  var responses: `200Content617`
}
object Responses200Content617 {
  
  inline def apply(parameters: PathPullnumberRepoQuery473, responses: `200Content617`): Responses200Content617 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content617]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content617] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content617`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
