package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon8
import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.AnonText
import typings.oracleOraclejet.AnonTextType
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGaugeSettableProperties> */
trait ojLedGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[AnonText] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var metricLabel: js.UndefOr[AnonTextType] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[`90` | `180` | `270` | `0`] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  var tooltip: js.UndefOr[Anon8] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var `type`: js.UndefOr[arrow | diamond | square | rectangle | triangle | star | human | circle] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojLedGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    color: String = null,
    label: AnonText = null,
    max: Int | Double = null,
    metricLabel: AnonTextType = null,
    min: Int | Double = null,
    rotation: `90` | `180` | `270` | `0` = null,
    size: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    thresholds: js.Array[Threshold] = null,
    tooltip: Anon8 = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = null,
    value: Int | Double = null,
    visualEffects: none | auto = null
  ): ojLedGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (metricLabel != null) __obj.updateDynamic("metricLabel")(metricLabel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettablePropertiesLenient]
  }
}

