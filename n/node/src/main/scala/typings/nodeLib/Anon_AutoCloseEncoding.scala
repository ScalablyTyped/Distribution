package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoCloseEncoding extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var fd: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoCloseEncoding {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    fd: scala.Int | scala.Double = null,
    flags: java.lang.String = null,
    highWaterMark: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): Anon_AutoCloseEncoding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoCloseEncoding]
  }
}

