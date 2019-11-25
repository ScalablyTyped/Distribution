package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Move extends js.Object {
  var move: js.UndefOr[Anon_Disabled] = js.undefined
}

object Anon_Move {
  @scala.inline
  def apply(move: Anon_Disabled = null): Anon_Move = {
    val __obj = js.Dynamic.literal()
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Move]
  }
}

