package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AroundControlOptions extends js.Object {
  var position: Position
}

object AroundControlOptions {
  @scala.inline
  def apply(position: Position): AroundControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[AroundControlOptions]
  }
}

