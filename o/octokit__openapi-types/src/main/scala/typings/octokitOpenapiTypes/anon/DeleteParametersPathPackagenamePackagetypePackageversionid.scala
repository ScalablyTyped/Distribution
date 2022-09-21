package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagenamePackagetypePackageversionid extends StObject {
  
  /**
    * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  var delete: ParametersPathPackagenamePackagetypePackageversionid
  
  /**
    * Gets a specific package version for a public package owned by a specified user.
    *
    * At this time, to use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackageversionidUsername
}
object DeleteParametersPathPackagenamePackagetypePackageversionid {
  
  inline def apply(
    delete: ParametersPathPackagenamePackagetypePackageversionid,
    get: ParametersPathPackageversionidUsername
  ): DeleteParametersPathPackagenamePackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagenamePackagetypePackageversionid]
  }
  
  extension [Self <: DeleteParametersPathPackagenamePackagetypePackageversionid](x: Self) {
    
    inline def setDelete(value: ParametersPathPackagenamePackagetypePackageversionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackageversionidUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
