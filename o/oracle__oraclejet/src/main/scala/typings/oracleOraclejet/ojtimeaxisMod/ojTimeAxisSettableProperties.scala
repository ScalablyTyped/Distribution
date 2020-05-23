package typings.oracleOraclejet.ojtimeaxisMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.oracleOraclejetStrings.days
import typings.oracleOraclejet.oracleOraclejetStrings.hours
import typings.oracleOraclejet.oracleOraclejetStrings.minutes
import typings.oracleOraclejet.oracleOraclejetStrings.months
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.quarters
import typings.oracleOraclejet.oracleOraclejetStrings.seconds
import typings.oracleOraclejet.oracleOraclejetStrings.weeks
import typings.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String]
  var end: String
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var start: String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: LabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: Converters | Converter[String],
    end: String,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    start: String,
    trackResize: on | off,
    translations: LabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

