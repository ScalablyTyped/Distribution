package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRunneridResponses extends StObject {
  
  /**
    * Delete a self-hosted runner from an organization
    * @description Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathRunneridResponses
  
  /**
    * Get a self-hosted runner for an organization
    * @description Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathRunnerid
}
object DeleteParametersPathRunneridResponses {
  
  inline def apply(delete: ParametersPathRunneridResponses, get: ParametersPathRunnerid): DeleteParametersPathRunneridResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRunneridResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRunneridResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRunneridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRunnerid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
