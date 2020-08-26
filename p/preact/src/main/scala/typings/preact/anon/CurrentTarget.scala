package typings.preact.anon

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTarget[Target /* <: EventTarget */] extends js.Object {
  val currentTarget: Target = js.native
}

object CurrentTarget {
  @scala.inline
  def apply[/* <: typings.std.EventTarget */ Target](currentTarget: Target): CurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget[Target]]
  }
  @scala.inline
  implicit class CurrentTargetOps[Self <: CurrentTarget[_], /* <: typings.std.EventTarget */ Target] (val x: Self with CurrentTarget[Target]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentTarget(value: Target): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
  }
  
}

