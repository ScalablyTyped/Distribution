package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCommitCreatedat extends StObject {
  
  var parameters: `639`
  
  var responses: `200ContentApplicationjsonCommitCreatedat`
}
object Responses200ContentApplicationjsonCommitCreatedat {
  
  inline def apply(parameters: `639`, responses: `200ContentApplicationjsonCommitCreatedat`): Responses200ContentApplicationjsonCommitCreatedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCommitCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCommitCreatedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCommitCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
