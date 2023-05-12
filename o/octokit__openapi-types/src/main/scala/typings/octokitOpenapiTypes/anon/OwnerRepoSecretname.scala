package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerRepoSecretname extends StObject {
  
  var owner: String
  
  var repo: String
  
  var secret_name: String
}
object OwnerRepoSecretname {
  
  inline def apply(owner: String, repo: String, secret_name: String): OwnerRepoSecretname = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRepoSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnerRepoSecretname] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
