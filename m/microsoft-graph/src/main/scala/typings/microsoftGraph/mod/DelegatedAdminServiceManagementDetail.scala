package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminServiceManagementDetail
  extends StObject
     with Entity {
  
  // The URL of the management portal for the managed service. Read-only.
  var serviceManagementUrl: js.UndefOr[String] = js.undefined
  
  // The name of a managed service. Read-only.
  var serviceName: js.UndefOr[String] = js.undefined
}
object DelegatedAdminServiceManagementDetail {
  
  inline def apply(): DelegatedAdminServiceManagementDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminServiceManagementDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminServiceManagementDetail] (val x: Self) extends AnyVal {
    
    inline def setServiceManagementUrl(value: String): Self = StObject.set(x, "serviceManagementUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceManagementUrlUndefined: Self = StObject.set(x, "serviceManagementUrl", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
