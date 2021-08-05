package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
trait DatabaseAuthResponse extends StObject {
  
  // Username
  var name: String
  
  // Operation status
  var ok: Boolean
  
  // List of user roles
  var roles: js.Array[String]
}
object DatabaseAuthResponse {
  
  inline def apply(name: String, ok: Boolean, roles: js.Array[String]): DatabaseAuthResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAuthResponse]
  }
  
  extension [Self <: DatabaseAuthResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
