package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opacity extends TransitionBase {
  var opacity: Double = js.native
}

object Opacity {
  @scala.inline
  def apply(duration: Double, opacity: Double): Opacity = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  @scala.inline
  implicit class OpacityOps[Self <: Opacity] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
  
}

