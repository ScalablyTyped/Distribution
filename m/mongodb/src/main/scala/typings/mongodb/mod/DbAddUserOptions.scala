package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbAddUserOptions extends CommonOptions {
  
  var customData: js.UndefOr[js.Object] = js.native
  
  var roles: js.UndefOr[js.Array[js.Object]] = js.native
}
object DbAddUserOptions {
  
  @scala.inline
  def apply(): DbAddUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbAddUserOptions]
  }
  
  @scala.inline
  implicit class DbAddUserOptionsMutableBuilder[Self <: DbAddUserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[js.Object]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: js.Object*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
