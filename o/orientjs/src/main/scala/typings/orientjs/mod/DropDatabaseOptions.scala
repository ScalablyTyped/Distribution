package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDatabaseOptions extends StObject {
  
  var options: js.UndefOr[DatabaseOptions] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object DropDatabaseOptions {
  
  @scala.inline
  def apply(): DropDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDatabaseOptions]
  }
  
  @scala.inline
  implicit class DropDatabaseOptionsMutableBuilder[Self <: DropDatabaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: DatabaseOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
