package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
trait ReferrerInfo extends js.Object {
  /** 来源小程序、公众号或 App 的 appId */
  var appId: String
  /** 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object
}

object ReferrerInfo {
  @scala.inline
  def apply(appId: String, extraData: js.Object): ReferrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferrerInfo]
  }
}

