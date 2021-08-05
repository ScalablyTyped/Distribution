package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePhotoSuccessCallbackResult extends StObject {
  
  /** 照片文件的临时路径 */
  var tempImagePath: String
}
object TakePhotoSuccessCallbackResult {
  
  inline def apply(tempImagePath: String): TakePhotoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempImagePath = tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePhotoSuccessCallbackResult]
  }
  
  extension [Self <: TakePhotoSuccessCallbackResult](x: Self) {
    
    inline def setTempImagePath(value: String): Self = StObject.set(x, "tempImagePath", value.asInstanceOf[js.Any])
  }
}
