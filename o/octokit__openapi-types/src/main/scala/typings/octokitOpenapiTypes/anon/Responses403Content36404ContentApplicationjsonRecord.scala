package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content36404ContentApplicationjsonRecord extends StObject {
  
  var parameters: PathGistidString
  
  var responses: `403Content36404ContentApplicationjsonRecord`
}
object Responses403Content36404ContentApplicationjsonRecord {
  
  inline def apply(parameters: PathGistidString, responses: `403Content36404ContentApplicationjsonRecord`): Responses403Content36404ContentApplicationjsonRecord = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content36404ContentApplicationjsonRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content36404ContentApplicationjsonRecord] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content36404ContentApplicationjsonRecord`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
