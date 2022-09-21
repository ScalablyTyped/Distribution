package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreBackupContext extends StObject {
  
  /** The ID of the backup run to restore from. */
  var backupRunId: js.UndefOr[String] = js.undefined
  
  /** The ID of the instance that the backup was taken from. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#restoreBackupContext`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The full project ID of the source instance. */
  var project: js.UndefOr[String] = js.undefined
}
object RestoreBackupContext {
  
  inline def apply(): RestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreBackupContext]
  }
  
  extension [Self <: RestoreBackupContext](x: Self) {
    
    inline def setBackupRunId(value: String): Self = StObject.set(x, "backupRunId", value.asInstanceOf[js.Any])
    
    inline def setBackupRunIdUndefined: Self = StObject.set(x, "backupRunId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
