package typings
package ngprogressDashLiteLib.angularMod.progressLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurationOptions extends js.Object {
  var ease: java.lang.String
  var minimum: scala.Double
  var speed: scala.Double
  var template: java.lang.String
  var trickleRate: scala.Double
  var trickleSpeed: scala.Double
}

object IConfigurationOptions {
  @scala.inline
  def apply(
    ease: java.lang.String,
    minimum: scala.Double,
    speed: scala.Double,
    template: java.lang.String,
    trickleRate: scala.Double,
    trickleSpeed: scala.Double
  ): IConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ease")(ease)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("trickleRate")(trickleRate)
    __obj.updateDynamic("trickleSpeed")(trickleSpeed)
    __obj.asInstanceOf[IConfigurationOptions]
  }
}

