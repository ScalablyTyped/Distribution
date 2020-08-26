package typings.numeral

import typings.numeral.anon.Billion
import typings.numeral.anon.Decimal
import typings.numeral.anon.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumeralJSLocale extends js.Object {
  var abbreviations: Billion = js.native
  var currency: Symbol = js.native
  var delimiters: Decimal = js.native
  def ordinal(num: Double): String = js.native
}

object NumeralJSLocale {
  @scala.inline
  def apply(abbreviations: Billion, currency: Symbol, delimiters: Decimal, ordinal: Double => String): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumeralJSLocale]
  }
  @scala.inline
  implicit class NumeralJSLocaleOps[Self <: NumeralJSLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbreviations(value: Billion): Self = this.set("abbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: Symbol): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiters(value: Decimal): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrdinal(value: Double => String): Self = this.set("ordinal", js.Any.fromFunction1(value))
  }
  
}

