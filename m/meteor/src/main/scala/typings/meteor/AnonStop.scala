package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStop extends js.Object {
  def stop(): Unit
}

object AnonStop {
  @scala.inline
  def apply(stop: () => Unit): AnonStop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AnonStop]
  }
}

