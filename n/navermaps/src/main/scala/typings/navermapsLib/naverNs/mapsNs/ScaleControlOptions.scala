package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleControlOptions extends js.Object {
  var position: Position
}

object ScaleControlOptions {
  @scala.inline
  def apply(position: Position): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ScaleControlOptions]
  }
}

