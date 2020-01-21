package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyColumn extends js.Object {
  // Specifies the locale from which to infer the currency symbol.
  var locale: js.UndefOr[String] = js.undefined
}

object CurrencyColumn {
  @scala.inline
  def apply(locale: String = null): CurrencyColumn = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyColumn]
  }
}

