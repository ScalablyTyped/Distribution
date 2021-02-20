package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
@js.native
trait DatabaseAuthResponse extends StObject {
  
  // Username
  var name: String = js.native
  
  // Operation status
  var ok: Boolean = js.native
  
  // List of user roles
  var roles: js.Array[String] = js.native
}
object DatabaseAuthResponse {
  
  @scala.inline
  def apply(name: String, ok: Boolean, roles: js.Array[String]): DatabaseAuthResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAuthResponse]
  }
  
  @scala.inline
  implicit class DatabaseAuthResponseMutableBuilder[Self <: DatabaseAuthResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
