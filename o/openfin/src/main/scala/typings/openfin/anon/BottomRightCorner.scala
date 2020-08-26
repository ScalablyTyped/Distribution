package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomRightCorner extends js.Object {
  var bottomRightCorner: Double = js.native
  var sides: js.UndefOr[Left] = js.native
  var size: Double = js.native
}

object BottomRightCorner {
  @scala.inline
  def apply(bottomRightCorner: Double, size: Double): BottomRightCorner = {
    val __obj = js.Dynamic.literal(bottomRightCorner = bottomRightCorner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRightCorner]
  }
  @scala.inline
  implicit class BottomRightCornerOps[Self <: BottomRightCorner] (val x: Self) extends AnyVal {
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
    def setBottomRightCorner(value: Double): Self = this.set("bottomRightCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSides(value: Left): Self = this.set("sides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
  }
  
}

