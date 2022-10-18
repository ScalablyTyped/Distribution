package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonMachinesTotalcount extends StObject {
  
  /**
    * List the machine types a codespace can transition to use.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonMachinesTotalcount
}
object GetResponses200ContentApplicationjsonMachinesTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonMachinesTotalcount): GetResponses200ContentApplicationjsonMachinesTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonMachinesTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonMachinesTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonMachinesTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
