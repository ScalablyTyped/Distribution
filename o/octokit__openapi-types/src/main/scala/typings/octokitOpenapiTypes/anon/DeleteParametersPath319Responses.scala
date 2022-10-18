package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath319Responses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPath319Responses
  
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath319
}
object DeleteParametersPath319Responses {
  
  inline def apply(delete: ParametersPath319Responses, get: ParametersPath319): DeleteParametersPath319Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath319Responses]
  }
  
  extension [Self <: DeleteParametersPath319Responses](x: Self) {
    
    inline def setDelete(value: ParametersPath319Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath319): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
