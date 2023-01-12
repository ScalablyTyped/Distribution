package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetSuccessCallbackResult extends StObject {
  
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double
}
object ShowActionSheetSuccessCallbackResult {
  
  inline def apply(tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowActionSheetSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
  }
}
