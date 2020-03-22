package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferredQuoteMarkOptions extends js.Object {
  var preferCurrentQuoteMark: js.UndefOr[Boolean] = js.undefined
  var quoteMark: js.UndefOr[QuoteMark] = js.undefined
}

object PreferredQuoteMarkOptions {
  @scala.inline
  def apply(preferCurrentQuoteMark: js.UndefOr[Boolean] = js.undefined, quoteMark: QuoteMark = null): PreferredQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preferCurrentQuoteMark)) __obj.updateDynamic("preferCurrentQuoteMark")(preferCurrentQuoteMark.asInstanceOf[js.Any])
    if (quoteMark != null) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredQuoteMarkOptions]
  }
}

