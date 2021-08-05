package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxSaveFileSuccessCallbackResult extends StObject {
  
  /** 存储后的文件路径 */
  var savedFilePath: Double
}
object WxSaveFileSuccessCallbackResult {
  
  inline def apply(savedFilePath: Double): WxSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxSaveFileSuccessCallbackResult]
  }
  
  extension [Self <: WxSaveFileSuccessCallbackResult](x: Self) {
    
    inline def setSavedFilePath(value: Double): Self = StObject.set(x, "savedFilePath", value.asInstanceOf[js.Any])
  }
}
