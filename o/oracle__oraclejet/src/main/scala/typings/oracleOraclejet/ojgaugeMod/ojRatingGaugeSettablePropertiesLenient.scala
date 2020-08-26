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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ojRatingGaugeSettablePropertiesLenientOps[Self <: ojRatingGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setChangedState(value: Source): Self = this.set("changedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedState: Self = this.set("changedState", js.undefined)
    @scala.inline
    def setHoverState(value: Source): Self = this.set("hoverState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverState: Self = this.set("hoverState", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: none | meet): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setSelectedState(value: Source): Self = this.set("selectedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedState: Self = this.set("selectedState", js.undefined)
    @scala.inline
    def setStep(value: `0.5` | `1`): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = this.set("thresholds", js.Array(value :_*))
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
    @scala.inline
    def setTooltip(value: `11`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransientValue: Self = this.set("transientValue", js.undefined)
    @scala.inline
    def setTransientValueNull: Self = this.set("transientValue", null)
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setUnselectedState(value: Source): Self = this.set("unselectedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectedState: Self = this.set("unselectedState", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualEffects: Self = this.set("visualEffects", js.undefined)
  }
  
}

