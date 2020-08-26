package typings.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DipScaleRects extends js.Object {
  var dipRect: Rect = js.native
  var scaledRect: Rect = js.native
}

object DipScaleRects {
  @scala.inline
  def apply(dipRect: Rect, scaledRect: Rect): DipScaleRects = {
    val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DipScaleRects]
  }
  @scala.inline
  implicit class DipScaleRectsOps[Self <: DipScaleRects] (val x: Self) extends AnyVal {
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
    def setDipRect(value: Rect): Self = this.set("dipRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaledRect(value: Rect): Self = this.set("scaledRect", value.asInstanceOf[js.Any])
  }
  
}

