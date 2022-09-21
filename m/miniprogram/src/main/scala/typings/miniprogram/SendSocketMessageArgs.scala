package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendSocketMessageArgs
  extends StObject
     with AsyncCallback[Any] {
  
  var data: String
  
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}
object SendSocketMessageArgs {
  
  inline def apply(data: String): SendSocketMessageArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSocketMessageArgs]
  }
  
  extension [Self <: SendSocketMessageArgs](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
  }
}
