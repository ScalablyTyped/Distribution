package typings.pino.mod

import typings.node.NodeJS.WritableStream
import typings.pino.mod.^
import typings.sonicBoom.mod.SonicBoom
import typings.sonicBoom.mod.SonicBoomOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def destination: js.Function1[
/* dest */ js.UndefOr[
  String | Double | SonicBoomOpts | typings.pino.mod.pino.DestinationStream | WritableStream
], 
SonicBoom] = ^.asInstanceOf[js.Dynamic].selectDynamic("destination").asInstanceOf[js.Function1[
/* dest */ js.UndefOr[
  String | Double | SonicBoomOpts | typings.pino.mod.pino.DestinationStream | WritableStream
], 
SonicBoom]]

inline def levels: typings.pino.mod.pino.LevelMapping = ^.asInstanceOf[js.Dynamic].selectDynamic("levels").asInstanceOf[typings.pino.mod.pino.LevelMapping]

inline def multistream: js.Function2[
/* streamsArray */ (js.Array[typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry]) | typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry, 
/* opts */ js.UndefOr[typings.pino.mod.pino.MultiStreamOptions], 
typings.pino.mod.pino.MultiStreamRes] = ^.asInstanceOf[js.Dynamic].selectDynamic("multistream").asInstanceOf[js.Function2[
/* streamsArray */ (js.Array[typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry]) | typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry, 
/* opts */ js.UndefOr[typings.pino.mod.pino.MultiStreamOptions], 
typings.pino.mod.pino.MultiStreamRes]]

inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportMultiOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportPipelineOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportSingleOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type BaseLogger = typings.pino.mod.pino.BaseLogger

type Bindings = typings.pino.mod.pino.Bindings

type ChildLoggerOptions = typings.pino.mod.pino.ChildLoggerOptions

type DestinationStream = typings.pino.mod.pino.DestinationStream

type DestinationStreamWithMetadata = typings.pino.mod.pino.DestinationStreamWithMetadata

type Level = typings.pino.mod.pino.Level

type LevelChangeEventListener = typings.pino.mod.pino.LevelChangeEventListener[typings.pino.mod.pino.LoggerOptions]

type LevelMapping = typings.pino.mod.pino.LevelMapping

type LevelWithSilent = typings.pino.mod.pino.LevelWithSilent

type LogDescriptor = typings.pino.mod.pino.LogDescriptor

type LogEvent = typings.pino.mod.pino.LogEvent

type LogFn = typings.pino.mod.pino.LogFn

type Logger[Options] = typings.pino.mod.pino.Logger[Options]

type LoggerOptions = typings.pino.mod.pino.LoggerOptions

type MixinFn = js.Function2[/* mergeObject */ js.Object, /* level */ Double, js.Object]

type MixinMergeStrategyFn = js.Function2[/* mergeObject */ js.Object, /* mixinObject */ js.Object, js.Object]

type MultiStreamOptions = typings.pino.mod.pino.MultiStreamOptions

type MultiStreamRes = typings.pino.mod.pino.MultiStreamRes

/**
* A synchronous callback that will run on each creation of a new child.
* @param child: The newly created child logger instance.
*/
type OnChildCallback[Options] = js.Function1[
/* child */ typings.pino.mod.pino.Logger[Options & typings.pino.mod.pino.ChildLoggerOptions], 
Unit]

type SerializedError = typings.pino.mod.pino.SerializedError

type SerializedRequest = typings.pino.mod.pino.SerializedRequest

type SerializedResponse = typings.pino.mod.pino.SerializedResponse

type SerializerFn = typings.pino.mod.pino.SerializerFn

type StreamEntry = typings.pino.mod.pino.StreamEntry

//// Non-exported types and interfaces
// ToDo https://github.com/pinojs/thread-stream/issues/24
type ThreadStream = Any

type TimeFn = js.Function0[String]

type TransportBaseOptions = typings.pino.mod.pino.TransportBaseOptions[Record[String, Any]]

type TransportMultiOptions = typings.pino.mod.pino.TransportMultiOptions[Record[String, Any]]

type TransportPipelineOptions = typings.pino.mod.pino.TransportPipelineOptions[Record[String, Any]]

type TransportSingleOptions = typings.pino.mod.pino.TransportSingleOptions[Record[String, Any]]

type TransportTargetOptions = typings.pino.mod.pino.TransportTargetOptions[Record[String, Any]]

type WriteFn = typings.pino.mod.pino.WriteFn
