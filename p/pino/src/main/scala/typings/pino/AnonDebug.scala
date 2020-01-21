package typings.pino

import org.scalablytyped.runtime.StringDictionary
import typings.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends /* logLevel */ StringDictionary[WriteFn] {
  var debug: js.UndefOr[WriteFn] = js.undefined
  var error: js.UndefOr[WriteFn] = js.undefined
  var fatal: js.UndefOr[WriteFn] = js.undefined
  var info: js.UndefOr[WriteFn] = js.undefined
  var trace: js.UndefOr[WriteFn] = js.undefined
  var warn: js.UndefOr[WriteFn] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    StringDictionary: /* logLevel */ StringDictionary[WriteFn] = null,
    debug: /* o */ js.Object => Unit = null,
    error: /* o */ js.Object => Unit = null,
    fatal: /* o */ js.Object => Unit = null,
    info: /* o */ js.Object => Unit = null,
    trace: /* o */ js.Object => Unit = null,
    warn: /* o */ js.Object => Unit = null
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (fatal != null) __obj.updateDynamic("fatal")(js.Any.fromFunction1(fatal))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1(trace))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[AnonDebug]
  }
}

