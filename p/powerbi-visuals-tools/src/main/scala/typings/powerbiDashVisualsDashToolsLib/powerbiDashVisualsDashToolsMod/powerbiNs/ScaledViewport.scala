package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaledViewport extends IViewport {
  var scale: scala.Double
}

object ScaledViewport {
  @scala.inline
  def apply(height: scala.Double, scale: scala.Double, width: scala.Double): ScaledViewport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ScaledViewport]
  }
}

