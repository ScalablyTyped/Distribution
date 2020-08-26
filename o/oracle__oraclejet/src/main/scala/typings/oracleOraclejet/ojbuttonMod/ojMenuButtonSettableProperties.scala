package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMenuButtonSettableProperties extends ojButtonSettableProperties

object ojMenuButtonSettableProperties {
  @scala.inline
  def apply(chroming: full | half | outlined, disabled: Boolean, display: all | icons): ojMenuButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuButtonSettableProperties]
  }
}

