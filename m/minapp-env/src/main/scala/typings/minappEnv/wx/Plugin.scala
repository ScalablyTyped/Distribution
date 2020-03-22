package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 插件帐号信息（仅在插件中调用时包含这一项） */
trait Plugin extends js.Object {
  /** 插件 appId */
  var appId: String
  /** 插件版本号 */
  var version: String
}

object Plugin {
  @scala.inline
  def apply(appId: String, version: String): Plugin = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Plugin]
  }
}

