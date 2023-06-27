package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRepositoriesTotalcount404 extends StObject {
  
  var parameters: PathSecretnameQuery
  
  var responses: `200ContentApplicationjsonRepositoriesTotalcount404`
}
object Responses200ContentApplicationjsonRepositoriesTotalcount404 {
  
  inline def apply(parameters: PathSecretnameQuery, responses: `200ContentApplicationjsonRepositoriesTotalcount404`): Responses200ContentApplicationjsonRepositoriesTotalcount404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRepositoriesTotalcount404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonRepositoriesTotalcount404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretnameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotalcount404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
