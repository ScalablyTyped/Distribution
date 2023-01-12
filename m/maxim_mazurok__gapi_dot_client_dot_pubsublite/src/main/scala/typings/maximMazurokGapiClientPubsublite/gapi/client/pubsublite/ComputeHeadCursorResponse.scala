package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeHeadCursorResponse extends StObject {
  
  /** The head cursor. */
  var headCursor: js.UndefOr[Cursor] = js.undefined
}
object ComputeHeadCursorResponse {
  
  inline def apply(): ComputeHeadCursorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeHeadCursorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeHeadCursorResponse] (val x: Self) extends AnyVal {
    
    inline def setHeadCursor(value: Cursor): Self = StObject.set(x, "headCursor", value.asInstanceOf[js.Any])
    
    inline def setHeadCursorUndefined: Self = StObject.set(x, "headCursor", js.undefined)
  }
}
