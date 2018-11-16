package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PNs {
  type Level = pinoLib.pinoLibStrings.fatal | pinoLib.pinoLibStrings.error | pinoLib.pinoLibStrings.warn | pinoLib.pinoLibStrings.info | pinoLib.pinoLibStrings.debug | pinoLib.pinoLibStrings.trace
  type LevelChangeEventListener = js.Function4[
    /* lvl */ LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  type LevelWithSilent = Level | pinoLib.pinoLibStrings.silent
  type Logger = BaseLogger with ScalablyTyped.runtime.StringDictionary[LogFn]
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[java.lang.String]
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
