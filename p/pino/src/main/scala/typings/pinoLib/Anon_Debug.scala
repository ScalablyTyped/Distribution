package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug
  extends /* logLevel */ org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.PNs.WriteFn] {
  var debug: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
  var error: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
  var fatal: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
  var info: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
  var trace: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
  var warn: js.UndefOr[pinoLib.pinoMod.PNs.WriteFn] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    StringDictionary: /* logLevel */ org.scalablytyped.runtime.StringDictionary[pinoLib.pinoMod.PNs.WriteFn] = null,
    debug: pinoLib.pinoMod.PNs.WriteFn = null,
    error: pinoLib.pinoMod.PNs.WriteFn = null,
    fatal: pinoLib.pinoMod.PNs.WriteFn = null,
    info: pinoLib.pinoMod.PNs.WriteFn = null,
    trace: pinoLib.pinoMod.PNs.WriteFn = null,
    warn: pinoLib.pinoMod.PNs.WriteFn = null
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

