package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClipboardDataSuccessCallbackOption extends StObject {
  
  /** 剪贴板的内容 */
  var data: String
}
object GetClipboardDataSuccessCallbackOption {
  
  inline def apply(data: String): GetClipboardDataSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipboardDataSuccessCallbackOption]
  }
  
  extension [Self <: GetClipboardDataSuccessCallbackOption](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
