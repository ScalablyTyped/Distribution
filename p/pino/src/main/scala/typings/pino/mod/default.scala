package typings.pino.mod

import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.pinoStdSerializers.mod.CustomErrorSerializer
import typings.pinoStdSerializers.mod.CustomRequestSerializer
import typings.pinoStdSerializers.mod.CustomResponseSerializer
import typings.sonicBoom.mod.SonicBoom
import typings.sonicBoom.mod.SonicBoomOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  //// Callable default export
  /**
    * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  inline def apply[Options /* <: typings.pino.mod.pino.LoggerOptions | typings.pino.mod.pino.DestinationStream */](): typings.pino.mod.pino.Logger[Options] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.pino.mod.pino.Logger[Options]]
  /**
    * @param [options]: an options object
    * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  inline def apply[Options /* <: typings.pino.mod.pino.LoggerOptions */](options: Options, stream: typings.pino.mod.pino.DestinationStream): typings.pino.mod.pino.Logger[Options] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[typings.pino.mod.pino.Logger[Options]]
  inline def apply[Options /* <: typings.pino.mod.pino.LoggerOptions | typings.pino.mod.pino.DestinationStream */](optionsOrStream: Options): typings.pino.mod.pino.Logger[Options] = ^.asInstanceOf[js.Dynamic].apply(optionsOrStream.asInstanceOf[js.Any]).asInstanceOf[typings.pino.mod.pino.Logger[Options]]
  
  @JSImport("pino", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  inline def destination(): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")().asInstanceOf[SonicBoom]
  inline def destination(dest: String): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
  inline def destination(dest: Double): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
  inline def destination(dest: WritableStream): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
  inline def destination(dest: typings.pino.mod.pino.DestinationStream): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
  inline def destination(dest: SonicBoomOpts): SonicBoom = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[SonicBoom]
  
  @JSImport("pino", "default.levels")
  @js.native
  val levels: typings.pino.mod.pino.LevelMapping = js.native
  
  inline def multistream(
    streamsArray: js.Array[typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry]
  ): typings.pino.mod.pino.MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  inline def multistream(
    streamsArray: js.Array[typings.pino.mod.pino.DestinationStream | typings.pino.mod.pino.StreamEntry],
    opts: typings.pino.mod.pino.MultiStreamOptions
  ): typings.pino.mod.pino.MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  inline def multistream(streamsArray: typings.pino.mod.pino.DestinationStream): typings.pino.mod.pino.MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  inline def multistream(
    streamsArray: typings.pino.mod.pino.DestinationStream,
    opts: typings.pino.mod.pino.MultiStreamOptions
  ): typings.pino.mod.pino.MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  inline def multistream(streamsArray: typings.pino.mod.pino.StreamEntry): typings.pino.mod.pino.MultiStreamRes = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any]).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  inline def multistream(streamsArray: typings.pino.mod.pino.StreamEntry, opts: typings.pino.mod.pino.MultiStreamOptions): typings.pino.mod.pino.MultiStreamRes = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streamsArray.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pino.mod.pino.MultiStreamRes]
  
  object stdSerializers {
    
    @JSImport("pino", "default.stdSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def err(err: js.Error): typings.pinoStdSerializers.mod.SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(err.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedError]
    
    inline def errWithCause(err: js.Error): typings.pinoStdSerializers.mod.SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("errWithCause")(err.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedError]
    
    inline def mapHttpRequest(req: IncomingMessage): Req = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Req]
    
    inline def mapHttpResponse(res: ServerResponse[IncomingMessage]): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Res]
    
    inline def req(req: IncomingMessage): typings.pinoStdSerializers.mod.SerializedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(req.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedRequest]
    
    inline def res(res: ServerResponse[IncomingMessage]): typings.pinoStdSerializers.mod.SerializedResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(res.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedResponse]
    
    inline def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ js.Error, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapErrorSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ js.Error, Record[String, Any]]]
    
    inline def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequestSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* req */ IncomingMessage, Record[String, Any]]]
    
    inline def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapResponseSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]]]
  }
  
  object stdTimeFunctions {
    
    @JSImport("pino", "default.stdTimeFunctions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default time function for Pino. Returns a string like `,"time":1493426328206`.
      */
    inline def epochTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[String]
    /**
      * The default time function for Pino. Returns a string like `,"time":1493426328206`.
      */
    @JSImport("pino", "default.stdTimeFunctions.epochTime")
    @js.native
    def epochTime_FstdTimeFunctions: TimeFn = js.native
    
    inline def epochTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epochTime")(x.asInstanceOf[js.Any])
    
    /*
      * Returns ISO 8601-formatted time in UTC
      */
    inline def isoTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isoTime")().asInstanceOf[String]
    /*
      * Returns ISO 8601-formatted time in UTC
      */
    @JSImport("pino", "default.stdTimeFunctions.isoTime")
    @js.native
    def isoTime_FstdTimeFunctions: TimeFn = js.native
    
    inline def isoTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isoTime")(x.asInstanceOf[js.Any])
    
    /**
      * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
      */
    inline def nullTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullTime")().asInstanceOf[String]
    /**
      * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
      */
    @JSImport("pino", "default.stdTimeFunctions.nullTime")
    @js.native
    def nullTime_FstdTimeFunctions: TimeFn = js.native
    
    inline def nullTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullTime")(x.asInstanceOf[js.Any])
    
    /*
      * Returns the seconds since Unix epoch
      */
    inline def unixTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unixTime")().asInstanceOf[String]
    /*
      * Returns the seconds since Unix epoch
      */
    @JSImport("pino", "default.stdTimeFunctions.unixTime")
    @js.native
    def unixTime_FstdTimeFunctions: TimeFn = js.native
    
    inline def unixTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unixTime")(x.asInstanceOf[js.Any])
  }
  
  object symbols {
    
    @JSImport("pino", "default.symbols.asJsonSym")
    @js.native
    val asJsonSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.chindingsSym")
    @js.native
    val chindingsSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.endSym")
    @js.native
    val endSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.errorKeySym")
    @js.native
    val errorKeySym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.formatOptsSym")
    @js.native
    val formatOptsSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.formattersSym")
    @js.native
    val formattersSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.getLevelSym")
    @js.native
    val getLevelSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.hooksSym")
    @js.native
    val hooksSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.levelValSym")
    @js.native
    val levelValSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.lsCacheSym")
    @js.native
    val lsCacheSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.messageKeySym")
    @js.native
    val messageKeySym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.mixinSym")
    @js.native
    val mixinSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.needsMetadataGsym")
    @js.native
    val needsMetadataGsym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.nestedKeySym")
    @js.native
    val nestedKeySym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.parsedChindingsSym")
    @js.native
    val parsedChindingsSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.redactFmtSym")
    @js.native
    val redactFmtSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.serializersSym")
    @js.native
    val serializersSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.setLevelSym")
    @js.native
    val setLevelSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.streamSym")
    @js.native
    val streamSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.stringifiersSym")
    @js.native
    val stringifiersSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.stringifySafeSym")
    @js.native
    val stringifySafeSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.stringifySym")
    @js.native
    val stringifySym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.timeSliceIndexSym")
    @js.native
    val timeSliceIndexSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.timeSym")
    @js.native
    val timeSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.useLevelLabelsSym")
    @js.native
    val useLevelLabelsSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.useOnlyCustomLevelsSym")
    @js.native
    val useOnlyCustomLevelsSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.wildcardFirstSym")
    @js.native
    val wildcardFirstSym: js.Symbol = js.native
    
    @JSImport("pino", "default.symbols.writeSym")
    @js.native
    val writeSym: js.Symbol = js.native
  }
  
  inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportMultiOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
  inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportPipelineOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
  inline def transport[TransportOptions](options: typings.pino.mod.pino.TransportSingleOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
  
  @JSImport("pino", "default.version")
  @js.native
  val version: String = js.native
}
