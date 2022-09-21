package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRunnergroupidResponses extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Deletes a self-hosted runner group for an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathOrgRunnergroupidResponses
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Gets a specific self-hosted runner group for an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgRunnergroupid
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Updates the `name` and `visibility` of a self-hosted runner group in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonSelectedworkflows
}
object DeleteParametersPathOrgRunnergroupidResponses {
  
  inline def apply(
    delete: ParametersPathOrgRunnergroupidResponses,
    get: ParametersPathOrgRunnergroupid,
    patch: RequestBodyContentApplicationjsonSelectedworkflows
  ): DeleteParametersPathOrgRunnergroupidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRunnergroupidResponses]
  }
  
  extension [Self <: DeleteParametersPathOrgRunnergroupidResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRunnergroupidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOrgRunnergroupid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonSelectedworkflows): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
