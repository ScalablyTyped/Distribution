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
    val __obj = js.Dynamic.literal(ease = ease, minimum = minimum, speed = speed, template = template, trickleRate = trickleRate, trickleSpeed = trickleSpeed)
  
    __obj.asInstanceOf[IConfigurationOptions]
  }
}

