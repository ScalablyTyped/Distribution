package typings
package atOracleOraclejetLib.ojtoolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojToolbarSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined
}

object ojToolbarSettableProperties {
  @scala.inline
  def apply(
    chroming: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.half | atOracleOraclejetLib.atOracleOraclejetLibStrings.outlined,
    translations: js.Object = null
  ): ojToolbarSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chroming")(chroming.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojToolbarSettableProperties]
  }
}

