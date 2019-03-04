package typings
package ngDashTableLib.srcCorePagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageButton extends js.Object {
  var active: scala.Boolean
  var current: js.UndefOr[scala.Boolean] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

object IPageButton {
  @scala.inline
  def apply(
    active: scala.Boolean,
    `type`: java.lang.String,
    current: js.UndefOr[scala.Boolean] = js.undefined,
    number: scala.Int | scala.Double = null
  ): IPageButton = {
    val __obj = js.Dynamic.literal(active = active)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageButton]
  }
}

