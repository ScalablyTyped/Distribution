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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojRatingGaugeSettableProperties
  extends StObject
     with dvtBaseGaugeSettableProperties {
  
  var changed: Boolean
  
  var changedState: Source
  
  var hoverState: Source
  
  var max: Double
  
  var min: Double
  
  var orientation: vertical | horizontal
  
  var preserveAspectRatio: none | meet
  
  var readonly: Boolean
  
  var selectedState: Source
  
  var step: `0.5` | `1`
  
  var thresholds: js.Array[Threshold]
  
  var tooltip: `11`
  
  val transientValue: Double | Null
  
  var unselectedState: Source
  
  var value: Double | Null
  
  var visualEffects: none | auto
}
object ojRatingGaugeSettableProperties {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any], transientValue = null, value = null)
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
  
  extension [Self <: ojRatingGaugeSettableProperties](x: Self) {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedState(value: Source): Self = StObject.set(x, "changedState", value.asInstanceOf[js.Any])
    
    inline def setHoverState(value: Source): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: none | meet): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setSelectedState(value: Source): Self = StObject.set(x, "selectedState", value.asInstanceOf[js.Any])
    
    inline def setStep(value: `0.5` | `1`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    inline def setTooltip(value: `11`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    inline def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    inline def setUnselectedState(value: Source): Self = StObject.set(x, "unselectedState", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}
