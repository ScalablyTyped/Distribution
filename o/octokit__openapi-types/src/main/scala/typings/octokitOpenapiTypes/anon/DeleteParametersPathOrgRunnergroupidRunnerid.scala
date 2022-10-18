package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRunnergroupidRunnerid extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    *
    * Removes a self-hosted runner from a group configured in an organization. The runner is then returned to the default group.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathOrgRunnergroupidRunnerid
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    *
    * Adds a self-hosted runner to a runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org`
    * scope to use this endpoint.
    */
  var put: ParametersPathOrgRunnergroupidRunnerid
}
object DeleteParametersPathOrgRunnergroupidRunnerid {
  
  inline def apply(delete: ParametersPathOrgRunnergroupidRunnerid, put: ParametersPathOrgRunnergroupidRunnerid): DeleteParametersPathOrgRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRunnergroupidRunnerid]
  }
  
  extension [Self <: DeleteParametersPathOrgRunnergroupidRunnerid](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRunnergroupidRunnerid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgRunnergroupidRunnerid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
