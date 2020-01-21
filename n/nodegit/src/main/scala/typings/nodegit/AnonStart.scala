package typings.nodegit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  /**
    * Start walking the tree and emitting events. This should be called after event listeners have been attached.
    */
  def start(): Unit
}

object AnonStart {
  @scala.inline
  def apply(start: () => Unit): AnonStart = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[AnonStart]
  }
}

