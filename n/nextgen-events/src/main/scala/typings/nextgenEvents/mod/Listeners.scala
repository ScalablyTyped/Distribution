package typings.nextgenEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listeners extends js.Object {
  var error: js.Array[Func]
  var interrupt: js.Array[Func]
  var newListener: js.Array[Func]
  var removeListener: js.Array[Func]
}

object Listeners {
  @scala.inline
  def apply(
    error: js.Array[Func],
    interrupt: js.Array[Func],
    newListener: js.Array[Func],
    removeListener: js.Array[Func]
  ): Listeners = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Listeners]
  }
}

