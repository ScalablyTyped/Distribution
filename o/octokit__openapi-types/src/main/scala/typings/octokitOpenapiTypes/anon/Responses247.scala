package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses247 extends StObject {
  
  var parameters: PathRepoUsername
  
  var responses: `247`
}
object Responses247 {
  
  inline def apply(parameters: PathRepoUsername, responses: `247`): Responses247 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses247]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses247] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `247`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
