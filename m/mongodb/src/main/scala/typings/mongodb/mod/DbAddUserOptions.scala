package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbAddUserOptions
  extends StObject
     with CommonOptions {
  
  var customData: js.UndefOr[js.Object] = js.undefined
  
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object DbAddUserOptions {
  
  inline def apply(): DbAddUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbAddUserOptions]
  }
  
  extension [Self <: DbAddUserOptions](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setRoles(value: js.Array[js.Object]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: js.Object*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
