package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Username extends StObject {
  
  var username: String
}
object Username {
  
  inline def apply(username: String): Username = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Username]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
