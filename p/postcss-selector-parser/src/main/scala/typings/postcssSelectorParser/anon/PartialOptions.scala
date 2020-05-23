package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Options> */
trait PartialOptions extends js.Object {
  var lossless: js.UndefOr[Boolean] = js.undefined
  var updateSelector: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(lossless: js.UndefOr[Boolean] = js.undefined, updateSelector: js.UndefOr[Boolean] = js.undefined): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lossless)) __obj.updateDynamic("lossless")(lossless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSelector)) __obj.updateDynamic("updateSelector")(updateSelector.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

