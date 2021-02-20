package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnStopCallbackResult extends StObject {
  
  /** 录音文件的临时路径 */
  var tempFilePath: String = js.native
}
object OnStopCallbackResult {
  
  @scala.inline
  def apply(tempFilePath: String): OnStopCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStopCallbackResult]
  }
  
  @scala.inline
  implicit class OnStopCallbackResultMutableBuilder[Self <: OnStopCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
