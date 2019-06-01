package typings
package nprogressLib.nprogressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressOptions extends js.Object {
  var barSelector: java.lang.String
  var easing: java.lang.String
  var minimum: scala.Double
  var parent: java.lang.String
  var positionUsing: java.lang.String
  var showSpinner: scala.Boolean
  var speed: scala.Double
  var spinnerSelector: java.lang.String
  var template: java.lang.String
  var trickle: scala.Boolean
  var trickleSpeed: scala.Double
}

object NProgressOptions {
  @scala.inline
  def apply(
    barSelector: java.lang.String,
    easing: java.lang.String,
    minimum: scala.Double,
    parent: java.lang.String,
    positionUsing: java.lang.String,
    showSpinner: scala.Boolean,
    speed: scala.Double,
    spinnerSelector: java.lang.String,
    template: java.lang.String,
    trickle: scala.Boolean,
    trickleSpeed: scala.Double
  ): NProgressOptions = {
    val __obj = js.Dynamic.literal(barSelector = barSelector, easing = easing, minimum = minimum, parent = parent, positionUsing = positionUsing, showSpinner = showSpinner, speed = speed, spinnerSelector = spinnerSelector, template = template, trickle = trickle, trickleSpeed = trickleSpeed)
  
    __obj.asInstanceOf[NProgressOptions]
  }
}

