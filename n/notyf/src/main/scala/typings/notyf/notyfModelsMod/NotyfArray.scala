package typings.notyf.notyfModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf/notyf.models", "NotyfArray")
@js.native
class NotyfArray[T] () extends js.Object {
  var notifications: js.Any = js.native
  var updateFn: js.Any = js.native
  def indexOf(elem: T): Double = js.native
  def onupdate(fn: NotyfArrayEventFn[T]): Unit = js.native
  def push(elem: T): Unit = js.native
  def splice(index: Double, num: Double): Unit = js.native
}

