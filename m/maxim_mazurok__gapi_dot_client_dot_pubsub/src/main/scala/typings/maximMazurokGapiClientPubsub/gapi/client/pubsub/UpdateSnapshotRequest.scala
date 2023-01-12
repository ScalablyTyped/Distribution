package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotRequest extends StObject {
  
  /** Required. The updated snapshot object. */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
  
  /** Required. Indicates which fields in the provided snapshot to update. Must be specified and non-empty. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateSnapshotRequest {
  
  inline def apply(): UpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
