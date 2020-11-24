package typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamesNumberFormatConfiguration extends js.Object {
  
  /** The curreny code string. Only used for CURRENCY format type. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** The number of decimal places for number. Only used for NUMERIC format type. */
  var numDecimalPlaces: js.UndefOr[Double] = js.native
  
  /** The formatting for the number. */
  var numberFormatType: js.UndefOr[String] = js.native
  
  /** An optional suffix for the NUMERIC format type. These strings follow the same plural rules as all Android string resources. */
  var suffix: js.UndefOr[GamesNumberAffixConfiguration] = js.native
}
object GamesNumberFormatConfiguration {
  
  @scala.inline
  def apply(): GamesNumberFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesNumberFormatConfiguration]
  }
  
  @scala.inline
  implicit class GamesNumberFormatConfigurationOps[Self <: GamesNumberFormatConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setNumDecimalPlaces(value: Double): Self = this.set("numDecimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumDecimalPlaces: Self = this.set("numDecimalPlaces", js.undefined)
    
    @scala.inline
    def setNumberFormatType(value: String): Self = this.set("numberFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormatType: Self = this.set("numberFormatType", js.undefined)
    
    @scala.inline
    def setSuffix(value: GamesNumberAffixConfiguration): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
