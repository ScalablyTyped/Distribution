package typings.preact

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentTarget[Target /* <: EventTarget */] extends js.Object {
  val currentTarget: Target
}

object Anon_CurrentTarget {
  @scala.inline
  def apply[Target /* <: EventTarget */](currentTarget: Target): Anon_CurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CurrentTarget[Target]]
  }
}

