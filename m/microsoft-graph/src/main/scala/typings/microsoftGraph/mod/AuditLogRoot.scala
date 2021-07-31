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
  
  @scala.inline
  def apply(): AuditLogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLogRoot]
  }
  
  @scala.inline
  implicit class AuditLogRootMutableBuilder[Self <: AuditLogRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryAudits(value: NullableOption[js.Array[DirectoryAudit]]): Self = StObject.set(x, "directoryAudits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryAuditsNull: Self = StObject.set(x, "directoryAudits", null)
    
    @scala.inline
    def setDirectoryAuditsUndefined: Self = StObject.set(x, "directoryAudits", js.undefined)
    
    @scala.inline
    def setDirectoryAuditsVarargs(value: DirectoryAudit*): Self = StObject.set(x, "directoryAudits", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedSignIns(value: NullableOption[js.Array[RestrictedSignIn]]): Self = StObject.set(x, "restrictedSignIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedSignInsNull: Self = StObject.set(x, "restrictedSignIns", null)
    
    @scala.inline
    def setRestrictedSignInsUndefined: Self = StObject.set(x, "restrictedSignIns", js.undefined)
    
    @scala.inline
    def setRestrictedSignInsVarargs(value: RestrictedSignIn*): Self = StObject.set(x, "restrictedSignIns", js.Array(value :_*))
    
    @scala.inline
    def setSignIns(value: NullableOption[js.Array[SignIn]]): Self = StObject.set(x, "signIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInsNull: Self = StObject.set(x, "signIns", null)
    
    @scala.inline
    def setSignInsUndefined: Self = StObject.set(x, "signIns", js.undefined)
    
    @scala.inline
    def setSignInsVarargs(value: SignIn*): Self = StObject.set(x, "signIns", js.Array(value :_*))
  }
}
