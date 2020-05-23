package typings.oracleOraclejet.ojtoolbarMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojToolbarSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
}

object ojToolbarSettableProperties {
  @scala.inline
  def apply(chroming: full | half | outlined, translations: js.Object = null): ojToolbarSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojToolbarSettableProperties]
  }
}

