package typings.nprogress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<nprogress.nprogress.NProgressOptions> */
@js.native
trait PartialNProgressOptions extends js.Object {
  var barSelector: js.UndefOr[String] = js.native
  var easing: js.UndefOr[String] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var parent: js.UndefOr[String] = js.native
  var positionUsing: js.UndefOr[String] = js.native
  var showSpinner: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var spinnerSelector: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var trickle: js.UndefOr[Boolean] = js.native
  var trickleSpeed: js.UndefOr[Double] = js.native
}

object PartialNProgressOptions {
  @scala.inline
  def apply(): PartialNProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNProgressOptions]
  }
  @scala.inline
  implicit class PartialNProgressOptionsOps[Self <: PartialNProgressOptions] (val x: Self) extends AnyVal {
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
    def setBarSelector(value: String): Self = this.set("barSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarSelector: Self = this.set("barSelector", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPositionUsing(value: String): Self = this.set("positionUsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionUsing: Self = this.set("positionUsing", js.undefined)
    @scala.inline
    def setShowSpinner(value: Boolean): Self = this.set("showSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSpinner: Self = this.set("showSpinner", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSpinnerSelector(value: String): Self = this.set("spinnerSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinnerSelector: Self = this.set("spinnerSelector", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTrickle(value: Boolean): Self = this.set("trickle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrickle: Self = this.set("trickle", js.undefined)
    @scala.inline
    def setTrickleSpeed(value: Double): Self = this.set("trickleSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrickleSpeed: Self = this.set("trickleSpeed", js.undefined)
  }
  
}

