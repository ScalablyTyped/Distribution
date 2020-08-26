package typings.pdfImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: js.UndefOr[CombinedImage] = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: scala.Boolean */ CombinedImage](): `0`[CombinedImage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[CombinedImage]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: scala.Boolean */ CombinedImage] (val x: Self with `0`[CombinedImage]) extends AnyVal {
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
    def setCombinedImage(value: CombinedImage): Self = this.set("combinedImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinedImage: Self = this.set("combinedImage", js.undefined)
  }
  
}

