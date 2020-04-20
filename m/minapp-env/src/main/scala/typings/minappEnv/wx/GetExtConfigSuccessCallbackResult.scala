package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExtConfigSuccessCallbackResult extends js.Object {
  /** 第三方平台自定义的数据 */
  var extConfig: js.Object
}

object GetExtConfigSuccessCallbackResult {
  @scala.inline
  def apply(extConfig: js.Object): GetExtConfigSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSuccessCallbackResult]
  }
}

