package typings.parquetjs.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParquetWriterOpts extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var bitWidth: js.UndefOr[Double] = js.undefined
  var disableEnvelope: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var rowGroupSize: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var useDataPageV2: js.UndefOr[Boolean] = js.undefined
}

object ParquetWriterOpts {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    bitWidth: Int | Double = null,
    disableEnvelope: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    fd: Int | Double = null,
    flags: String = null,
    mode: Int | Double = null,
    rowGroupSize: Int | Double = null,
    start: Int | Double = null,
    useDataPageV2: js.UndefOr[Boolean] = js.undefined
  ): ParquetWriterOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bitWidth != null) __obj.updateDynamic("bitWidth")(bitWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEnvelope)) __obj.updateDynamic("disableEnvelope")(disableEnvelope.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rowGroupSize != null) __obj.updateDynamic("rowGroupSize")(rowGroupSize.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(useDataPageV2)) __obj.updateDynamic("useDataPageV2")(useDataPageV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParquetWriterOpts]
  }
}

