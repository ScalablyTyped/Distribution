package typings.novaEditorNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var reveal: js.UndefOr[Double] = js.undefined
  var select: js.UndefOr[Boolean] = js.undefined
}

object Focus {
  @scala.inline
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    reveal: js.UndefOr[Double] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined
  ): Focus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reveal)) __obj.updateDynamic("reveal")(reveal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
}

