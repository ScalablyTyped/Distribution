package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonIdletimeoutnotice extends StObject {
  
  var parameters: PathCodespacenameOrg
  
  var responses: `200ContentApplicationjsonIdletimeoutnotice`
}
object Responses200ContentApplicationjsonIdletimeoutnotice {
  
  inline def apply(parameters: PathCodespacenameOrg, responses: `200ContentApplicationjsonIdletimeoutnotice`): Responses200ContentApplicationjsonIdletimeoutnotice = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonIdletimeoutnotice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonIdletimeoutnotice] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacenameOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIdletimeoutnotice`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
