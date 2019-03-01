package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugError extends js.Object {
  var logLevel: js.UndefOr[
    phantomLib.phantomLibStrings.debug | phantomLib.phantomLibStrings.info | phantomLib.phantomLibStrings.warn | phantomLib.phantomLibStrings.error
  ] = js.undefined
  var logger: js.UndefOr[Anon_Debug] = js.undefined
  var phantomPath: js.UndefOr[java.lang.String] = js.undefined
  var shimPath: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DebugError {
  @scala.inline
  def apply(
    logLevel: phantomLib.phantomLibStrings.debug | phantomLib.phantomLibStrings.info | phantomLib.phantomLibStrings.warn | phantomLib.phantomLibStrings.error = null,
    logger: Anon_Debug = null,
    phantomPath: java.lang.String = null,
    shimPath: java.lang.String = null
  ): Anon_DebugError = {
    val __obj = js.Dynamic.literal()
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath)
    if (shimPath != null) __obj.updateDynamic("shimPath")(shimPath)
    __obj.asInstanceOf[Anon_DebugError]
  }
}

