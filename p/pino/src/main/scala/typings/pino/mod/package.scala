package typings.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LevelChangeEventListener = js.Function4[
    /* lvl */ typings.pino.mod.LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ typings.pino.mod.LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Describes a log line.
    */
  type LogDescriptor = typings.std.Record[java.lang.String, js.Any]
  
  type MixinFn = js.Function0[js.Object]
  
  type SerializedError = typings.pinoStdSerializers.mod.SerializedError
  
  type SerializedRequest = typings.pinoStdSerializers.mod.SerializedRequest
  
  type SerializedResponse = typings.pinoStdSerializers.mod.SerializedResponse
  
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  
  type TimeFn = js.Function0[java.lang.String]
  
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
