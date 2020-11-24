package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.Source
import typings.oracleOraclejet.anon.`11`
import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typings.oracleOraclejet.oracleOraclejetNumbers.`1`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.meet
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  
  var changed: Boolean = js.native
  
  var changedState: Source = js.native
  
  var hoverState: Source = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var orientation: vertical | horizontal = js.native
  
  var preserveAspectRatio: none | meet = js.native
  
  var readonly: Boolean = js.native
  
  var selectedState: Source = js.native
  
  var step: `0.5` | `1` = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `11` = js.native
  
  val transientValue: Double | Null = js.native
  
  var unselectedState: Source = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojRatingGaugeSettableProperties {
  
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: Source,
    hoverState: Source,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: Source,
    step: `0.5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: `11`,
    trackResize: on | off,
    translations: LabelAndValue,
    unselectedState: Source,
    visualEffects: none | auto
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
  
  @scala.inline
  implicit class ojRatingGaugeSettablePropertiesOps[Self <: ojRatingGaugeSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedState(value: Source): Self = this.set("changedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverState(value: Source): Self = this.set("hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: none | meet): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedState(value: Source): Self = this.set("selectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: `0.5` | `1`): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = this.set("thresholds", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: `11`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedState(value: Source): Self = this.set("unselectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueNull: Self = this.set("transientValue", null)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
