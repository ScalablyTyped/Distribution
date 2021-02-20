package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupContext extends StObject {
  
  /** The identifier of the backup. */
  var backupId: js.UndefOr[String] = js.native
  
  /** This is always *sql#backupContext*. */
  var kind: js.UndefOr[String] = js.native
}
object BackupContext {
  
  @scala.inline
  def apply(): BackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupContext]
  }
  
  @scala.inline
  implicit class BackupContextMutableBuilder[Self <: BackupContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
