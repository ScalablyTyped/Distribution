package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextListener extends js.Object {
  var regexp: stdLib.RegExp = js.native
  def callback(msg: Message): scala.Unit = js.native
  def callback(msg: Message, `match`: stdLib.RegExpExecArray): scala.Unit = js.native
}

