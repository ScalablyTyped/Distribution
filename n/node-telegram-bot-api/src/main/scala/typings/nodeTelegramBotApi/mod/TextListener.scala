package typings.nodeTelegramBotApi.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextListener extends StObject {
  
  def callback(msg: Message): Unit = js.native
  def callback(msg: Message, `match`: RegExpExecArray): Unit = js.native
  
  var regexp: js.RegExp = js.native
}
