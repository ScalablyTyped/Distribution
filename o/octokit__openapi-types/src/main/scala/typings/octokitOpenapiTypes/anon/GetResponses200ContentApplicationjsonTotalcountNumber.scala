package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonTotalcountNumber extends StObject {
  
  /** Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint. */
  var get: Responses200ContentApplicationjsonTotalcountNumber
}
object GetResponses200ContentApplicationjsonTotalcountNumber {
  
  inline def apply(get: Responses200ContentApplicationjsonTotalcountNumber): GetResponses200ContentApplicationjsonTotalcountNumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonTotalcountNumber]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonTotalcountNumber](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonTotalcountNumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
