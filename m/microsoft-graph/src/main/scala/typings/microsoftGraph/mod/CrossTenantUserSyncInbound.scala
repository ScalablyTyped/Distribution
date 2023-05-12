package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantUserSyncInbound extends StObject {
  
  var isSyncAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CrossTenantUserSyncInbound {
  
  inline def apply(): CrossTenantUserSyncInbound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantUserSyncInbound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossTenantUserSyncInbound] (val x: Self) extends AnyVal {
    
    inline def setIsSyncAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "isSyncAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsSyncAllowedNull: Self = StObject.set(x, "isSyncAllowed", null)
    
    inline def setIsSyncAllowedUndefined: Self = StObject.set(x, "isSyncAllowed", js.undefined)
  }
}
