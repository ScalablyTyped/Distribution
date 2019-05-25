package typings
package olLib.formatWKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var position: scala.Double
  var `type`: scala.Double
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Token {
  @scala.inline
  def apply(position: scala.Double, `type`: scala.Double, value: scala.Double | java.lang.String = null): Token = {
    val __obj = js.Dynamic.literal(position = position)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

