package typings.pino.mod.pino

import typings.node.NodeJS.WritableStream
import typings.pino.anon.needsMetadataGsymfalseund
import typings.pino.mod.CustomLevelLogger
import typings.pino.mod.LoggerExtras
import typings.pino.mod.ThreadStream
import typings.pino.mod.pino.^
import typings.sonicBoom.mod.SonicBoom
import typings.sonicBoom.mod.SonicBoomOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


//// Callable default export
/**
  * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
  * relative protocol is enabled. Default: process.stdout
  * @returns a new logger instance.
  */
inline def apply[Options /* <: LoggerOptions | DestinationStream */](): Logger[Options] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Logger[Options]]
/**
  * @param [options]: an options object
  * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
  * relative protocol is enabled. Default: process.stdout
  * @returns a new logger instance.
  */
inline def apply[Options /* <: LoggerOptions */](options: Options, stream: DestinationStream): Logger[Options] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Logger[Options]]
inline def apply[Options /* <: LoggerOptions | DestinationStream */](optionsOrStream: Options): Logger[Options] = ^.asInstanceOf[js.Dynamic].apply(optionsOrStream.asInstanceOf[js.Any]).asInstanceOf[Logger[Options]]

inline def destination(): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")().asInstanceOf[SonicBoom]
inline def destination(dest: String): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
inline def destination(dest: Double): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
inline def destination(dest: WritableStream): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
inline def destination(dest: DestinationStream): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
inline def destination(dest: SonicBoomOpts): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]

inline def levels: LevelMapping = ^.asInstanceOf[js.Dynamic].selectDynamic("levels").asInstanceOf[LevelMapping]

inline def multistream(streamsArray: js.Array[DestinationStream | StreamEntry]): MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[MultiStreamRes]
inline def multistream(streamsArray: js.Array[DestinationStream | StreamEntry], opts: MultiStreamOptions): MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MultiStreamRes]
inline def multistream(streamsArray: DestinationStream): MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[MultiStreamRes]
inline def multistream(streamsArray: DestinationStream, opts: MultiStreamOptions): MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MultiStreamRes]
inline def multistream(streamsArray: StreamEntry): MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[MultiStreamRes]
inline def multistream(streamsArray: StreamEntry, opts: MultiStreamOptions): MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MultiStreamRes]

inline def transport[TransportOptions](options: TransportMultiOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: TransportPipelineOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: TransportSingleOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

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
