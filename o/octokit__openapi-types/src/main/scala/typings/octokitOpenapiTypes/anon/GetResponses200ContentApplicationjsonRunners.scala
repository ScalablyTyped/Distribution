package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRunners extends StObject {
  
  /**
    * List self-hosted runners for an organization
    * @description Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRunners
}
object GetResponses200ContentApplicationjsonRunners {
  
  inline def apply(get: Responses200ContentApplicationjsonRunners): GetResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRunners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonRunners] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonRunners): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
