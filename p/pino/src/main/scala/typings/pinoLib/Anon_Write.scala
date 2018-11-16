package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Write extends js.Object {
  /**
               * This option will create a pino-like log object instead of passing all arguments to a console method.
               * When `write` is set, `asObject` will always be `true`.
               */
  var asObject: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Instead of passing log messages to console.log they can be passed to a supplied function. If `write` is
               * set to a single function, all logging objects are passed to this function. If write is an object, it can
               * have methods that correspond to the levels. When a message is logged at a given level, the corresponding
               * method is called. If a method isn't present, the logging falls back to using the `console`.
               */
  var write: js.UndefOr[
    pinoLib.pinoMod.PNs.WriteFn | (Anon_Trace with ScalablyTyped.runtime.StringDictionary[pinoLib.pinoMod.PNs.WriteFn])
  ] = js.undefined
}

