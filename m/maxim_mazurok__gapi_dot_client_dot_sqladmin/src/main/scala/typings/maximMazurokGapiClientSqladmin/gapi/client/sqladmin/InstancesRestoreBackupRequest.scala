package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesRestoreBackupRequest extends StObject {
  
  /** Parameters required to perform the restore backup operation. */
  var restoreBackupContext: js.UndefOr[RestoreBackupContext] = js.undefined
}
object InstancesRestoreBackupRequest {
  
  inline def apply(): InstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRestoreBackupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesRestoreBackupRequest] (val x: Self) extends AnyVal {
    
    inline def setRestoreBackupContext(value: RestoreBackupContext): Self = StObject.set(x, "restoreBackupContext", value.asInstanceOf[js.Any])
    
    inline def setRestoreBackupContextUndefined: Self = StObject.set(x, "restoreBackupContext", js.undefined)
  }
}
