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
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166
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
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_718918166,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    unselectedState: atOracleOraclejetLib.Anon_BorderColorCircle,
    visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    transientValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changed")(changed)
    __obj.updateDynamic("changedState")(changedState)
    __obj.updateDynamic("hoverState")(hoverState)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("selectedState")(selectedState)
    __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.updateDynamic("thresholds")(thresholds)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("unselectedState")(unselectedState)
    __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
}

