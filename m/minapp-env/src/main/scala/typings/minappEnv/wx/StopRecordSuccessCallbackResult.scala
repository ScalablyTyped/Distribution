package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecordSuccessCallbackResult extends StObject {
  
  /** 封面图片文件的临时路径 */
  var tempThumbPath: String
  
  /** 视频的文件的临时路径 */
  var tempVideoPath: String
}
object StopRecordSuccessCallbackResult {
  
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): StopRecordSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRecordSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class StopRecordSuccessCallbackResultMutableBuilder[Self <: StopRecordSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTempThumbPath(value: String): Self = StObject.set(x, "tempThumbPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempVideoPath(value: String): Self = StObject.set(x, "tempVideoPath", value.asInstanceOf[js.Any])
  }
}
