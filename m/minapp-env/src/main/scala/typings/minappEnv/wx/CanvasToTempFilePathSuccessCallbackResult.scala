package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathSuccessCallbackResult extends StObject {
  
  /** 生成文件的临时路径 */
  var tempFilePath: String
}
object CanvasToTempFilePathSuccessCallbackResult {
  
  inline def apply(tempFilePath: String): CanvasToTempFilePathSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathSuccessCallbackResult]
  }
  
  extension [Self <: CanvasToTempFilePathSuccessCallbackResult](x: Self) {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
