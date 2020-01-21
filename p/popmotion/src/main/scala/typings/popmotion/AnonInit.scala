package typings.popmotion

import typings.popmotion.observerTypesMod.IObserver
import typings.popmotion.typesMod.ActionInit
import typings.popmotion.typesMod.ColdSubscription
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInit extends js.Object {
  @JSName("init")
  var init_Original: ActionInit = js.native
  def init(observer: IObserver): Partial[ColdSubscription] | Unit = js.native
}

