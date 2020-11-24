package typings.nodeTelegramBotApi.mod

import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextListener extends js.Object {
  
  def callback(msg: Message): Unit = js.native
  def callback(msg: Message, `match`: RegExpExecArray): Unit = js.native
  
  var regexp: RegExp = js.native
}
