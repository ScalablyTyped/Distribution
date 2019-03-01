package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCenter extends js.Object {
  var position: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoCenter {
  @scala.inline
  def apply(
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    style: js.Object = null,
    text: java.lang.String = null
  ): Anon_AutoCenter = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_AutoCenter]
  }
}

