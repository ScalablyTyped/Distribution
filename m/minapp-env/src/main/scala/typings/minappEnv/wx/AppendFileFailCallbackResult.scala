package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendFileFailCallbackResult extends StObject {
  
  /** 错误信息
    *
    * 可选值：
    * - 'fail no such file or directory, open ${filePath}': 指定的 filePath 文件不存在;
    * - 'fail illegal operation on a directory, open "${filePath}" ': 指定的 filePath 是一个已经存在的目录;
    * - 'fail permission denied, open ${dirPath}': 指定的 filePath 路径没有写权限;
    * - 'fail sdcard not mounted ': 指定的 filePath 是一个已经存在的目录; */
  var errMsg: String = js.native
}
object AppendFileFailCallbackResult {
  
  @scala.inline
  def apply(errMsg: String): AppendFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendFileFailCallbackResult]
  }
  
  @scala.inline
  implicit class AppendFileFailCallbackResultMutableBuilder[Self <: AppendFileFailCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
