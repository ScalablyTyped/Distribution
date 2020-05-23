package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends js.Object {
  var move: js.UndefOr[Tasks] = js.undefined
}

object Move {
  @scala.inline
  def apply(move: Tasks = null): Move = {
    val __obj = js.Dynamic.literal()
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

