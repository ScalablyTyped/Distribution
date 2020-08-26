package typings.nprogress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgressOptions extends js.Object {
  var barSelector: String = js.native
  var easing: String = js.native
  var minimum: Double = js.native
  var parent: String = js.native
  var positionUsing: String = js.native
  var showSpinner: Boolean = js.native
  var speed: Double = js.native
  var spinnerSelector: String = js.native
  var template: String = js.native
  var trickle: Boolean = js.native
  var trickleSpeed: Double = js.native
}

object NProgressOptions {
  @scala.inline
  def apply(
    barSelector: String,
    easing: String,
    minimum: Double,
    parent: String,
    positionUsing: String,
    showSpinner: Boolean,
    speed: Double,
    spinnerSelector: String,
    template: String,
    trickle: Boolean,
    trickleSpeed: Double
  ): NProgressOptions = {
    val __obj = js.Dynamic.literal(barSelector = barSelector.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], positionUsing = positionUsing.asInstanceOf[js.Any], showSpinner = showSpinner.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], spinnerSelector = spinnerSelector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickle = trickle.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NProgressOptions]
  }
  @scala.inline
  implicit class NProgressOptionsOps[Self <: NProgressOptions] (val x: Self) extends AnyVal {
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
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionUsing(value: String): Self = this.set("positionUsing", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowSpinner(value: Boolean): Self = this.set("showSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinnerSelector(value: String): Self = this.set("spinnerSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrickle(value: Boolean): Self = this.set("trickle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrickleSpeed(value: Double): Self = this.set("trickleSpeed", value.asInstanceOf[js.Any])
  }
  
}

