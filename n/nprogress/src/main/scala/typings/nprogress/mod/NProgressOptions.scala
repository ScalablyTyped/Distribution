package typings.nprogress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressOptions extends js.Object {
  var barSelector: String
  var easing: String
  var minimum: Double
  var parent: String
  var positionUsing: String
  var showSpinner: Boolean
  var speed: Double
  var spinnerSelector: String
  var template: String
  var trickle: Boolean
  var trickleSpeed: Double
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
}

