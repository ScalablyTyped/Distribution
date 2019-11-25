package typings.nextgenDashEvents.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var queue: js.Array[_]
  var ready: Boolean
}

object Scope {
  @scala.inline
  def apply(queue: js.Array[_], ready: Boolean): Scope = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scope]
  }
}

