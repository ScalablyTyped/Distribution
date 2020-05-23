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
    bitWidth: js.UndefOr[Double] = js.undefined,
    disableEnvelope: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    fd: js.UndefOr[Double] = js.undefined,
    flags: String = null,
    mode: js.UndefOr[Double] = js.undefined,
    rowGroupSize: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    useDataPageV2: js.UndefOr[Boolean] = js.undefined
  ): ParquetWriterOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bitWidth)) __obj.updateDynamic("bitWidth")(bitWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEnvelope)) __obj.updateDynamic("disableEnvelope")(disableEnvelope.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fd)) __obj.updateDynamic("fd")(fd.get.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupSize)) __obj.updateDynamic("rowGroupSize")(rowGroupSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDataPageV2)) __obj.updateDynamic("useDataPageV2")(useDataPageV2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParquetWriterOpts]
  }
}

