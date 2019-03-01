package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogoControlOptions extends js.Object {
  var position: Position
}

object LogoControlOptions {
  @scala.inline
  def apply(position: Position): LogoControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LogoControlOptions]
  }
}

