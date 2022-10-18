package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var user: typings.nextAuth.coreTypesMod.User
}
object User {
  
  inline def apply(user: typings.nextAuth.coreTypesMod.User): User = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setUser(value: typings.nextAuth.coreTypesMod.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
