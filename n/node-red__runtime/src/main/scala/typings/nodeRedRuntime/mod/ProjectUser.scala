package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectUser extends StObject {
  
  var username: String
}
object ProjectUser {
  
  inline def apply(username: String): ProjectUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectUser] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
