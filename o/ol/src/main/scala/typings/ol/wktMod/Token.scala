package typings.ol.wktMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var position: Double
  var `type`: Double
  var value: js.UndefOr[Double | String] = js.undefined
}

object Token {
  @scala.inline
  def apply(position: Double, `type`: Double, value: Double | String = null): Token = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

