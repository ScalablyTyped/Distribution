package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecordSuccessCallbackResult extends StObject {
  
  /** 录音文件的临时路径 */
  var tempFilePath: String
}
object StartRecordSuccessCallbackResult {
  
  inline def apply(tempFilePath: String): StartRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
