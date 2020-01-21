package typings.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LevelChangeEventListener = js.Function4[
    /* lvl */ typings.pino.mod.LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ typings.pino.mod.LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  type Logger = typings.pino.mod.BaseLogger with org.scalablytyped.runtime.StringDictionary[typings.pino.mod.LogFn]
  type MixinFn = js.Function0[js.Object]
  type SerializedError = typings.pinoStdSerializers.mod.SerializedError
  type SerializedRequest = typings.pinoStdSerializers.mod.SerializedRequest
  type SerializedResponse = typings.pinoStdSerializers.mod.SerializedResponse
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[java.lang.String]
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
