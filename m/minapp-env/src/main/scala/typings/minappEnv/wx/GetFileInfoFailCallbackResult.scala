package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInfoFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail file not exist': 指定的 filePath 找不到文件; */
  var errMsg: String
}
object GetFileInfoFailCallbackResult {
  
  inline def apply(errMsg: String): GetFileInfoFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoFailCallbackResult]
  }
  
  extension [Self <: GetFileInfoFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
