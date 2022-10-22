package typings.pino.mod.pino

import typings.pino.anon.needsMetadataGsymfalseund
import typings.pino.mod.CustomLevelLogger
import typings.pino.mod.LoggerExtras
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Bindings = Record[String, Any]

type DestinationStreamWithMetadata = needsMetadataGsymfalseund | (DestinationStreamHasMetadata & DestinationStream)

type LevelChangeEventListener[Options] = js.Function5[
/* lvl */ LevelWithSilent | String, 
/* val */ Double, 
/* prevLvl */ LevelWithSilent | String, 
/* prevVal */ Double, 
/* logger */ Logger[Options], 
Unit]

type LogDescriptor = Record[String, Any]

type Logger[Options] = BaseLogger & LoggerExtras[Options] & CustomLevelLogger[Options]

type SerializedError = typings.pinoStdSerializers.mod.SerializedError

type SerializedRequest = typings.pinoStdSerializers.mod.SerializedRequest

type SerializedResponse = typings.pinoStdSerializers.mod.SerializedResponse

type SerializerFn = js.Function1[/* value */ Any, Any]

type WriteFn = js.Function1[/* o */ js.Object, Unit]
