package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoMod {
  type DestinationStream = nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform | nodeLib.NodeJSNs.WritableStream | sonicDashBoomLib.sonicDashBoomMod.^ 
  type LevelChangeEventListener = js.Function4[
    /* lvl */ LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  type Logger = BaseLogger with org.scalablytyped.runtime.StringDictionary[LogFn]
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[java.lang.String]
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
