package typings.pino

import org.scalablytyped.runtime.StringDictionary
import typings.pino.pinoMod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends /* logLevel */ StringDictionary[WriteFn] {
  var debug: js.UndefOr[WriteFn] = js.undefined
  var error: js.UndefOr[WriteFn] = js.undefined
  var fatal: js.UndefOr[WriteFn] = js.undefined
  var info: js.UndefOr[WriteFn] = js.undefined
  var trace: js.UndefOr[WriteFn] = js.undefined
  var warn: js.UndefOr[WriteFn] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    StringDictionary: /* logLevel */ StringDictionary[WriteFn] = null,
    debug: WriteFn = null,
    error: WriteFn = null,
    fatal: WriteFn = null,
    info: WriteFn = null,
    trace: WriteFn = null,
    warn: WriteFn = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fatal != null) __obj.updateDynamic("fatal")(fatal)
    if (info != null) __obj.updateDynamic("info")(info)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Debug]
  }
}

