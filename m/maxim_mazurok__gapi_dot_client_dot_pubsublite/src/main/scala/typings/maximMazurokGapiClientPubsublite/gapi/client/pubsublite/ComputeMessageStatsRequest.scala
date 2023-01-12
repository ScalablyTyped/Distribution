package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeMessageStatsRequest extends StObject {
  
  /**
    * The exclusive end of the range. The range is empty if end_cursor <= start_cursor. Specifying a start_cursor before the first message and an end_cursor after the last message will
    * retrieve all messages.
    */
  var endCursor: js.UndefOr[Cursor] = js.undefined
  
  /** Required. The partition for which we should compute message stats. */
  var partition: js.UndefOr[String] = js.undefined
  
  /** The inclusive start of the range. */
  var startCursor: js.UndefOr[Cursor] = js.undefined
}
object ComputeMessageStatsRequest {
  
  inline def apply(): ComputeMessageStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeMessageStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeMessageStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndCursor(value: Cursor): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setStartCursor(value: Cursor): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
