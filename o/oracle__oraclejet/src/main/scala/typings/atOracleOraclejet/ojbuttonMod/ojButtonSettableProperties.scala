package typings.atOracleOraclejet.ojbuttonMod

import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.half
import typings.atOracleOraclejet.atOracleOraclejetStrings.icons
import typings.atOracleOraclejet.atOracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
  var disabled: Boolean
  var display: all | icons
}

object ojButtonSettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    translations: js.Object = null
  ): ojButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled, display = display.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojButtonSettableProperties]
  }
}

