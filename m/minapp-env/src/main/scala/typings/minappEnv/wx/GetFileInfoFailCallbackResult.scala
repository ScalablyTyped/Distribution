package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail file not exist': 指定的 filePath 找不到文件; */
  var errMsg: String = js.native
}
object GetFileInfoFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): GetFileInfoFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoFailCallbackResult]
  }
  
  @scala.inline
  implicit class GetFileInfoFailCallbackResultMutableBuilder[Self <: GetFileInfoFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
