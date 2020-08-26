package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeEnd extends js.Object {
  var excludeEnd: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double] = js.native
}

object ExcludeEnd {
  @scala.inline
  def apply(): ExcludeEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeEnd]
  }
  @scala.inline
  implicit class ExcludeEndOps[Self <: ExcludeEnd] (val x: Self) extends AnyVal {
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
    def setExcludeEnd(value: Boolean): Self = this.set("excludeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeEnd: Self = this.set("excludeEnd", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

