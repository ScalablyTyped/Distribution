package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail permission denied, open ${path}': 指定的 path 路径没有读权限;
    * - 'fail no such file or directory ${path}': 文件不存在; */
  var errMsg: String
}
object StatFailCallbackResult {
  
  inline def apply(errMsg: String): StatFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatFailCallbackResult]
  }
  
  extension [Self <: StatFailCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
