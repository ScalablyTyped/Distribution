package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404ContentApplicationjsonRecord extends StObject {
  
  var parameters: PathGistid
  
  var responses: `404ContentApplicationjsonRecord`
}
object Responses404ContentApplicationjsonRecord {
  
  inline def apply(parameters: PathGistid, responses: `404ContentApplicationjsonRecord`): Responses404ContentApplicationjsonRecord = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404ContentApplicationjsonRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404ContentApplicationjsonRecord] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404ContentApplicationjsonRecord`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
