package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug
  extends /* logLevel */ org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.WriteFn] {
  var debug: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
  var error: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
  var fatal: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
  var info: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
  var trace: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
  var warn: js.UndefOr[pinoLib.pinoMod.WriteFn] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    StringDictionary: /* logLevel */ org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.WriteFn] = null,
    debug: pinoLib.pinoMod.WriteFn = null,
    error: pinoLib.pinoMod.WriteFn = null,
    fatal: pinoLib.pinoMod.WriteFn = null,
    info: pinoLib.pinoMod.WriteFn = null,
    trace: pinoLib.pinoMod.WriteFn = null,
    warn: pinoLib.pinoMod.WriteFn = null
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

