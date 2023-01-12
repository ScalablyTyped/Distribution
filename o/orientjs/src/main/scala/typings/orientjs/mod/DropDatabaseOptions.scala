package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDatabaseOptions extends StObject {
  
  var options: js.UndefOr[DatabaseOptions] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object DropDatabaseOptions {
  
  inline def apply(): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDatabaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDatabaseOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: DatabaseOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
