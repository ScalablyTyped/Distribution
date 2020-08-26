package typings.nodeTimecodes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Framerate extends js.Object {
  var framerate: Double = js.native
}

object Framerate {
  @scala.inline
  def apply(framerate: Double): Framerate = {
    val __obj = js.Dynamic.literal(framerate = framerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framerate]
  }
  @scala.inline
  implicit class FramerateOps[Self <: Framerate] (val x: Self) extends AnyVal {
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
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
  }
  
}

