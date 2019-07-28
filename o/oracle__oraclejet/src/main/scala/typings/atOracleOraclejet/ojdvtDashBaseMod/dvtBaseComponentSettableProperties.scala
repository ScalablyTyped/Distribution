package typings.atOracleOraclejet.ojdvtDashBaseMod

import typings.atOracleOraclejet.Anon_LabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: Anon_LabelAndValue
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: Anon_LabelAndValue): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
  
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
}

