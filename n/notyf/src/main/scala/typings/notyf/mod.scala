package typings.notyf

import typings.notyf.notyfMod.default
import typings.notyf.notyfOptionsMod.INotyfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @js.native
  class NotyfArray[T] ()
    extends typings.notyf.notyfModelsMod.NotyfArray[T]
  
  @js.native
  class NotyfNotification protected ()
    extends typings.notyf.notyfModelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @js.native
  class NotyfView ()
    extends typings.notyf.notyfViewMod.NotyfView
  
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  @js.native
  object NotyfArrayEvent extends js.Object {
    /* 0 */ val Add: typings.notyf.notyfModelsMod.NotyfArrayEvent.Add with Double = js.native
    /* 1 */ val Remove: typings.notyf.notyfModelsMod.NotyfArrayEvent.Remove with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.notyf.notyfModelsMod.NotyfArrayEvent with Double] = js.native
  }
  
  @js.native
  object NotyfEvent extends js.Object {
    /* 0 */ val Dismiss: typings.notyf.notyfOptionsMod.NotyfEvent.Dismiss with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.notyf.notyfOptionsMod.NotyfEvent with Double] = js.native
  }
  
}

