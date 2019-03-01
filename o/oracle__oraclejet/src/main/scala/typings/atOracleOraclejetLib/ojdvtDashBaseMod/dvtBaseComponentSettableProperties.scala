package typings
package atOracleOraclejetLib.ojdvtDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dvtBaseComponentSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: atOracleOraclejetLib.Anon_LabelAndValue
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_LabelAndValue
  ): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
}

