package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersArray extends StObject {
  
  /** @description The username for users */
  var users: js.Array[String]
}
object UsersArray {
  
  inline def apply(users: js.Array[String]): UsersArray = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersArray]
  }
  
  extension [Self <: UsersArray](x: Self) {
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
