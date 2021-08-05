package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Contents
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateInstallationAccessTokenResponseData extends StObject {
  
  var expires_at: String
  
  var permissions: Contents
  
  var repositories: js.Array[Allowmergecommit]
  
  var repository_selection: all | selected
  
  var token: String
}
object AppsCreateInstallationAccessTokenResponseData {
  
  inline def apply(
    expires_at: String,
    permissions: Contents,
    repositories: js.Array[Allowmergecommit],
    repository_selection: all | selected,
    token: String
  ): AppsCreateInstallationAccessTokenResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenResponseData]
  }
  
  extension [Self <: AppsCreateInstallationAccessTokenResponseData](x: Self) {
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Contents): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    inline def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
