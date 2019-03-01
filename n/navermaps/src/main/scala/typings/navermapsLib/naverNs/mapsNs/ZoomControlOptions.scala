package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomControlOptions extends js.Object {
  var legendDisabled: scala.Boolean
  var position: Position
  var style: ZoomControlStyle
}

object ZoomControlOptions {
  @scala.inline
  def apply(legendDisabled: scala.Boolean, position: Position, style: ZoomControlStyle): ZoomControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("legendDisabled")(legendDisabled)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ZoomControlOptions]
  }
}

