package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseGaugeSettableProperties
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  @JSName("translations")
  var translations_dvtBaseGaugeSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
}

object dvtBaseGaugeSettableProperties {
  @scala.inline
  def apply(
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  ): dvtBaseGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
  
    __obj.asInstanceOf[dvtBaseGaugeSettableProperties]
  }
}

