package typings.pako.pakoMod

import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InflateOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[string] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object InflateOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: js.Any = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    to: string = null,
    windowBits: Int | Double = null
  ): InflateOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (to != null) __obj.updateDynamic("to")(to)
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateOptions]
  }
}

