package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStopCallbackResult extends StObject {
  
  /** 录音文件的临时路径 */
  var tempFilePath: String
}
object OnStopCallbackResult {
  
  inline def apply(tempFilePath: String): OnStopCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStopCallbackResult]
  }
  
  extension [Self <: OnStopCallbackResult](x: Self) {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
