package typings.oracleOraclejet.ojdvtBaseMod

import typings.oracleOraclejet.anon.LabelCountWithTotal
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off = js.native
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: LabelCountWithTotal = js.native
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: LabelCountWithTotal): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
  @scala.inline
  implicit class dvtBaseComponentSettablePropertiesOps[Self <: dvtBaseComponentSettableProperties] (val x: Self) extends AnyVal {
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
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: LabelCountWithTotal): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

