package typings
package atOracleOraclejetLib.ojmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var disabled: scala.Boolean
  var openOptions: atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions
  @JSName("translations")
  var translations_ojMenuSettableProperties: atOracleOraclejetLib.Anon_AriaFocusSkipLink
}

object ojMenuSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    openOptions: atOracleOraclejetLib.ojmenuMod.ojMenuNs.OpenOptions,
    translations: atOracleOraclejetLib.Anon_AriaFocusSkipLink
  ): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("openOptions")(openOptions)
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
}

