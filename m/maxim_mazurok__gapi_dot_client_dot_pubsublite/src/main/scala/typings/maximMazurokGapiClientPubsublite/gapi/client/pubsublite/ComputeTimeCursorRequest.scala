package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeTimeCursorRequest extends StObject {
  
  /** Required. The partition for which we should compute the cursor. */
  var partition: js.UndefOr[String] = js.undefined
  
  /** Required. The target publish or event time. Specifying a future time will return an unset cursor. */
  var target: js.UndefOr[TimeTarget] = js.undefined
}
object ComputeTimeCursorRequest {
  
  inline def apply(): ComputeTimeCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeTimeCursorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeTimeCursorRequest] (val x: Self) extends AnyVal {
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTarget(value: TimeTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
