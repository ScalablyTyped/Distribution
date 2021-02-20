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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojRatingGaugeSettableProperties> */
@js.native
trait ojRatingGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var changed: js.UndefOr[Boolean] = js.native
  
  var changedState: js.UndefOr[Source] = js.native
  
  var hoverState: js.UndefOr[Source] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  var preserveAspectRatio: js.UndefOr[none | meet] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var selectedState: js.UndefOr[Source] = js.native
  
  var step: js.UndefOr[`0.5` | `1`] = js.native
  
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.native
  
  var tooltip: js.UndefOr[`11`] = js.native
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var transientValue: js.UndefOr[Double | Null] = js.native
  
  var translations: js.UndefOr[LabelAndValue] = js.native
  
  var unselectedState: js.UndefOr[Source] = js.native
  
  var value: js.UndefOr[Double | Null] = js.native
  
  var visualEffects: js.UndefOr[none | auto] = js.native
}
object ojRatingGaugeSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojRatingGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojRatingGaugeSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojRatingGaugeSettablePropertiesLenientMutableBuilder[Self <: ojRatingGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedState(value: Source): Self = StObject.set(x, "changedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedStateUndefined: Self = StObject.set(x, "changedState", js.undefined)
    
    @scala.inline
    def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    @scala.inline
    def setHoverState(value: Source): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStateUndefined: Self = StObject.set(x, "hoverState", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: none | meet): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setSelectedState(value: Source): Self = StObject.set(x, "selectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStateUndefined: Self = StObject.set(x, "selectedState", js.undefined)
    
    @scala.inline
    def setStep(value: `0.5` | `1`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: `11`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    @scala.inline
    def setTransientValueUndefined: Self = StObject.set(x, "transientValue", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setUnselectedState(value: Source): Self = StObject.set(x, "unselectedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedStateUndefined: Self = StObject.set(x, "unselectedState", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffectsUndefined: Self = StObject.set(x, "visualEffects", js.undefined)
  }
}
