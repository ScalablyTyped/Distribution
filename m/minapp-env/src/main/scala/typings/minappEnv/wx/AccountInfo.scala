package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 帐号信息 */
@js.native
trait AccountInfo extends js.Object {
  /** 小程序帐号信息 */
  var miniProgram: MiniProgram = js.native
  /** 插件帐号信息（仅在插件中调用时包含这一项） */
  var plugin: Plugin = js.native
}

object AccountInfo {
  @scala.inline
  def apply(miniProgram: MiniProgram, plugin: Plugin): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
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
    def setMiniProgram(value: MiniProgram): Self = this.set("miniProgram", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: Plugin): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
  
}

