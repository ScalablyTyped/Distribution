package typings.notyf

import typings.notyf.notyfModelsMod.NotyfArray
import typings.notyf.notyfModelsMod.NotyfNotification
import typings.notyf.notyfOptionsMod.DeepPartial
import typings.notyf.notyfOptionsMod.INotyfNotificationOptions
import typings.notyf.notyfOptionsMod.INotyfOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf/notyf", JSImport.Namespace)
@js.native
object notyfMod extends js.Object {
  @js.native
  trait Notyf extends js.Object {
    var _pushNotification: js.Any = js.native
    var normalizeOptions: js.Any = js.native
    var notifications: NotyfArray[NotyfNotification] = js.native
    var options: INotyfOptions = js.native
    var registerTypes: js.Any = js.native
    var view: js.Any = js.native
    def error(payload: String): Unit = js.native
    def error(payload: Partial[INotyfNotificationOptions]): Unit = js.native
    def open(options: DeepPartial[INotyfNotificationOptions]): Unit = js.native
    def success(payload: String): Unit = js.native
    def success(payload: Partial[INotyfNotificationOptions]): Unit = js.native
  }
  
  @js.native
  class default () extends Notyf {
    def this(opts: Partial[INotyfOptions]) = this()
  }
  
}

