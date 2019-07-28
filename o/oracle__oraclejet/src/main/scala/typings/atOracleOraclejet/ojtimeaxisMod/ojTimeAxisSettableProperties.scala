package typings.atOracleOraclejet.ojtimeaxisMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.days
import typings.atOracleOraclejet.atOracleOraclejetStrings.hours
import typings.atOracleOraclejet.atOracleOraclejetStrings.minutes
import typings.atOracleOraclejet.atOracleOraclejetStrings.months
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.quarters
import typings.atOracleOraclejet.atOracleOraclejetStrings.seconds
import typings.atOracleOraclejet.atOracleOraclejetStrings.weeks
import typings.atOracleOraclejet.atOracleOraclejetStrings.years
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojtimeaxisMod.ojTimeAxisNs.Converters
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String]
  var end: String
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var start: String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: Anon_ComponentNameLabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: Converters | Converter[String],
    end: String,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    start: String,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end, scale = scale.asInstanceOf[js.Any], start = start, trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
  
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

