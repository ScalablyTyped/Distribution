package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLogRoot
  extends StObject
     with Entity {
  
  // Read-only. Nullable.
  var directoryAudits: js.UndefOr[NullableOption[js.Array[DirectoryAudit]]] = js.undefined
  
  var restrictedSignIns: js.UndefOr[NullableOption[js.Array[RestrictedSignIn]]] = js.undefined
  
  // Read-only. Nullable.
  var signIns: js.UndefOr[NullableOption[js.Array[SignIn]]] = js.undefined
}
object AuditLogRoot {
  
  inline def apply(): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogRoot]
  }
  
  extension [Self <: AuditLogRoot](x: Self) {
    
    inline def setDirectoryAudits(value: NullableOption[js.Array[DirectoryAudit]]): Self = StObject.set(x, "directoryAudits", value.asInstanceOf[js.Any])
    
    inline def setDirectoryAuditsNull: Self = StObject.set(x, "directoryAudits", null)
    
    inline def setDirectoryAuditsUndefined: Self = StObject.set(x, "directoryAudits", js.undefined)
    
    inline def setDirectoryAuditsVarargs(value: DirectoryAudit*): Self = StObject.set(x, "directoryAudits", js.Array(value :_*))
    
    inline def setRestrictedSignIns(value: NullableOption[js.Array[RestrictedSignIn]]): Self = StObject.set(x, "restrictedSignIns", value.asInstanceOf[js.Any])
    
    inline def setRestrictedSignInsNull: Self = StObject.set(x, "restrictedSignIns", null)
    
    inline def setRestrictedSignInsUndefined: Self = StObject.set(x, "restrictedSignIns", js.undefined)
    
    inline def setRestrictedSignInsVarargs(value: RestrictedSignIn*): Self = StObject.set(x, "restrictedSignIns", js.Array(value :_*))
    
    inline def setSignIns(value: NullableOption[js.Array[SignIn]]): Self = StObject.set(x, "signIns", value.asInstanceOf[js.Any])
    
    inline def setSignInsNull: Self = StObject.set(x, "signIns", null)
    
    inline def setSignInsUndefined: Self = StObject.set(x, "signIns", js.undefined)
    
    inline def setSignInsVarargs(value: SignIn*): Self = StObject.set(x, "signIns", js.Array(value :_*))
  }
}
