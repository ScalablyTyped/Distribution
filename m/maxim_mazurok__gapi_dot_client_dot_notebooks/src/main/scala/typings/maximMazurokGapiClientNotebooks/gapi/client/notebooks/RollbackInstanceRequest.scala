package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackInstanceRequest extends StObject {
  
  /** Required. The snapshot for rollback. Example: "projects/test-project/global/snapshots/krwlzipynril". */
  var targetSnapshot: js.UndefOr[String] = js.undefined
}
object RollbackInstanceRequest {
  
  inline def apply(): RollbackInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackInstanceRequest]
  }
  
  extension [Self <: RollbackInstanceRequest](x: Self) {
    
    inline def setTargetSnapshot(value: String): Self = StObject.set(x, "targetSnapshot", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotUndefined: Self = StObject.set(x, "targetSnapshot", js.undefined)
  }
}
