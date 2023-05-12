package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInstallationidRepositoryid extends StObject {
  
  /**
    * Remove a repository from an app installation
    * @description Remove a single repository from an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
    */
  var delete: ParametersPathInstallationidRepositoryid
  
  /**
    * Add a repository to an app installation
    * @description Add a single repository to an installation. The authenticated user must have admin access to the repository.
    *
    * You must use a personal access token (which you can create via the [command line](https://docs.github.com/github/authenticating-to-github/creating-a-personal-access-token) or [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication)) to access this endpoint.
    */
  var put: ParametersPathInstallationidRepositoryid
}
object DeleteParametersPathInstallationidRepositoryid {
  
  inline def apply(delete: ParametersPathInstallationidRepositoryid, put: ParametersPathInstallationidRepositoryid): DeleteParametersPathInstallationidRepositoryid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInstallationidRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathInstallationidRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathInstallationidRepositoryid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathInstallationidRepositoryid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
