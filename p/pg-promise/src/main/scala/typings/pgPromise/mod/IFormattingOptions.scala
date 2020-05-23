package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormattingOptions extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
  var `def`: js.UndefOr[js.Any] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
}

object IFormattingOptions {
  @scala.inline
  def apply(
    capSQL: js.UndefOr[Boolean] = js.undefined,
    `def`: js.Any = null,
    partial: js.UndefOr[Boolean] = js.undefined
  ): IFormattingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL.get.asInstanceOf[js.Any])
    if (`def` != null) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormattingOptions]
  }
}

