package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLogRoot
  extends StObject
     with Entity {
  
  var directoryAudits: js.UndefOr[NullableOption[js.Array[DirectoryAudit]]] = js.undefined
  
  var provisioning: js.UndefOr[NullableOption[js.Array[ProvisioningObjectSummary]]] = js.undefined
  
  var signIns: js.UndefOr[NullableOption[js.Array[SignIn]]] = js.undefined
}
object AuditLogRoot {
  
  inline def apply(): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditLogRoot] (val x: Self) extends AnyVal {
    
    inline def setDirectoryAudits(value: NullableOption[js.Array[DirectoryAudit]]): Self = StObject.set(x, "directoryAudits", value.asInstanceOf[js.Any])
    
    inline def setDirectoryAuditsNull: Self = StObject.set(x, "directoryAudits", null)
    
    inline def setDirectoryAuditsUndefined: Self = StObject.set(x, "directoryAudits", js.undefined)
    
    inline def setDirectoryAuditsVarargs(value: DirectoryAudit*): Self = StObject.set(x, "directoryAudits", js.Array(value*))
    
    inline def setProvisioning(value: NullableOption[js.Array[ProvisioningObjectSummary]]): Self = StObject.set(x, "provisioning", value.asInstanceOf[js.Any])
    
    inline def setProvisioningNull: Self = StObject.set(x, "provisioning", null)
    
    inline def setProvisioningUndefined: Self = StObject.set(x, "provisioning", js.undefined)
    
    inline def setProvisioningVarargs(value: ProvisioningObjectSummary*): Self = StObject.set(x, "provisioning", js.Array(value*))
    
    inline def setSignIns(value: NullableOption[js.Array[SignIn]]): Self = StObject.set(x, "signIns", value.asInstanceOf[js.Any])
    
    inline def setSignInsNull: Self = StObject.set(x, "signIns", null)
    
    inline def setSignInsUndefined: Self = StObject.set(x, "signIns", js.undefined)
    
    inline def setSignInsVarargs(value: SignIn*): Self = StObject.set(x, "signIns", js.Array(value*))
  }
}
