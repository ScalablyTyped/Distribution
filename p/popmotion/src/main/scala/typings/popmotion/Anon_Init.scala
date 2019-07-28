package typings.popmotion

import typings.popmotion.libActionTypesMod.ActionInit
import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.libObserverTypesMod.IObserver
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Init extends js.Object {
  @JSName("init")
  var init_Original: ActionInit = js.native
  def init(observer: IObserver): Partial[ColdSubscription] | Unit = js.native
}

