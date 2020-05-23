package typings.node.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoClose extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var emitClose: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AutoClose {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: BufferEncoding = null,
    end: js.UndefOr[Double] = js.undefined,
    fd: js.UndefOr[Double] = js.undefined,
    flags: String = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): AutoClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fd)) __obj.updateDynamic("fd")(fd.get.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClose]
  }
}

