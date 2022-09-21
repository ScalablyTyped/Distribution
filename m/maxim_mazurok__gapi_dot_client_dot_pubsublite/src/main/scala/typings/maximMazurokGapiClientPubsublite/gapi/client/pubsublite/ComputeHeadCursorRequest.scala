package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeHeadCursorRequest extends StObject {
  
  /** Required. The partition for which we should compute the head cursor. */
  var partition: js.UndefOr[String] = js.undefined
}
object ComputeHeadCursorRequest {
  
  inline def apply(): ComputeHeadCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeHeadCursorRequest]
  }
  
  extension [Self <: ComputeHeadCursorRequest](x: Self) {
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
