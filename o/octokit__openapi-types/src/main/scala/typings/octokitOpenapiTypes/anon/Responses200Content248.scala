package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content248 extends StObject {
  
  var parameters: PathRepoUsername
  
  var responses: `200Content248`
}
object Responses200Content248 {
  
  inline def apply(parameters: PathRepoUsername, responses: `200Content248`): Responses200Content248 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content248]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content248] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content248`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
