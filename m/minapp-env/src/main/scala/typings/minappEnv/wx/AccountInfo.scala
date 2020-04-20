package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 帐号信息 */
trait AccountInfo extends js.Object {
  /** 小程序帐号信息 */
  var miniProgram: MiniProgram
  /** 插件帐号信息（仅在插件中调用时包含这一项） */
  var plugin: Plugin
}

object AccountInfo {
  @scala.inline
  def apply(miniProgram: MiniProgram, plugin: Plugin): AccountInfo = {
    val __obj = js.Dynamic.literal(miniProgram = miniProgram.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

