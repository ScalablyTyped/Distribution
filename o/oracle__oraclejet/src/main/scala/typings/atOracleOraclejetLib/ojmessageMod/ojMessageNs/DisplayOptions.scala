package typings
package atOracleOraclejetLib.ojmessageMod.ojMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DisplayOptions extends js.Object {
  var category: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
}

object DisplayOptions {
  @scala.inline
  def apply(
    category: atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

