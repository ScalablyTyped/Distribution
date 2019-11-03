package typings.notyf

import typings.notyf.notyfDotOptionsMod.DeepPartial
import typings.notyf.notyfDotOptionsMod.INotyfNotificationOptions
import typings.notyf.notyfDotOptionsMod.INotyfOptions
import typings.notyf.notyfNotyfMod.default
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf", JSImport.Namespace)
@js.native
object notyfMod extends js.Object {
  @js.native
  class Notyf () extends default {
    def this(opts: Partial[INotyfOptions]) = this()
  }
  
  @js.native
  class NotyfArray[T] ()
    extends typings.notyf.notyfDotModelsMod.NotyfArray[T]
  
  @js.native
  class NotyfNotification protected ()
    extends typings.notyf.notyfDotModelsMod.NotyfNotification {
    def this(options: DeepPartial[INotyfNotificationOptions]) = this()
  }
  
  @js.native
  class NotyfView ()
    extends typings.notyf.notyfDotViewMod.NotyfView
  
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  @js.native
  object NotyfArrayEvent extends js.Object {
    /* 0 */ val Add: typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Add with Double = js.native
    /* 1 */ val Remove: typings.notyf.notyfDotModelsMod.NotyfArrayEvent.Remove with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.notyf.notyfDotModelsMod.NotyfArrayEvent with Double] = js.native
  }
  
}

