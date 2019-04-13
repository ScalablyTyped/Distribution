package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderOptions extends js.Object {
  var dont_print: js.UndefOr[scala.Boolean] = js.undefined
  var enable_reqheaders_recording: js.UndefOr[scala.Boolean] = js.undefined
  var logging: js.UndefOr[js.Function1[/* content */ java.lang.String, scala.Unit]] = js.undefined
  var output_objects: js.UndefOr[scala.Boolean] = js.undefined
  var use_separator: js.UndefOr[scala.Boolean] = js.undefined
}

object RecorderOptions {
  @scala.inline
  def apply(
    dont_print: js.UndefOr[scala.Boolean] = js.undefined,
    enable_reqheaders_recording: js.UndefOr[scala.Boolean] = js.undefined,
    logging: /* content */ java.lang.String => scala.Unit = null,
    output_objects: js.UndefOr[scala.Boolean] = js.undefined,
    use_separator: js.UndefOr[scala.Boolean] = js.undefined
  ): RecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dont_print)) __obj.updateDynamic("dont_print")(dont_print)
    if (!js.isUndefined(enable_reqheaders_recording)) __obj.updateDynamic("enable_reqheaders_recording")(enable_reqheaders_recording)
    if (logging != null) __obj.updateDynamic("logging")(js.Any.fromFunction1(logging))
    if (!js.isUndefined(output_objects)) __obj.updateDynamic("output_objects")(output_objects)
    if (!js.isUndefined(use_separator)) __obj.updateDynamic("use_separator")(use_separator)
    __obj.asInstanceOf[RecorderOptions]
  }
}

