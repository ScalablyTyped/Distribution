package typings.oracleOraclejet.ojdvtBaseMod

import typings.oracleOraclejet.AnonLabelCountWithTotal
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: AnonLabelCountWithTotal
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: AnonLabelCountWithTotal): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
}

