package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGetImageDataSuccessCallbackResult extends StObject {
  
  /** 图像数据矩形的高度 */
  var height: Double = js.native
  
  /** 图像数据矩形的宽度 */
  var width: Double = js.native
}
object CanvasGetImageDataSuccessCallbackResult {
  
  @scala.inline
  def apply(height: Double, width: Double): CanvasGetImageDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGetImageDataSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CanvasGetImageDataSuccessCallbackResultMutableBuilder[Self <: CanvasGetImageDataSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
