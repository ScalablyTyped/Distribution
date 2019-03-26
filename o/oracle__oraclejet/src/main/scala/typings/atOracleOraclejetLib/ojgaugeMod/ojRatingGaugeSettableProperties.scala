package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var changed: scala.Boolean
  var changedState: atOracleOraclejetLib.Anon_BorderColorCircle
  var hoverState: atOracleOraclejetLib.Anon_BorderColorCircle
  var max: scala.Double
  var min: scala.Double
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  var preserveAspectRatio: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet
  var readonly: scala.Boolean
  var selectedState: atOracleOraclejetLib.Anon_BorderColorCircle
  var step: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1`
  var thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold]
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_885303288
  val transientValue: scala.Double | scala.Null
  var unselectedState: atOracleOraclejetLib.Anon_BorderColorCircle
  var value: scala.Double | scala.Null
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object ojRatingGaugeSettableProperties {
  @scala.inline
  def apply(
    changed: scala.Boolean,
    changedState: atOracleOraclejetLib.Anon_BorderColorCircle,
    hoverState: atOracleOraclejetLib.Anon_BorderColorCircle,
    max: scala.Double,
    min: scala.Double,
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal,
    preserveAspectRatio: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.meet,
    readonly: scala.Boolean,
    selectedState: atOracleOraclejetLib.Anon_BorderColorCircle,
    step: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0DOT5` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`1`,
    thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojRatingGaugeNs.Threshold],
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_885303288,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    unselectedState: atOracleOraclejetLib.Anon_BorderColorCircle,
    visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    transientValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed, changedState = changedState, hoverState = hoverState, max = max, min = min, orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly, selectedState = selectedState, step = step.asInstanceOf[js.Any], thresholds = thresholds, tooltip = tooltip, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, unselectedState = unselectedState, visualEffects = visualEffects.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
}

