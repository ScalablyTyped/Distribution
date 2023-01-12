package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegisteredUser extends StObject {
  
  var accessed: js.Date
  
  var created: js.Date
  
  var name: String
  
  var username: String
}
object IRegisteredUser {
  
  inline def apply(accessed: js.Date, created: js.Date, name: String, username: String): IRegisteredUser = {
    val __obj = js.Dynamic.literal(accessed = accessed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisteredUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRegisteredUser] (val x: Self) extends AnyVal {
    
    inline def setAccessed(value: js.Date): Self = StObject.set(x, "accessed", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
