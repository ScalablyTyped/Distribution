package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddUserOptions
  extends StObject
     with CommonOptions {
  
  var customData: js.UndefOr[js.Object] = js.undefined
  
  var fsync: Boolean
  
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object AddUserOptions {
  
  inline def apply(fsync: Boolean): AddUserOptions = {
    val __obj = js.Dynamic.literal(fsync = fsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserOptions]
  }
  
  extension [Self <: AddUserOptions](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[js.Object]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: js.Object*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
