package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminAccessDetails extends StObject {
  
  // The directory roles that the Microsoft partner is assigned in the customer tenant.
  var unifiedRoles: js.UndefOr[js.Array[UnifiedRole]] = js.undefined
}
object DelegatedAdminAccessDetails {
  
  inline def apply(): DelegatedAdminAccessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminAccessDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminAccessDetails] (val x: Self) extends AnyVal {
    
    inline def setUnifiedRoles(value: js.Array[UnifiedRole]): Self = StObject.set(x, "unifiedRoles", value.asInstanceOf[js.Any])
    
    inline def setUnifiedRolesUndefined: Self = StObject.set(x, "unifiedRoles", js.undefined)
    
    inline def setUnifiedRolesVarargs(value: UnifiedRole*): Self = StObject.set(x, "unifiedRoles", js.Array(value*))
  }
}
