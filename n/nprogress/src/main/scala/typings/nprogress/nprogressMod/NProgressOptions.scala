package typings.nprogress.nprogressMod

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
    val __obj = js.Dynamic.literal(barSelector = barSelector, easing = easing, minimum = minimum, parent = parent, positionUsing = positionUsing, showSpinner = showSpinner, speed = speed, spinnerSelector = spinnerSelector, template = template, trickle = trickle, trickleSpeed = trickleSpeed)
  
    __obj.asInstanceOf[NProgressOptions]
  }
}

