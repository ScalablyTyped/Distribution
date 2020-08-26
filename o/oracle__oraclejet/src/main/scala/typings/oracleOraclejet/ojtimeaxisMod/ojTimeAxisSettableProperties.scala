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

@js.native
trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String] = js.native
  var end: String = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var start: String = js.native
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: LabelAndValue = js.native
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
  @scala.inline
  implicit class ojTimeAxisSettablePropertiesOps[Self <: ojTimeAxisSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConverter(value: Converters | Converter[String]): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

