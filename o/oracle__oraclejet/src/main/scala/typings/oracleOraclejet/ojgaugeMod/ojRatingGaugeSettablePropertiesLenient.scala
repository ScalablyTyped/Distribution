package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon9
import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.AnonSource
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
trait ojRatingGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var changed: js.UndefOr[Boolean] = js.undefined
  var changedState: js.UndefOr[AnonSource] = js.undefined
  var hoverState: js.UndefOr[AnonSource] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  var preserveAspectRatio: js.UndefOr[none | meet] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var selectedState: js.UndefOr[AnonSource] = js.undefined
  var step: js.UndefOr[`0.5` | `1`] = js.undefined
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  var tooltip: js.UndefOr[Anon9] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var transientValue: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var unselectedState: js.UndefOr[AnonSource] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojRatingGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    changed: js.UndefOr[Boolean] = js.undefined,
    changedState: AnonSource = null,
    hoverState: AnonSource = null,
    max: Int | Double = null,
    min: Int | Double = null,
    orientation: vertical | horizontal = null,
    preserveAspectRatio: none | meet = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    selectedState: AnonSource = null,
    step: `0.5` | `1` = null,
    thresholds: js.Array[Threshold] = null,
    tooltip: Anon9 = null,
    trackResize: on | off = null,
    transientValue: Int | Double = null,
    translations: AnonLabelAndValue = null,
    unselectedState: AnonSource = null,
    value: Int | Double = null,
    visualEffects: none | auto = null
  ): ojRatingGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    if (changedState != null) __obj.updateDynamic("changedState")(changedState.asInstanceOf[js.Any])
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (selectedState != null) __obj.updateDynamic("selectedState")(selectedState.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (unselectedState != null) __obj.updateDynamic("unselectedState")(unselectedState.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettablePropertiesLenient]
  }
}

