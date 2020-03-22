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
    quoteMark: QuoteMark = null,
    smart: js.UndefOr[Boolean] = js.undefined
  ): SmartQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preferCurrentQuoteMark)) __obj.updateDynamic("preferCurrentQuoteMark")(preferCurrentQuoteMark.asInstanceOf[js.Any])
    if (quoteMark != null) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartQuoteMarkOptions]
  }
}

