package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowActionSheetSuccessCallbackResult extends js.Object {
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double
}

object ShowActionSheetSuccessCallbackResult {
  @scala.inline
  def apply(tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
}

