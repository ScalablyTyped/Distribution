package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Isolate extends js.Object {
  var isolate: js.UndefOr[off | on] = js.undefined
  var labelHalign: js.UndefOr[center | end | start] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var useNodeColor: js.UndefOr[on | off] = js.undefined
}

object Isolate {
  @scala.inline
  def apply(
    isolate: off | on = null,
    labelHalign: center | end | start = null,
    labelStyle: js.Object = null,
    useNodeColor: on | off = null
  ): Isolate = {
    val __obj = js.Dynamic.literal()
    if (isolate != null) __obj.updateDynamic("isolate")(isolate.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (useNodeColor != null) __obj.updateDynamic("useNodeColor")(useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isolate]
  }
}

