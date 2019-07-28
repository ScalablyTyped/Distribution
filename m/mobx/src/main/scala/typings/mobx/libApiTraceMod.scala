package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/trace", JSImport.Namespace)
@js.native
object libApiTraceMod extends js.Object {
  def trace(): Unit = js.native
  def trace(enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any): Unit = js.native
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any, prop: String): Unit = js.native
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = js.native
}

