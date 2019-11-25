package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveStatModifier extends js.Object {
  var affects_user: js.UndefOr[Boolean] = js.undefined
  var change_by: Double
  var stat: String
}

object MoveStatModifier {
  @scala.inline
  def apply(change_by: Double, stat: String, affects_user: js.UndefOr[Boolean] = js.undefined): MoveStatModifier = {
    val __obj = js.Dynamic.literal(change_by = change_by.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    if (!js.isUndefined(affects_user)) __obj.updateDynamic("affects_user")(affects_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatModifier]
  }
}

