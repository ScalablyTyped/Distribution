package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRunneridResponses extends StObject {
  
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathOrgRunneridResponses
  
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgRunnerid
}
object DeleteParametersPathOrgRunneridResponses {
  
  inline def apply(delete: ParametersPathOrgRunneridResponses, get: ParametersPathOrgRunnerid): DeleteParametersPathOrgRunneridResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRunneridResponses]
  }
  
  extension [Self <: DeleteParametersPathOrgRunneridResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRunneridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOrgRunnerid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
