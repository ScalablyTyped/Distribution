package typings.popmotion.libAnimationsSpringDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationConfig extends js.Object {
  var dampingRatio: Double
  var duration: Double
  var initialVelocity: Double
  var mass: Double
}

object DurationConfig {
  @scala.inline
  def apply(dampingRatio: Double, duration: Double, initialVelocity: Double, mass: Double): DurationConfig = {
    val __obj = js.Dynamic.literal(dampingRatio = dampingRatio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], initialVelocity = initialVelocity.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DurationConfig]
  }
}

