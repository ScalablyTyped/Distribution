package typings.atOracleOraclejet.ojtoolbarMod

import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.half
import typings.atOracleOraclejet.atOracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojToolbarSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
}

object ojToolbarSettableProperties {
  @scala.inline
  def apply(chroming: full | half | outlined, translations: js.Object = null): ojToolbarSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojToolbarSettableProperties]
  }
}

