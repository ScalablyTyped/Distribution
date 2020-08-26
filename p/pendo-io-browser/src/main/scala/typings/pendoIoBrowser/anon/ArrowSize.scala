package typings.pendoIoBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowSize extends js.Object {
  var arrowSize: js.UndefOr[Double] = js.native
}

object ArrowSize {
  @scala.inline
  def apply(): ArrowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowSize]
  }
  @scala.inline
  implicit class ArrowSizeOps[Self <: ArrowSize] (val x: Self) extends AnyVal {
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
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
  }
  
}

