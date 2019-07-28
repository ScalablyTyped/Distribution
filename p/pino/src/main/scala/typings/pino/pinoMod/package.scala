package typings.pino

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJSNs.WritableStream
import typings.node.streamMod.Duplex
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoMod {
  type DestinationStream = Writable | Duplex | Transform | WritableStream | typings.sonicDashBoom.sonicDashBoomMod.^ 
  type LevelChangeEventListener = js.Function4[
    /* lvl */ LevelWithSilent | String, 
    /* val */ Double, 
    /* prevLvl */ LevelWithSilent | String, 
    /* prevVal */ Double, 
    Unit
  ]
  type Logger = BaseLogger with StringDictionary[LogFn]
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[String]
  type WriteFn = js.Function1[/* o */ js.Object, Unit]
}
