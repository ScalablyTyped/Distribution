package typings.ora.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spinner extends js.Object {
  val frames: js.Array[String] = js.native
  val interval: js.UndefOr[Double] = js.native
}

object Spinner {
  @scala.inline
  def apply(frames: js.Array[String]): Spinner = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spinner]
  }
  @scala.inline
  implicit class SpinnerOps[Self <: Spinner] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: String*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[String]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
  
}

