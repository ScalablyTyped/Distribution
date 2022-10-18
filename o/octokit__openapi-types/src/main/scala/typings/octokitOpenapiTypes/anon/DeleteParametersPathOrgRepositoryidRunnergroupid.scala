package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRepositoryidRunnergroupid extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    *
    * Removes a repository from the list of selected repositories that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see "[Create a self-hosted runner group for an organization](#create-a-self-hosted-runner-group-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var delete: ParametersPathOrgRepositoryidRunnergroupid
}
object DeleteParametersPathOrgRepositoryidRunnergroupid {
  
  inline def apply(delete: ParametersPathOrgRepositoryidRunnergroupid): DeleteParametersPathOrgRepositoryidRunnergroupid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRepositoryidRunnergroupid]
  }
  
  extension [Self <: DeleteParametersPathOrgRepositoryidRunnergroupid](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRepositoryidRunnergroupid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
