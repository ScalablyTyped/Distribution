package typings.preact.anon

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTarget[Target /* <: EventTarget */] extends js.Object {
  val currentTarget: Target
}

object CurrentTarget {
  @scala.inline
  def apply[/* <: typings.std.EventTarget */ Target](currentTarget: Target): CurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget[Target]]
  }
}

