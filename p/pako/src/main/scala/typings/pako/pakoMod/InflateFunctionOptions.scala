package typings.pako.pakoMod

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
  def apply(raw: js.UndefOr[Boolean] = js.undefined, to: string = null, windowBits: Int | Double = null): InflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateFunctionOptions]
  }
}

