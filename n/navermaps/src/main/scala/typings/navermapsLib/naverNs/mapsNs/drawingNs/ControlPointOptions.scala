package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlPointOptions extends js.Object {
  var anchorPointOptions: navermapsLib.naverNs.mapsNs.CircleOptions
  var midPointOptions: navermapsLib.naverNs.mapsNs.CircleOptions
}

object ControlPointOptions {
  @scala.inline
  def apply(
    anchorPointOptions: navermapsLib.naverNs.mapsNs.CircleOptions,
    midPointOptions: navermapsLib.naverNs.mapsNs.CircleOptions
  ): ControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anchorPointOptions")(anchorPointOptions)
    __obj.updateDynamic("midPointOptions")(midPointOptions)
    __obj.asInstanceOf[ControlPointOptions]
  }
}

