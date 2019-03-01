package typings
package atOracleOraclejetLib.ojbuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonsetOneSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
  var disabled: scala.Boolean
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  var focusManagement: atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var value: js.Any
}

object ojButtonsetOneSettableProperties {
  @scala.inline
  def apply(
    chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined,
    disabled: scala.Boolean,
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons,
    focusManagement: atOracleOraclejetLib.atOracleOraclejetLibStrings.oneTabstop | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    value: js.Any,
    translations: js.Object = null
  ): ojButtonsetOneSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chroming")(chroming.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.updateDynamic("focusManagement")(focusManagement.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojButtonsetOneSettableProperties]
  }
}

