package typings
package parquetjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoClose extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var bitWidth: js.UndefOr[scala.Double] = js.undefined
  var disableEnvelope: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fd: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var rowGroupSize: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoClose {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    bitWidth: scala.Int | scala.Double = null,
    disableEnvelope: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    fd: scala.Int | scala.Double = null,
    flags: java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    rowGroupSize: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): Anon_AutoClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (bitWidth != null) __obj.updateDynamic("bitWidth")(bitWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEnvelope)) __obj.updateDynamic("disableEnvelope")(disableEnvelope)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rowGroupSize != null) __obj.updateDynamic("rowGroupSize")(rowGroupSize.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoClose]
  }
}

