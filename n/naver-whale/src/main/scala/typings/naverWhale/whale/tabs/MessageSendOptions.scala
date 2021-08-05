package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSendOptions extends StObject {
  
  /** Optional. Send a message to a specific frame identified by frameId instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
}
object MessageSendOptions {
  
  inline def apply(): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSendOptions]
  }
  
  extension [Self <: MessageSendOptions](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
