package typings.ngprogressDashLite.angularMod.progressLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationOptions extends js.Object {
  var ease: String
  var minimum: Double
  var speed: Double
  var template: String
  var trickleRate: Double
  var trickleSpeed: Double
}

object IConfigurationOptions {
  @scala.inline
  def apply(
    ease: String,
    minimum: Double,
    speed: Double,
    template: String,
    trickleRate: Double,
    trickleSpeed: Double
  ): IConfigurationOptions = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickleRate = trickleRate.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConfigurationOptions]
  }
}

