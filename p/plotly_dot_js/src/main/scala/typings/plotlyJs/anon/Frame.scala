package typings.plotlyJs.anon

import typings.plotlyJs.mod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var frame: Duration = js.native
  var transition: Transition = js.native
}

object Frame {
  @scala.inline
  def apply(frame: Duration, transition: Transition): Frame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setFrame(value: Duration): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

