package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRecordSuccessCallbackResult extends StObject {
  
  /** 录音文件的临时路径 */
  var tempFilePath: String = js.native
}
object StartRecordSuccessCallbackResult {
  
  @scala.inline
  def apply(tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class StartRecordSuccessCallbackResultMutableBuilder[Self <: StartRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
