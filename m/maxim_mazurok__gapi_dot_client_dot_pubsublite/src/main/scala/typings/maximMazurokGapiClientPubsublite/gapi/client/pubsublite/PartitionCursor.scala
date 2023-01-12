package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionCursor extends StObject {
  
  /** The value of the cursor. */
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  /** The partition this is for. */
  var partition: js.UndefOr[String] = js.undefined
}
object PartitionCursor {
  
  inline def apply(): PartitionCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionCursor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionCursor] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}
