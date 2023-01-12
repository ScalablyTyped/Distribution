package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonCustomrolesTotalcount extends StObject {
  
  var parameters: PathOrganizationid
  
  var responses: `200ContentApplicationjsonCustomrolesTotalcount`
}
object Responses200ContentApplicationjsonCustomrolesTotalcount {
  
  inline def apply(parameters: PathOrganizationid, responses: `200ContentApplicationjsonCustomrolesTotalcount`): Responses200ContentApplicationjsonCustomrolesTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonCustomrolesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonCustomrolesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrganizationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCustomrolesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
