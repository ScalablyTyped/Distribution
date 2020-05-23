package typings.oracleOraclejet.ojdvtBaseMod

import typings.oracleOraclejet.anon.LabelCountWithTotal
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: LabelCountWithTotal
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: LabelCountWithTotal): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
}

