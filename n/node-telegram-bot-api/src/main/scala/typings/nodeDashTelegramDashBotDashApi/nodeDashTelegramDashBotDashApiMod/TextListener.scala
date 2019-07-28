package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextListener extends js.Object {
  var regexp: RegExp = js.native
  def callback(msg: Message): Unit = js.native
  def callback(msg: Message, `match`: RegExpExecArray): Unit = js.native
}

