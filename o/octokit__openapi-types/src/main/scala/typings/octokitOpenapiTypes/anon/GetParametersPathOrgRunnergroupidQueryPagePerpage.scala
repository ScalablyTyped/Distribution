package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgRunnergroupidQueryPagePerpage extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud and GitHub Enterprise Server. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Lists the repositories with access to a self-hosted runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgRunnergroupidQueryPagePerpage
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Replaces the list of repositories that have access to a self-hosted runner group configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersPathOrgRunnergroupidQueryPagePerpage {
  
  inline def apply(
    get: ParametersPathOrgRunnergroupidQueryPagePerpage,
    put: ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersPathOrgRunnergroupidQueryPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgRunnergroupidQueryPagePerpage]
  }
  
  extension [Self <: GetParametersPathOrgRunnergroupidQueryPagePerpage](x: Self) {
    
    inline def setGet(value: ParametersPathOrgRunnergroupidQueryPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
