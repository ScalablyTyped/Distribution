package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultOption extends js.Object {
  /** 小程序切前台的路径 */
  var path: String
  /** 小程序切前台的 query 参数 */
  var query: js.Object
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfoOption
  /** 小程序切前台的[场景值]((scene)) */
  var scene: Double
  /** shareTicket，详见[获取更多转发信息]((转发#获取更多转发信息)) */
  var shareTicket: String
}

object ResultOption {
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: ReferrerInfoOption,
    scene: Double,
    shareTicket: String
  ): ResultOption = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOption]
  }
}

