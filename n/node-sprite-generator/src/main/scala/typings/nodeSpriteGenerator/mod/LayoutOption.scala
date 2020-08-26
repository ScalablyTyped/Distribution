package typings.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOption extends js.Object {
  var padding: js.UndefOr[Double] = js.native
  var scaling: js.UndefOr[Double] = js.native
}

object LayoutOption {
  @scala.inline
  def apply(): LayoutOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutOption]
  }
  @scala.inline
  implicit class LayoutOptionOps[Self <: LayoutOption] (val x: Self) extends AnyVal {
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
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setScaling(value: Double): Self = this.set("scaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
  }
  
}

