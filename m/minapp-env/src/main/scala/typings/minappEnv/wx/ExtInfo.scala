package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtInfo extends js.Object {
  /** 第三方平台自定义的数据 */
  var extConfig: js.Object
}

object ExtInfo {
  @scala.inline
  def apply(extConfig: js.Object): ExtInfo = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtInfo]
  }
}

