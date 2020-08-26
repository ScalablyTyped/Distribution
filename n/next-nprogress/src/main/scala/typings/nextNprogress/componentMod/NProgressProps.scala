package typings.nextNprogress.componentMod

import typings.nextNprogress.anon.PartialNProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgressProps extends js.Object {
  var color: js.UndefOr[String] = js.native
  var options: js.UndefOr[PartialNProgressOptions] = js.native
  var showAfterMs: js.UndefOr[Double] = js.native
  var spinner: js.UndefOr[Boolean] = js.native
}

object NProgressProps {
  @scala.inline
  def apply(): NProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NProgressProps]
  }
  @scala.inline
  implicit class NProgressPropsOps[Self <: NProgressProps] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOptions(value: PartialNProgressOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setShowAfterMs(value: Double): Self = this.set("showAfterMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAfterMs: Self = this.set("showAfterMs", js.undefined)
    @scala.inline
    def setSpinner(value: Boolean): Self = this.set("spinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinner: Self = this.set("spinner", js.undefined)
  }
  
}

