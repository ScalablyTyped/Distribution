package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRepositoryidSecretname extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var repository_id: Double
  
  var secret_name: String
}
object OrgRepositoryidSecretname {
  
  inline def apply(org_ : String, repository_id: Double, secret_name: String): OrgRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRepositoryidSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgRepositoryidSecretname] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
