package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuButtonSettableProperties extends ojButtonSettableProperties

object ojMenuButtonSettableProperties {
  @scala.inline
  def apply(
    chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined,
    disabled: scala.Boolean,
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons,
    translations: js.Object = null
  ): ojMenuButtonSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chroming")(chroming.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojMenuButtonSettableProperties]
  }
}

