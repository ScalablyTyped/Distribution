package typings.notyf.notyfModelsMod

import typings.notyf.anon.DeepPartialINotyfNotifica
import typings.notyf.notyfOptionsMod.NotyfEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("notyf/notyf.models", "NotyfNotification")
@js.native
class NotyfNotification protected () extends js.Object {
  def this(options: DeepPartialINotyfNotifica) = this()
  
  var listeners: js.Any = js.native
  
  def on(eventType: NotyfEvent, cb: NotyfEventCallback): Unit = js.native
  
  var options: DeepPartialINotyfNotifica = js.native
  
  var triggerEvent: js.Any = js.native
}
