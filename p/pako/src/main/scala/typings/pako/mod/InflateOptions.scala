package typings.pako.mod

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
    chunkSize: js.UndefOr[Double] = js.undefined,
    dictionary: js.Any = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    to: string = null,
    windowBits: js.UndefOr[Double] = js.undefined
  ): InflateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBits)) __obj.updateDynamic("windowBits")(windowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateOptions]
  }
}

