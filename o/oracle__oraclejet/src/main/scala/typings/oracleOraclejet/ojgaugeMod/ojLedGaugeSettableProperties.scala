package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.AnonAutoBillionConverterMillionNone
import typings.oracleOraclejet.AnonComponentNameLabelAndValue
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext
import typings.oracleOraclejet.AnonStyle
import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0`
import typings.oracleOraclejet.oracleOraclejetNumbers.`180`
import typings.oracleOraclejet.oracleOraclejetNumbers.`270`
import typings.oracleOraclejet.oracleOraclejetNumbers.`90`
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var borderColor: String
  var color: String
  var label: AnonStyle
  var max: Double
  var metricLabel: AnonAutoBillionConverterMillionNone
  var min: Double
  var rotation: `90` | `180` | `270` | `0`
  var size: Double
  var svgClassName: String
  var svgStyle: js.Object
  var thresholds: js.Array[Threshold]
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle
  var value: Double | Null
  var visualEffects: none | auto
}

object ojLedGaugeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    label: AnonStyle,
    max: Double,
    metricLabel: AnonAutoBillionConverterMillionNone,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext,
    trackResize: on | off,
    translations: AnonComponentNameLabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto,
    value: Int | Double = null
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
}

