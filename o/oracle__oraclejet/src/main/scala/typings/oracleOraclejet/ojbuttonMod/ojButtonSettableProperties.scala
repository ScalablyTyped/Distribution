package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
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
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonSettableProperties]
  }
}

