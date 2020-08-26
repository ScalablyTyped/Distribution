package typings.pause.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends js.Object {
  def end(): Unit = js.native
  def resume(): Unit = js.native
}

object Handle {
  @scala.inline
  def apply(end: () => Unit, resume: () => Unit): Handle = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[Handle]
  }
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
  }
  
}

