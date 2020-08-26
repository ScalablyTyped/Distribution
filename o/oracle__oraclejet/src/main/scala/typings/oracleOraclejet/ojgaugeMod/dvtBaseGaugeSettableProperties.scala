package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseGaugeSettableProperties extends dvtBaseComponentSettableProperties {
  @JSName("translations")
  var translations_dvtBaseGaugeSettableProperties: LabelAndValue = js.native
}

object dvtBaseGaugeSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: LabelAndValue): dvtBaseGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseGaugeSettableProperties]
  }
  @scala.inline
  implicit class dvtBaseGaugeSettablePropertiesOps[Self <: dvtBaseGaugeSettableProperties] (val x: Self) extends AnyVal {
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
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

