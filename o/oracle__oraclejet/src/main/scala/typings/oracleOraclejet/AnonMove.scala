package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMove extends js.Object {
  var move: js.UndefOr[AnonDisabled] = js.undefined
}

object AnonMove {
  @scala.inline
  def apply(move: AnonDisabled = null): AnonMove = {
    val __obj = js.Dynamic.literal()
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMove]
  }
}

