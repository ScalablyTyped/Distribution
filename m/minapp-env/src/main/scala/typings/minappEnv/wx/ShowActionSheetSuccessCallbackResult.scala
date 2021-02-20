package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowActionSheetSuccessCallbackResult extends StObject {
  
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double = js.native
}
object ShowActionSheetSuccessCallbackResult {
  
  @scala.inline
  def apply(tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ShowActionSheetSuccessCallbackResultMutableBuilder[Self <: ShowActionSheetSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
  }
}
