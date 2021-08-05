package typings.nodeHueApi.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegisteredUser extends StObject {
  
  var accessed: Date
  
  var created: Date
  
  var name: String
  
  var username: String
}
object IRegisteredUser {
  
  inline def apply(accessed: Date, created: Date, name: String, username: String): IRegisteredUser = {
    val __obj = js.Dynamic.literal(accessed = accessed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisteredUser]
  }
  
  extension [Self <: IRegisteredUser](x: Self) {
    
    inline def setAccessed(value: Date): Self = StObject.set(x, "accessed", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
