package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var borderColor: java.lang.String
  var color: java.lang.String
  var label: atOracleOraclejetLib.Anon_Style
  var max: scala.Double
  var metricLabel: atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone
  var min: scala.Double
  var rotation: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`
  var size: scala.Double
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold]
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle
  var value: scala.Double | scala.Null
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object ojLedGaugeSettableProperties {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    color: java.lang.String,
    label: atOracleOraclejetLib.Anon_Style,
    max: scala.Double,
    metricLabel: atOracleOraclejetLib.Anon_AutoBillionConverterMillionNone,
    min: scala.Double,
    rotation: atOracleOraclejetLib.atOracleOraclejetLibNumbers.`90` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`180` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`270` | atOracleOraclejetLib.atOracleOraclejetLibNumbers.`0`,
    size: scala.Double,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojLedGaugeNs.Threshold],
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle,
    visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    value: scala.Int | scala.Double = null
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, label = label, max = max, metricLabel = metricLabel, min = min, rotation = rotation.asInstanceOf[js.Any], size = size, svgClassName = svgClassName, svgStyle = svgStyle, thresholds = thresholds, tooltip = tooltip, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
}

