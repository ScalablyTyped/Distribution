package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Users extends StObject {
  
  /** @description The username for users */
  var users: js.Array[String]
}
object Users {
  
  inline def apply(users: js.Array[String]): Users = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Users]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Users] (val x: Self) extends AnyVal {
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
