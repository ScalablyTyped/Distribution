package typings.preact

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTarget[Target /* <: EventTarget */] extends js.Object {
  val currentTarget: Target
}

object AnonCurrentTarget {
  @scala.inline
  def apply[Target /* <: EventTarget */](currentTarget: Target): AnonCurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTarget[Target]]
  }
}

