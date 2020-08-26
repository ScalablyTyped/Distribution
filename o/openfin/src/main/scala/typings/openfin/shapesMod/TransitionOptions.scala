package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends js.Object {
  var interrupt: Boolean = js.native
  var tween: js.UndefOr[String] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(interrupt: Boolean): TransitionOptions = {
    val __obj = js.Dynamic.literal(interrupt = interrupt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
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
    def setInterrupt(value: Boolean): Self = this.set("interrupt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTween(value: String): Self = this.set("tween", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTween: Self = this.set("tween", js.undefined)
  }
  
}

