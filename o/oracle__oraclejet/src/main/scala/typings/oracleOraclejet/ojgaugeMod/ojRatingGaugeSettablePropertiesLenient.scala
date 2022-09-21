package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojRatingGaugeSettableProperties> */
trait ojRatingGaugeSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var changed: js.UndefOr[Boolean] = js.undefined
  
  var changedState: js.UndefOr[Source] = js.undefined
  
  var hoverState: js.UndefOr[Source] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[none | meet] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var selectedState: js.UndefOr[Source] = js.undefined
  
  var step: js.UndefOr[`0.5` | `1`] = js.undefined
  
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  
  var tooltip: js.UndefOr[`11`] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var transientValue: js.UndefOr[Double | Null] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  
  var unselectedState: js.UndefOr[Source] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
  
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}
object ojRatingGaugeSettablePropertiesLenient {
  
  inline def apply(): ojRatingGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojRatingGaugeSettablePropertiesLenient]
  }
  
  extension [Self <: ojRatingGaugeSettablePropertiesLenient](x: Self) {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedState(value: Source): Self = StObject.set(x, "changedState", value.asInstanceOf[js.Any])
    
    inline def setChangedStateUndefined: Self = StObject.set(x, "changedState", js.undefined)
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setHoverState(value: Source): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    inline def setHoverStateUndefined: Self = StObject.set(x, "hoverState", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPreserveAspectRatio(value: none | meet): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setSelectedState(value: Source): Self = StObject.set(x, "selectedState", value.asInstanceOf[js.Any])
    
    inline def setSelectedStateUndefined: Self = StObject.set(x, "selectedState", js.undefined)
    
    inline def setStep(value: `0.5` | `1`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTooltip(value: `11`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    inline def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    inline def setTransientValueUndefined: Self = StObject.set(x, "transientValue", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setUnselectedState(value: Source): Self = StObject.set(x, "unselectedState", value.asInstanceOf[js.Any])
    
    inline def setUnselectedStateUndefined: Self = StObject.set(x, "unselectedState", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectsUndefined: Self = StObject.set(x, "visualEffects", js.undefined)
  }
}
