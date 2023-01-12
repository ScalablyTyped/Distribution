package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathEnterpriseRunneridResponses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from an enterprise. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathEnterpriseRunneridResponses
  
  /**
    * Gets a specific self-hosted runner configured in an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersPathEnterpriseRunnerid
}
object DeleteParametersPathEnterpriseRunneridResponses {
  
  inline def apply(delete: ParametersPathEnterpriseRunneridResponses, get: ParametersPathEnterpriseRunnerid): DeleteParametersPathEnterpriseRunneridResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathEnterpriseRunneridResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathEnterpriseRunneridResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathEnterpriseRunneridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathEnterpriseRunnerid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
