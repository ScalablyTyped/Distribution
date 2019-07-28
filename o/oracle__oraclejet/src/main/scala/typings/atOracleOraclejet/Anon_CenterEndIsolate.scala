package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEndIsolate extends js.Object {
  var isolate: js.UndefOr[off | on] = js.undefined
  var labelHalign: js.UndefOr[center | end | start] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var useNodeColor: js.UndefOr[on | off] = js.undefined
}

object Anon_CenterEndIsolate {
  @scala.inline
  def apply(
    isolate: off | on = null,
    labelHalign: center | end | start = null,
    labelStyle: js.Object = null,
    useNodeColor: on | off = null
  ): Anon_CenterEndIsolate = {
    val __obj = js.Dynamic.literal()
    if (isolate != null) __obj.updateDynamic("isolate")(isolate.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (useNodeColor != null) __obj.updateDynamic("useNodeColor")(useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CenterEndIsolate]
  }
}

