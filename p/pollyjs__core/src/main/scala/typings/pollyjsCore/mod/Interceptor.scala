package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def abort(): Unit
  def passthrough(): Unit
}

object Interceptor {
  @scala.inline
  def apply(abort: () => Unit, passthrough: () => Unit): Interceptor = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), passthrough = js.Any.fromFunction0(passthrough))
    __obj.asInstanceOf[Interceptor]
  }
}

