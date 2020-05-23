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
  def apply(
    preferCurrentQuoteMark: js.UndefOr[Boolean] = js.undefined,
    quoteMark: js.UndefOr[Null | QuoteMark] = js.undefined
  ): PreferredQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preferCurrentQuoteMark)) __obj.updateDynamic("preferCurrentQuoteMark")(preferCurrentQuoteMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quoteMark)) __obj.updateDynamic("quoteMark")(quoteMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredQuoteMarkOptions]
  }
}

