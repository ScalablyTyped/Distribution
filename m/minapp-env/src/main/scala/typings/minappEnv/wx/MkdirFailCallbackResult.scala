package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MkdirFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory ${dirPath}': 上级目录不存在;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有写权限;
    * - 'fail file already exists ${dirPath}': 有同名文件或目录; */
  var errMsg: String = js.native
}
object MkdirFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): MkdirFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirFailCallbackResult]
  }
  
  @scala.inline
  implicit class MkdirFailCallbackResultMutableBuilder[Self <: MkdirFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
