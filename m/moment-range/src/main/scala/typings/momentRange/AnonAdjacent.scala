package typings.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdjacent extends js.Object {
  var adjacent: js.UndefOr[Boolean] = js.undefined
}

object AnonAdjacent {
  @scala.inline
  def apply(adjacent: js.UndefOr[Boolean] = js.undefined): AnonAdjacent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjacent)) __obj.updateDynamic("adjacent")(adjacent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdjacent]
  }
}

