package typings.minappEnv.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetAppOption extends js.Object {
  /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
    *
    * 最低基础库： 2.2.4
    */
  var allowDefault: Boolean
}

object IGetAppOption {
  @scala.inline
  def apply(allowDefault: Boolean): IGetAppOption = {
    val __obj = js.Dynamic.literal(allowDefault = allowDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetAppOption]
  }
}

