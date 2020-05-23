package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonsetOneSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
  var disabled: Boolean
  var display: all | icons
  var focusManagement: oneTabstop | none
  var value: js.Any
}

object ojButtonsetOneSettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    focusManagement: oneTabstop | none,
    value: js.Any,
    translations: js.Object = null
  ): ojButtonsetOneSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], focusManagement = focusManagement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonsetOneSettableProperties]
  }
}

