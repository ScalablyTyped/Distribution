package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 小程序帐号信息 */
trait MiniProgram extends js.Object {
  /** 小程序 appId */
  var appId: String
}

object MiniProgram {
  @scala.inline
  def apply(appId: String): MiniProgram = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MiniProgram]
  }
}

