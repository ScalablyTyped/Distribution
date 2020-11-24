package typings.notyf.notyfModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("notyf/notyf.models", "NotyfArray")
@js.native
class NotyfArray[T] () extends js.Object {
  
  def indexOf(elem: T): Double = js.native
  
  var notifications: js.Any = js.native
  
  def onUpdate(fn: NotyfArrayEventFn[T]): Unit = js.native
  
  def push(elem: T): Unit = js.native
  
  def splice(index: Double, num: Double): T = js.native
  
  var updateFn: js.Any = js.native
}
