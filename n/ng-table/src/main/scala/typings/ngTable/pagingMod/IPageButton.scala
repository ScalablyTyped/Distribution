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
    number: js.UndefOr[Double] = js.undefined
  ): IPageButton = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageButton]
  }
}

