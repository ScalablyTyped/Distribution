package typings.momentDurationFormat.mod.momentAugmentingMod

import typings.momentDurationFormat.momentDurationFormatBooleans.`false`
import typings.momentDurationFormat.momentDurationFormatBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationFormatSettings extends js.Object {
  
  var decimalSeparator: js.UndefOr[String] = js.native
  
  var forceLength: js.UndefOr[Boolean] = js.native
  
  var grouping: js.UndefOr[js.Array[Double]] = js.native
  
  var groupingSeparator: js.UndefOr[String] = js.native
  
  var largest: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var stopTrim: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | TemplateFunction] = js.native
  
  var trim: js.UndefOr[`false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])] = js.native
  
  var trunc: js.UndefOr[`true`] = js.native
  
  var useGrouping: js.UndefOr[Boolean] = js.native
  
  var useLeftUnits: js.UndefOr[Boolean] = js.native
  
  var usePlural: js.UndefOr[Boolean] = js.native
  
  var useSignificantDigits: js.UndefOr[`true`] = js.native
  
  var useToLocaleString: js.UndefOr[Boolean] = js.native
  
  var userLocale: js.UndefOr[String] = js.native
}
object DurationFormatSettings {
  
  @scala.inline
  def apply(): DurationFormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationFormatSettings]
  }
  
  @scala.inline
  implicit class DurationFormatSettingsOps[Self <: DurationFormatSettings] (val x: Self) extends AnyVal {
    
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
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    
    @scala.inline
    def setForceLength(value: Boolean): Self = this.set("forceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceLength: Self = this.set("forceLength", js.undefined)
    
    @scala.inline
    def setGroupingVarargs(value: Double*): Self = this.set("grouping", js.Array(value :_*))
    
    @scala.inline
    def setGrouping(value: js.Array[Double]): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    
    @scala.inline
    def setGroupingSeparator(value: String): Self = this.set("groupingSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingSeparator: Self = this.set("groupingSeparator", js.undefined)
    
    @scala.inline
    def setLargest(value: Double): Self = this.set("largest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargest: Self = this.set("largest", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setStopTrim(value: String): Self = this.set("stopTrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTrim: Self = this.set("stopTrim", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | TemplateFunction): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTrimVarargs(value: (UnitOfTrim | String)*): Self = this.set("trim", js.Array(value :_*))
    
    @scala.inline
    def setTrim(value: `false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setTrunc(value: `true`): Self = this.set("trunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrunc: Self = this.set("trunc", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
    
    @scala.inline
    def setUseLeftUnits(value: Boolean): Self = this.set("useLeftUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLeftUnits: Self = this.set("useLeftUnits", js.undefined)
    
    @scala.inline
    def setUsePlural(value: Boolean): Self = this.set("usePlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePlural: Self = this.set("usePlural", js.undefined)
    
    @scala.inline
    def setUseSignificantDigits(value: `true`): Self = this.set("useSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSignificantDigits: Self = this.set("useSignificantDigits", js.undefined)
    
    @scala.inline
    def setUseToLocaleString(value: Boolean): Self = this.set("useToLocaleString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseToLocaleString: Self = this.set("useToLocaleString", js.undefined)
    
    @scala.inline
    def setUserLocale(value: String): Self = this.set("userLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocale: Self = this.set("userLocale", js.undefined)
  }
}
