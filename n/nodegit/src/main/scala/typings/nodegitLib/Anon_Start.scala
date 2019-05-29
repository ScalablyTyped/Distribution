package typings
package nodegitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Start extends js.Object {
  /**
    * Start walking the tree and emitting events. This should be called after event listeners have been attached.
    */
  def start(): scala.Unit
}

object Anon_Start {
  @scala.inline
  def apply(start: () => scala.Unit): Anon_Start = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Anon_Start]
  }
}

