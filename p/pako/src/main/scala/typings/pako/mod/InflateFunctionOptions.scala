package typings.pako.mod

import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InflateFunctionOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[string] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object InflateFunctionOptions {
  @scala.inline
  def apply(
    raw: js.UndefOr[Boolean] = js.undefined,
    to: string = null,
    windowBits: js.UndefOr[Double] = js.undefined
  ): InflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBits)) __obj.updateDynamic("windowBits")(windowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateFunctionOptions]
  }
}

