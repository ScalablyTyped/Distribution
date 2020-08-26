package typings.minappEnv.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetAppOption extends js.Object {
  /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
    *
    * 最低基础库： 2.2.4
    */
  var allowDefault: Boolean = js.native
}

object IGetAppOption {
  @scala.inline
  def apply(allowDefault: Boolean): IGetAppOption = {
    val __obj = js.Dynamic.literal(allowDefault = allowDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetAppOption]
  }
  @scala.inline
  implicit class IGetAppOptionOps[Self <: IGetAppOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDefault(value: Boolean): Self = this.set("allowDefault", value.asInstanceOf[js.Any])
  }
  
}

