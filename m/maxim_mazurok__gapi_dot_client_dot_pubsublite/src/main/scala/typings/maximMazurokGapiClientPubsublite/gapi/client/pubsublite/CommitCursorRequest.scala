package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitCursorRequest extends StObject {
  
  /** The new value for the committed cursor. */
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  /** The partition for which to update the cursor. Partitions are zero indexed, so `partition` must be in the range [0, topic.num_partitions). */
  var partition: js.UndefOr[String] = js.undefined
}
object CommitCursorRequest {
  
  inline def apply(): CommitCursorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitCursorRequest]
  }
  
  extension [Self <: CommitCursorRequest](x: Self) {
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
