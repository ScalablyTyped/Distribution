package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionCursor extends StObject {
  
  /** The value of the cursor. */
  var cursor: js.UndefOr[Cursor] = js.native
  
  /** The partition this is for. */
  var partition: js.UndefOr[String] = js.native
}
object PartitionCursor {
  
  @scala.inline
  def apply(): PartitionCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionCursor]
  }
  
  @scala.inline
  implicit class PartitionCursorMutableBuilder[Self <: PartitionCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
