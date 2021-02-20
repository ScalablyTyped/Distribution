package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasToTempFilePathSuccessCallbackResult extends StObject {
  
  /** 生成文件的临时路径 */
  var tempFilePath: String = js.native
}
object CanvasToTempFilePathSuccessCallbackResult {
  
  @scala.inline
  def apply(tempFilePath: String): CanvasToTempFilePathSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathSuccessCallbackResultMutableBuilder[Self <: CanvasToTempFilePathSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
