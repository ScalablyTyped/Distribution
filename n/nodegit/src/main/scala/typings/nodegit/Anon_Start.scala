package typings.nodegit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Start extends js.Object {
  /**
    * Start walking the tree and emitting events. This should be called after event listeners have been attached.
    */
  def start(): Unit
}

object Anon_Start {
  @scala.inline
  def apply(start: () => Unit): Anon_Start = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Anon_Start]
  }
}

