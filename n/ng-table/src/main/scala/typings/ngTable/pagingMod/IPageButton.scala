package typings.ngTable.pagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageButton extends js.Object {
  var active: Boolean
  var current: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object IPageButton {
  @scala.inline
  def apply(
    active: Boolean,
    `type`: String,
    current: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null
  ): IPageButton = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageButton]
  }
}

