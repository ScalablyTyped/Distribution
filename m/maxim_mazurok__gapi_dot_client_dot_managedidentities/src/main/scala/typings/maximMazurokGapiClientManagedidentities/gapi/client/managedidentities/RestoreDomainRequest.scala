package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDomainRequest extends StObject {
  
  /** Required. ID of the backup to be restored */
  var backupId: js.UndefOr[String] = js.undefined
}
object RestoreDomainRequest {
  
  inline def apply(): RestoreDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDomainRequest]
  }
  
  extension [Self <: RestoreDomainRequest](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
  }
}
