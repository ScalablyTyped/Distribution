package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeTimeCursorResponse extends StObject {
  
  /**
    * If present, the cursor references the first message with time greater than or equal to the specified target time. If such a message cannot be found, the cursor will be unset (i.e.
    * `cursor` is not present).
    */
  var cursor: js.UndefOr[Cursor] = js.undefined
}
object ComputeTimeCursorResponse {
  
  inline def apply(): ComputeTimeCursorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeTimeCursorResponse]
  }
  
  extension [Self <: ComputeTimeCursorResponse](x: Self) {
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
  }
}
