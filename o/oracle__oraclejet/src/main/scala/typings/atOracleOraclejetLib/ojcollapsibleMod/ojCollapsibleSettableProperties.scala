package typings
package atOracleOraclejetLib.ojcollapsibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojCollapsibleSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var disabled: scala.Boolean
  var expandArea: atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.disclosureIcon
  var expanded: scala.Boolean
}

object ojCollapsibleSettableProperties {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    expandArea: atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.disclosureIcon,
    expanded: scala.Boolean,
    translations: js.Object = null
  ): ojCollapsibleSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("expandArea")(expandArea.asInstanceOf[js.Any])
    __obj.updateDynamic("expanded")(expanded)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojCollapsibleSettableProperties]
  }
}

