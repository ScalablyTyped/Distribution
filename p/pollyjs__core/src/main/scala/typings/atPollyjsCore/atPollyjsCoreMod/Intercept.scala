package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intercept extends js.Object {
  def abort(): Unit
  def passthrough(): Unit
}

object Intercept {
  @scala.inline
  def apply(abort: () => Unit, passthrough: () => Unit): Intercept = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), passthrough = js.Any.fromFunction0(passthrough))
  
    __obj.asInstanceOf[Intercept]
  }
}

