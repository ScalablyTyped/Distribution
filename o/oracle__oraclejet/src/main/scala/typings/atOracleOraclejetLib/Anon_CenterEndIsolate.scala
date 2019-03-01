package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEndIsolate extends js.Object {
  var isolate: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  ] = js.undefined
  var labelHalign: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  ] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var useNodeColor: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
}

object Anon_CenterEndIsolate {
  @scala.inline
  def apply(
    isolate: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on = null,
    labelHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start = null,
    labelStyle: js.Object = null,
    useNodeColor: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null
  ): Anon_CenterEndIsolate = {
    val __obj = js.Dynamic.literal()
    if (isolate != null) __obj.updateDynamic("isolate")(isolate.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (useNodeColor != null) __obj.updateDynamic("useNodeColor")(useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CenterEndIsolate]
  }
}

