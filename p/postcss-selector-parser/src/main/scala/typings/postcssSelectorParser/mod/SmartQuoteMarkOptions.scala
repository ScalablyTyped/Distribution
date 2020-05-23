package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartQuoteMarkOptions extends PreferredQuoteMarkOptions {
  var smart: js.UndefOr[Boolean] = js.undefined
}

object SmartQuoteMarkOptions {
  @scala.inline
  def apply(
    preferCurrentQuoteMark: js.UndefOr[Boolean] = js.undefined,
    quoteMark: js.UndefOr[Null | QuoteMark] = js.undefined,
    smart: js.UndefOr[Boolean] = js.undefined
  ): SmartQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preferCurrentQuoteMark)) __obj.updateDynamic("preferCurrentQuoteMark")(preferCurrentQuoteMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quoteMark)) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartQuoteMarkOptions]
  }
}

