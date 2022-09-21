package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOption extends StObject {
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var sdpTransform: js.UndefOr[js.Function] = js.undefined
}
object CallOption {
  
  inline def apply(): CallOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOption]
  }
  
  extension [Self <: CallOption](x: Self) {
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSdpTransform(value: js.Function): Self = StObject.set(x, "sdpTransform", value.asInstanceOf[js.Any])
    
    inline def setSdpTransformUndefined: Self = StObject.set(x, "sdpTransform", js.undefined)
  }
}
