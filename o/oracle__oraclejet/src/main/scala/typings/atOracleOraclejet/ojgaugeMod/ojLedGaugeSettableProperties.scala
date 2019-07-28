package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_AutoBillionConverterMillionNone
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
import typings.atOracleOraclejet.Anon_Style
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`0`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`180`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`270`
import typings.atOracleOraclejet.atOracleOraclejetNumbers.`90`
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangle
import typings.atOracleOraclejet.ojgaugeMod.ojLedGaugeNs.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var borderColor: String
  var color: String
  var label: Anon_Style
  var max: Double
  var metricLabel: Anon_AutoBillionConverterMillionNone
  var min: Double
  var rotation: `90` | `180` | `270` | `0`
  var size: Double
  var svgClassName: String
  var svgStyle: js.Object
  var thresholds: js.Array[Threshold]
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle
  var value: Double | Null
  var visualEffects: none | auto
}

object ojLedGaugeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    label: Anon_Style,
    max: Double,
    metricLabel: Anon_AutoBillionConverterMillionNone,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto,
    value: Int | Double = null
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, label = label, max = max, metricLabel = metricLabel, min = min, rotation = rotation.asInstanceOf[js.Any], size = size, svgClassName = svgClassName, svgStyle = svgStyle, thresholds = thresholds, tooltip = tooltip, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
}

