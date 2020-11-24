package typings.numbro.mod.numbro

import typings.numbro.anon.Code
import typings.numbro.anon.Decimal
import typings.numbro.anon.FourDigits
import typings.numbro.anon.Million
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumbroLanguage extends js.Object {
  
  var abbreviations: Million = js.native
  
  var byteFormat: js.UndefOr[Format] = js.native
  
  var currency: Code = js.native
  
  var currencyFormat: js.UndefOr[Format] = js.native
  
  var defaults: js.UndefOr[Format] = js.native
  
  var delimiters: Decimal = js.native
  
  var formats: FourDigits = js.native
  
  var languageTag: String = js.native
  
  def ordinal(num: Double): String = js.native
  
  var ordinalFormat: js.UndefOr[Format] = js.native
  
  var percentageFormat: js.UndefOr[Format] = js.native
  
  var spaceSeparated: js.UndefOr[Boolean] = js.native
  
  var timeDefaults: js.UndefOr[Format] = js.native
}
object NumbroLanguage {
  
  @scala.inline
  def apply(
    abbreviations: Million,
    currency: Code,
    delimiters: Decimal,
    formats: FourDigits,
    languageTag: String,
    ordinal: Double => String
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumbroLanguage]
  }
  
  @scala.inline
  implicit class NumbroLanguageOps[Self <: NumbroLanguage] (val x: Self) extends AnyVal {
    
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
    def setAbbreviations(value: Million): Self = this.set("abbreviations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Code): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiters(value: Decimal): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: FourDigits): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageTag(value: String): Self = this.set("languageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double => String): Self = this.set("ordinal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setByteFormat(value: Format): Self = this.set("byteFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteFormat: Self = this.set("byteFormat", js.undefined)
    
    @scala.inline
    def setCurrencyFormat(value: Format): Self = this.set("currencyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyFormat: Self = this.set("currencyFormat", js.undefined)
    
    @scala.inline
    def setDefaults(value: Format): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setOrdinalFormat(value: Format): Self = this.set("ordinalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinalFormat: Self = this.set("ordinalFormat", js.undefined)
    
    @scala.inline
    def setPercentageFormat(value: Format): Self = this.set("percentageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentageFormat: Self = this.set("percentageFormat", js.undefined)
    
    @scala.inline
    def setSpaceSeparated(value: Boolean): Self = this.set("spaceSeparated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceSeparated: Self = this.set("spaceSeparated", js.undefined)
    
    @scala.inline
    def setTimeDefaults(value: Format): Self = this.set("timeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDefaults: Self = this.set("timeDefaults", js.undefined)
  }
}
