package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoClose extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var emitClose: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var fd: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object Anon_AutoClose {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: java.lang.String = null,
    end: Int | Double = null,
    fd: Int | Double = null,
    flags: java.lang.String = null,
    highWaterMark: Int | Double = null,
    mode: Int | Double = null,
    start: Int | Double = null
  ): Anon_AutoClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoClose]
  }
}

