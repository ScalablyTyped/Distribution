package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_BorderColorCircle
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`0DOT5`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`1`
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.meet
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var changed: Boolean
  var changedState: Anon_BorderColorCircle
  var hoverState: Anon_BorderColorCircle
  var max: Double
  var min: Double
  var orientation: vertical | horizontal
  var preserveAspectRatio: none | meet
  var readonly: Boolean
  var selectedState: Anon_BorderColorCircle
  var step: `0DOT5` | `1`
  var thresholds: js.Array[Threshold]
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965
  val transientValue: Double | Null
  var unselectedState: Anon_BorderColorCircle
  var value: Double | Null
  var visualEffects: none | auto
}

object ojRatingGaugeSettableProperties {
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: Anon_BorderColorCircle,
    hoverState: Anon_BorderColorCircle,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: Anon_BorderColorCircle,
    step: `0DOT5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_656598965,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    unselectedState: Anon_BorderColorCircle,
    visualEffects: none | auto,
    transientValue: Int | Double = null,
    value: Int | Double = null
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
}

