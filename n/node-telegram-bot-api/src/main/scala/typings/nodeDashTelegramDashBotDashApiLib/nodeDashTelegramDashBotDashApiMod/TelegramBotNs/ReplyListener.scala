package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplyListener extends js.Object {
  var chatId: scala.Double | java.lang.String
  var id: scala.Double
  var messageId: scala.Double | java.lang.String
  def callback(msg: Message): scala.Unit
}

