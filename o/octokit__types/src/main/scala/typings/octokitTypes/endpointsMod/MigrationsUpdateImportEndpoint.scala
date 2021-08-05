package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsUpdateImportEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[String] = js.undefined
  
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[String] = js.undefined
}
object MigrationsUpdateImportEndpoint {
  
  inline def apply(owner: String, repo: String): MigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportEndpoint]
  }
  
  extension [Self <: MigrationsUpdateImportEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setVcs_password(value: String): Self = StObject.set(x, "vcs_password", value.asInstanceOf[js.Any])
    
    inline def setVcs_passwordUndefined: Self = StObject.set(x, "vcs_password", js.undefined)
    
    inline def setVcs_username(value: String): Self = StObject.set(x, "vcs_username", value.asInstanceOf[js.Any])
    
    inline def setVcs_usernameUndefined: Self = StObject.set(x, "vcs_username", js.undefined)
  }
}
