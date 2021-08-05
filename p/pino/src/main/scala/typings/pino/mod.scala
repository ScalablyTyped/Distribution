package typings.pino

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pino.anon.AsObject
import typings.pino.anon.Label
import typings.pino.anon.LogMethod
import typings.pino.pinoBooleans.`false`
import typings.pino.pinoStrings.`level-change`
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.pinoStdSerializers.mod.CustomErrorSerializer
import typings.pinoStdSerializers.mod.CustomRequestSerializer
import typings.pinoStdSerializers.mod.CustomResponseSerializer
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param [optionsOrStream]: an options object or a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  inline def apply(): Logger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Logger]
  inline def apply(optionsOrStream: DestinationStream): Logger = ^.asInstanceOf[js.Dynamic].apply(optionsOrStream.asInstanceOf[js.Any]).asInstanceOf[Logger]
  inline def apply(optionsOrStream: LoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].apply(optionsOrStream.asInstanceOf[js.Any]).asInstanceOf[Logger]
  /**
    * @param [options]: an options object
    * @param [stream]: a writable stream where the logs will be written. It can also receive some log-line metadata, if the
    * relative protocol is enabled. Default: process.stdout
    * @returns a new logger instance.
    */
  inline def apply(options: LoggerOptions, stream: DestinationStream): Logger = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  @JSImport("pino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Holds the current log format version (as output in the v property of each log record).
    */
  @JSImport("pino", "LOG_VERSION")
  @js.native
  val LOG_VERSION: Double = js.native
  
  /**
    * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
    * @param [dest]: The `destination` parameter, at a minimum must be an object with a `write` method. An ordinary Node.js
    *                `stream` can be passed as the destination (such as the result of `fs.createWriteStream`) but for peak log
    *                writing performance it is strongly recommended to use `pino.destination` to create the destination stream.
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  inline def destination(): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")().asInstanceOf[typings.sonicBoom.mod.^]
  inline def destination(dest: String): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  inline def destination(dest: Double): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  inline def destination(dest: WritableStream): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  inline def destination(dest: DestinationObjectOptions): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  inline def destination(dest: DestinationStream): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("destination")(dest.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  
  /**
    * Create an extreme mode destination. This yields an additional 60% performance boost.
    * There are trade-offs that should be understood before usage.
    * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  inline def extreme(): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("extreme")().asInstanceOf[typings.sonicBoom.mod.^]
  inline def extreme(fileDescriptor: String): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("extreme")(fileDescriptor.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  inline def extreme(fileDescriptor: Double): typings.sonicBoom.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("extreme")(fileDescriptor.asInstanceOf[js.Any]).asInstanceOf[typings.sonicBoom.mod.^]
  
  /**
    * The pino.final method can be used to acquire a final logger instance that synchronously flushes on every write.
    * @param [logger]: pino logger that serves as reference for the final logger
    * @returns Final, synchronous logger
    */
  inline def `final`(logger: Logger): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("final")(logger.asInstanceOf[js.Any]).asInstanceOf[Logger]
  /**
    * The pino.final method can be used to create an exit listener function.
    * This listener function can be supplied to process exit events.
    * The exit listener function will call the handler with
    * @param [logger]: pino logger that serves as reference for the final logger
    * @param [handler]: Function that will be called by the handler returned from this function
    * @returns Exit listener function that can be supplied to process exit events and will call the supplied handler function
    */
  inline def `final`(
    logger: Logger,
    handler: js.Function3[/* error */ Error, /* finalLogger */ Logger, /* repeated */ js.Any, Unit]
  ): js.Function2[/* error */ Error | Null, /* repeated */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("final")(logger.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* error */ Error | Null, /* repeated */ js.Any, Unit]]
  
  @JSImport("pino", "levels")
  @js.native
  val levels: LevelMapping = js.native
  
  /**
    * Provides functions for serializing objects common to many projects.
    */
  object stdSerializers {
    
    @JSImport("pino", "stdSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes an Error object.
      */
    @JSImport("pino", "stdSerializers.err")
    @js.native
    def err: js.Function1[/* err */ Error, typings.pinoStdSerializers.mod.SerializedError] = js.native
    /**
      * Serializes an Error object.
      */
    inline def err(err: Error): typings.pinoStdSerializers.mod.SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(err.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedError]
    inline def err_=(x: js.Function1[/* err */ Error, typings.pinoStdSerializers.mod.SerializedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("err")(x.asInstanceOf[js.Any])
    
    /**
      * Returns an object:
      * ```
      * {
      *   req: {}
      * }
      * ```
      * where req is the request as serialized by the standard request serializer.
      * @param req The request to serialize
      * @return An object
      */
    @JSImport("pino", "stdSerializers.mapHttpRequest")
    @js.native
    def mapHttpRequest: js.Function1[/* req */ IncomingMessage, Req] = js.native
    /**
      * Returns an object:
      * ```
      * {
      *   req: {}
      * }
      * ```
      * where req is the request as serialized by the standard request serializer.
      * @param req The request to serialize
      * @return An object
      */
    inline def mapHttpRequest(req: IncomingMessage): Req = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Req]
    inline def mapHttpRequest_=(x: js.Function1[/* req */ IncomingMessage, Req]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapHttpRequest")(x.asInstanceOf[js.Any])
    
    /**
      * Returns an object:
      * ```
      * {
      *   res: {}
      * }
      * ```
      * where res is the response as serialized by the standard response serializer.
      * @param res The response to serialize.
      * @return An object.
      */
    @JSImport("pino", "stdSerializers.mapHttpResponse")
    @js.native
    def mapHttpResponse: js.Function1[/* res */ ServerResponse, Res] = js.native
    /**
      * Returns an object:
      * ```
      * {
      *   res: {}
      * }
      * ```
      * where res is the response as serialized by the standard response serializer.
      * @param res The response to serialize.
      * @return An object.
      */
    inline def mapHttpResponse(res: ServerResponse): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Res]
    inline def mapHttpResponse_=(x: js.Function1[/* res */ ServerResponse, Res]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapHttpResponse")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino", "stdSerializers.req")
    @js.native
    def req: js.Function1[/* req */ IncomingMessage, typings.pinoStdSerializers.mod.SerializedRequest] = js.native
    /**
      * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
      */
    inline def req(req: IncomingMessage): typings.pinoStdSerializers.mod.SerializedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(req.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedRequest]
    inline def req_=(x: js.Function1[/* req */ IncomingMessage, typings.pinoStdSerializers.mod.SerializedRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("req")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino", "stdSerializers.res")
    @js.native
    def res: js.Function1[/* res */ ServerResponse, typings.pinoStdSerializers.mod.SerializedResponse] = js.native
    /**
      * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
      */
    inline def res(res: ServerResponse): typings.pinoStdSerializers.mod.SerializedResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(res.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedResponse]
    inline def res_=(x: js.Function1[/* res */ ServerResponse, typings.pinoStdSerializers.mod.SerializedResponse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("res")(x.asInstanceOf[js.Any])
    
    /**
      * A utility method for wrapping the default error serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom error serializer. Accepts a single parameter: the newly serialized
      * error object. Returns the new (or updated) error object.
      * @return A new error serializer.
      */
    @JSImport("pino", "stdSerializers.wrapErrorSerializer")
    @js.native
    def wrapErrorSerializer: js.Function1[
        /* customSerializer */ CustomErrorSerializer, 
        js.Function1[/* err */ Error, Record[String, js.Any]]
      ] = js.native
    /**
      * A utility method for wrapping the default error serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom error serializer. Accepts a single parameter: the newly serialized
      * error object. Returns the new (or updated) error object.
      * @return A new error serializer.
      */
    inline def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapErrorSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ Error, Record[String, js.Any]]]
    inline def wrapErrorSerializer_=(
      x: js.Function1[
          /* customSerializer */ CustomErrorSerializer, 
          js.Function1[/* err */ Error, Record[String, js.Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapErrorSerializer")(x.asInstanceOf[js.Any])
    
    /**
      * A utility method for wrapping the default request serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom request serializer. Accepts a single parameter: the newly serialized
      * request object. Returns the new (or updated) request object.
      * @return A new error serializer.
      */
    @JSImport("pino", "stdSerializers.wrapRequestSerializer")
    @js.native
    def wrapRequestSerializer: js.Function1[
        /* customSerializer */ CustomRequestSerializer, 
        js.Function1[/* req */ IncomingMessage, Record[String, js.Any]]
      ] = js.native
    /**
      * A utility method for wrapping the default request serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom request serializer. Accepts a single parameter: the newly serialized
      * request object. Returns the new (or updated) request object.
      * @return A new error serializer.
      */
    inline def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequestSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* req */ IncomingMessage, Record[String, js.Any]]]
    inline def wrapRequestSerializer_=(
      x: js.Function1[
          /* customSerializer */ CustomRequestSerializer, 
          js.Function1[/* req */ IncomingMessage, Record[String, js.Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapRequestSerializer")(x.asInstanceOf[js.Any])
    
    /**
      * A utility method for wrapping the default response serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom response serializer. Accepts a single parameter: the newly serialized
      * response object. Returns the new (or updated) response object.
      * @return A new error serializer.
      */
    @JSImport("pino", "stdSerializers.wrapResponseSerializer")
    @js.native
    def wrapResponseSerializer: js.Function1[
        /* customSerializer */ CustomResponseSerializer, 
        js.Function1[/* res */ ServerResponse, Record[String, js.Any]]
      ] = js.native
    /**
      * A utility method for wrapping the default response serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom response serializer. Accepts a single parameter: the newly serialized
      * response object. Returns the new (or updated) response object.
      * @return A new error serializer.
      */
    inline def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapResponseSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* res */ ServerResponse, Record[String, js.Any]]]
    inline def wrapResponseSerializer_=(
      x: js.Function1[
          /* customSerializer */ CustomResponseSerializer, 
          js.Function1[/* res */ ServerResponse, Record[String, js.Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapResponseSerializer")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Provides functions for generating the timestamp property in the log output. You can set the `timestamp` option during
    * initialization to one of these functions to adjust the output format. Alternatively, you can specify your own time function.
    * A time function must synchronously return a string that would be a valid component of a JSON string. For example,
    * the default function returns a string like `,"time":1493426328206`.
    */
  object stdTimeFunctions {
    
    @JSImport("pino", "stdTimeFunctions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default time function for Pino. Returns a string like `,"time":1493426328206`.
      */
    inline def epochTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[String]
    /**
      * The default time function for Pino. Returns a string like `,"time":1493426328206`.
      */
    @JSImport("pino", "stdTimeFunctions.epochTime")
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
    @JSImport("pino", "stdTimeFunctions.isoTime")
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
    @JSImport("pino", "stdTimeFunctions.nullTime")
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
    @JSImport("pino", "stdTimeFunctions.unixTime")
    @js.native
    def unixTime_FstdTimeFunctions: TimeFn = js.native
    
    inline def unixTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unixTime")(x.asInstanceOf[js.Any])
  }
  
  object symbols {
    
    @JSImport("pino", "symbols.asJsonSym")
    @js.native
    val asJsonSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.chindingsSym")
    @js.native
    val chindingsSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.endSym")
    @js.native
    val endSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.formatOptsSym")
    @js.native
    val formatOptsSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.formattersSym")
    @js.native
    val formattersSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.getLevelSym")
    @js.native
    val getLevelSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.hooksSym")
    @js.native
    val hooksSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.levelValSym")
    @js.native
    val levelValSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.lsCacheSym")
    @js.native
    val lsCacheSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.messageKeySym")
    @js.native
    val messageKeySym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.mixinSym")
    @js.native
    val mixinSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.needsMetadataGsym")
    @js.native
    val needsMetadataGsym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.nestedKeySym")
    @js.native
    val nestedKeySym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.parsedChindingsSym")
    @js.native
    val parsedChindingsSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.redactFmtSym")
    @js.native
    val redactFmtSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.serializersSym")
    @js.native
    val serializersSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.setLevelSym")
    @js.native
    val setLevelSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.streamSym")
    @js.native
    val streamSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.stringifiersSym")
    @js.native
    val stringifiersSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.stringifySym")
    @js.native
    val stringifySym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.timeSliceIndexSym")
    @js.native
    val timeSliceIndexSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.timeSym")
    @js.native
    val timeSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.useLevelLabelsSym")
    @js.native
    val useLevelLabelsSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.useOnlyCustomLevelsSym")
    @js.native
    val useOnlyCustomLevelsSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.wildcardFirstSym")
    @js.native
    val wildcardFirstSym: js.Symbol = js.native
    
    @JSImport("pino", "symbols.writeSym")
    @js.native
    val writeSym: js.Symbol = js.native
  }
  
  /**
    * Exposes the Pino package version. Also available on the logger instance.
    */
  @JSImport("pino", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait BaseLogger extends EventEmitter {
    
    /**
      * Holds the current log format version (as output in the v property of each log record).
      */
    val LOG_VERSION: Double = js.native
    
    @JSName("addListener")
    def addListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    /**
      * Returns an object containing all the current bindings, cloned from the ones passed in via logger.child().
      */
    def bindings(): Bindings = js.native
    
    /**
      * Creates a child logger, setting all key-value pairs in `bindings` as properties in the log lines. All serializers will be applied to the given pair.
      * Child loggers use the same output stream as the parent and inherit the current log level of the parent at the time they are spawned.
      * From v2.x.x the log level of a child is mutable (whereas in v1.x.x it was immutable), and can be set independently of the parent.
      * If a `level` property is present in the object passed to `child` it will override the child logger level.
      *
      * @param bindings: an object of key-value pairs to include in log lines as properties.
      * @returns a child logger instance.
      */
    def child(bindings: Bindings): Logger = js.native
    
    /**
      * Define additional logging levels.
      */
    var customLevels: StringDictionary[Double] = js.native
    
    /**
      * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def debug(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def debug[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def debug[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'debug'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("debug")
    var debug_Original: LogFn = js.native
    
    /**
      * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def error(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def error[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def error[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'error'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("error")
    var error_Original: LogFn = js.native
    
    /**
      * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def fatal(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def fatal[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def fatal[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'fatal'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("fatal")
    var fatal_Original: LogFn = js.native
    
    /**
      * Flushes the content of the buffer in extreme mode. It has no effect if extreme mode is not enabled.
      */
    def flush(): Unit = js.native
    
    /**
      * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def info(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def info[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def info[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'info'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("info")
    var info_Original: LogFn = js.native
    
    def isLevelEnabled(level: String): Boolean = js.native
    /**
      * A utility method for determining if a given log level will write to the destination.
      */
    def isLevelEnabled(level: LevelWithSilent): Boolean = js.native
    
    /**
      * Set this property to the desired logging level. In order of priority, available levels are:
      *
      * - 'fatal'
      * - 'error'
      * - 'warn'
      * - 'info'
      * - 'debug'
      * - 'trace'
      *
      * The logging level is a __minimum__ level. For instance if `logger.level` is `'info'` then all `'fatal'`, `'error'`, `'warn'`,
      * and `'info'` logs will be enabled.
      *
      * You can pass `'silent'` to disable logging.
      */
    var level: LevelWithSilent | String = js.native
    
    /**
      * Returns the integer value for the logger instance's logging level.
      */
    var levelVal: Double = js.native
    
    var levels: LevelMapping = js.native
    
    /**
      * Registers a listener function that is triggered when the level is changed.
      * Note: When browserified, this functionality will only be available if the `events` module has been required elsewhere
      * (e.g. if you're using streams in the browser). This allows for a trade-off between bundle size and functionality.
      *
      * @param event: only ever fires the `'level-change'` event
      * @param listener: The listener is passed four arguments: `levelLabel`, `levelValue`, `previousLevelLabel`, `previousLevelValue`.
      */
    @JSName("on")
    def on_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    @JSName("once")
    def once_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    /**
      * Exposes the current version of Pino.
      */
    val pino: String = js.native
    
    @JSName("prependListener")
    def prependListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_levelchange(event: `level-change`, listener: LevelChangeEventListener): this.type = js.native
    
    /**
      * Noop function.
      */
    def silent(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Noop function.
      */
    def silent[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def silent[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Noop function.
      */
    @JSName("silent")
    var silent_Original: LogFn = js.native
    
    /**
      * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def trace(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def trace[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def trace[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'trace'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("trace")
    var trace_Original: LogFn = js.native
    
    /**
      * Outputs the level as a string instead of integer.
      */
    var useLevelLabels: Boolean = js.native
    
    /**
      * Use only defined `customLevels` and omit Pino's levels.
      */
    var useOnlyCustomLevels: Boolean = js.native
    
    /**
      * Exposes the Pino package version. Also available on the exported pino function.
      */
    val version: String = js.native
    
    /**
      * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def warn(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    /**
      * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    def warn[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def warn[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
    /**
      * Log at `'warn'` level the given msg. If the first argument is an object, all its properties will be included in the JSON line.
      * If more args follows `msg`, these will be used to format `msg` using `util.format`.
      *
      * @typeParam T: the interface of the object being serialized. Default is object.
      * @param obj: object to be serialized
      * @param msg: the log message to write
      * @param ...args: format string values when `msg` is a format string
      */
    @JSName("warn")
    var warn_Original: LogFn = js.native
  }
  
  // TODO replace `any` with `unknown` when TypeScript version >= 3.0
  trait Bindings
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var level: js.UndefOr[Level | String] = js.undefined
    
    var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
  }
  object Bindings {
    
    inline def apply(): Bindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bindings]
    }
    
    extension [Self <: Bindings](x: Self) {
      
      inline def setLevel(value: Level | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
    }
  }
  
  /**
    * Equivalent of SonicBoom constructor options object
    */
  // TODO: use SonicBoom constructor options interface when available
  trait DestinationObjectOptions extends StObject {
    
    var dest: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[String | Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object DestinationObjectOptions {
    
    inline def apply(): DestinationObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestinationObjectOptions]
    }
    
    extension [Self <: DestinationObjectOptions](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setFd(value: String | Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  trait DestinationStream extends StObject {
    
    def write(msg: String): Unit
  }
  object DestinationStream {
    
    inline def apply(write: String => Unit): DestinationStream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[DestinationStream]
    }
    
    extension [Self <: DestinationStream](x: Self) {
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pino.pinoStrings.fatal
    - typings.pino.pinoStrings.error
    - typings.pino.pinoStrings.warn
    - typings.pino.pinoStrings.info
    - typings.pino.pinoStrings.debug
    - typings.pino.pinoStrings.trace
  */
  trait Level extends StObject
  object Level {
    
    inline def debug: typings.pino.pinoStrings.debug = "debug".asInstanceOf[typings.pino.pinoStrings.debug]
    
    inline def error: typings.pino.pinoStrings.error = "error".asInstanceOf[typings.pino.pinoStrings.error]
    
    inline def fatal: typings.pino.pinoStrings.fatal = "fatal".asInstanceOf[typings.pino.pinoStrings.fatal]
    
    inline def info: typings.pino.pinoStrings.info = "info".asInstanceOf[typings.pino.pinoStrings.info]
    
    inline def trace: typings.pino.pinoStrings.trace = "trace".asInstanceOf[typings.pino.pinoStrings.trace]
    
    inline def warn: typings.pino.pinoStrings.warn = "warn".asInstanceOf[typings.pino.pinoStrings.warn]
  }
  
  type LevelChangeEventListener = js.Function4[
    /* lvl */ LevelWithSilent | String, 
    /* val */ Double, 
    /* prevLvl */ LevelWithSilent | String, 
    /* prevVal */ Double, 
    Unit
  ]
  
  trait LevelMapping extends StObject {
    
    /**
      * Returns the mappings of level internal level numbers to their string representations.
      */
    var labels: NumberDictionary[String]
    
    /**
      * Returns the mappings of level names to their respective internal number representation.
      */
    var values: StringDictionary[Double]
  }
  object LevelMapping {
    
    inline def apply(labels: NumberDictionary[String], values: StringDictionary[Double]): LevelMapping = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[LevelMapping]
    }
    
    extension [Self <: LevelMapping](x: Self) {
      
      inline def setLabels(value: NumberDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pino.pinoStrings.silent
    - typings.pino.pinoStrings.fatal
    - typings.pino.pinoStrings.error
    - typings.pino.pinoStrings.warn
    - typings.pino.pinoStrings.info
    - typings.pino.pinoStrings.debug
    - typings.pino.pinoStrings.trace
  */
  trait LevelWithSilent extends StObject
  object LevelWithSilent {
    
    inline def debug: typings.pino.pinoStrings.debug = "debug".asInstanceOf[typings.pino.pinoStrings.debug]
    
    inline def error: typings.pino.pinoStrings.error = "error".asInstanceOf[typings.pino.pinoStrings.error]
    
    inline def fatal: typings.pino.pinoStrings.fatal = "fatal".asInstanceOf[typings.pino.pinoStrings.fatal]
    
    inline def info: typings.pino.pinoStrings.info = "info".asInstanceOf[typings.pino.pinoStrings.info]
    
    inline def silent: typings.pino.pinoStrings.silent = "silent".asInstanceOf[typings.pino.pinoStrings.silent]
    
    inline def trace: typings.pino.pinoStrings.trace = "trace".asInstanceOf[typings.pino.pinoStrings.trace]
    
    inline def warn: typings.pino.pinoStrings.warn = "warn".asInstanceOf[typings.pino.pinoStrings.warn]
  }
  
  /**
    * Describes a log line.
    */
  type LogDescriptor = Record[String, js.Any]
  
  /**
    * A data structure representing a log message, it represents the arguments passed to a logger statement, the level
    * at which they were logged and the hierarchy of child bindings.
    *
    * @description By default serializers are not applied to log output in the browser, but they will always be applied
    * to `messages` and `bindings` in the `logEvent` object. This allows  us to ensure a consistent format for all
    * values between server and client.
    */
  trait LogEvent extends StObject {
    
    /**
      * Represents each child logger (if any), and the relevant bindings.
      *
      * @description For instance, given `logger.child({a: 1}).child({b: 2}).info({c: 3})`, the bindings array would
      * hold `[{a: 1}, {b: 2}]` and the `messages` array would be `[{c: 3}]`. The `bindings` are ordered according to
      * their position in the child logger hierarchy, with the lowest index being the top of the hierarchy.
      */
    var bindings: js.Array[Bindings]
    
    /**
      * Holds the `label` (for instance `info`), and the corresponding numerical `value` (for instance `30`).
      * This could be important in cases where client side level values and labels differ from server side.
      */
    var level: Label
    
    /**
      * All arguments passed to logger method, (for instance `logger.info('a', 'b', 'c')` would result in `messages`
      * array `['a', 'b', 'c']`).
      */
    var messages: js.Array[js.Any]
    
    /**
      * Unix epoch timestamp in milliseconds, the time is taken from the moment the logger method is called.
      */
    var ts: Double
  }
  object LogEvent {
    
    inline def apply(bindings: js.Array[Bindings], level: Label, messages: js.Array[js.Any], ts: Double): LogEvent = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEvent]
    }
    
    extension [Self <: LogEvent](x: Self) {
      
      inline def setBindings(value: js.Array[Bindings]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: Bindings*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      inline def setLevel(value: Label): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[js.Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogFn extends StObject {
    
    def apply(msg: String, args: js.Any*): Unit = js.native
    /* tslint:disable:no-unnecessary-generics */
    def apply[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
    def apply[T /* <: js.Object */](obj: T, msg: Unit, args: js.Any*): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait Logger extends BaseLogger
  
  trait LoggerOptions extends StObject {
    
    /**
      * key-value object added as child logger to each log line. If set to null the base child logger is not added
      */
    var base: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
    
    /**
      * Browser only, see http://getpino.io/#/docs/browser.
      */
    var browser: js.UndefOr[AsObject] = js.undefined
    
    /**
      * (DEPRECATED, use `levelKey`) Changes the property `level` to any string value you pass in. Default: 'level'
      */
    var changeLevelName: js.UndefOr[String] = js.undefined
    
    /**
      * Use this option to define additional logging levels.
      * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
      */
    var customLevels: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * Enables logging. Default: `true`.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object containing functions for formatting the shape of the log lines.
      * These functions should return a JSONifiable object and should never throw.
      * These functions allow for full customization of the resulting log lines.
      * For example, they can be used to change the level key name or to enrich the default metadata.
      */
    var formatters: js.UndefOr[typings.pino.anon.Bindings] = js.undefined
    
    /**
      * An object mapping to hook functions. Hook functions allow for customizing internal logger operations.
      * Hook functions must be synchronous functions.
      */
    var hooks: js.UndefOr[LogMethod] = js.undefined
    
    /**
      * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
      * requires supplying a level value via `levelVal`. Default: 'info'.
      */
    var level: js.UndefOr[LevelWithSilent | String] = js.undefined
    
    /**
      * Changes the property `level` to any string value you pass in. Default: 'level'
      */
    var levelKey: js.UndefOr[String] = js.undefined
    
    /**
      * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
      */
    var levelVal: js.UndefOr[Double] = js.undefined
    
    /**
      * The string key for the 'message' in the JSON object. Default: "msg".
      */
    var messageKey: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, the `mixin` function is called each time one of the active logging methods
      * is called. The function must synchronously return an object. The properties of the
      * returned object will be added to the logged JSON.
      */
    var mixin: js.UndefOr[MixinFn] = js.undefined
    
    /**
      * The name of the logger. Default: `undefined`.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The string key to place any logged object under.
      */
    var nestedKey: js.UndefOr[String] = js.undefined
    
    /**
      * This function will be invoked during process shutdown when `extreme` is set to `true`. If you do not specify
      * a function, Pino will invoke `process.exit(0)` when no error has occurred, and `process.exit(1)` otherwise.
      * If you do specify a function, it is up to you to terminate the process; you must perform only synchronous
      * operations at this point. See http://getpino.io/#/docs/extreme for more detail.
      */
    var onTerminated: js.UndefOr[js.Function2[/* eventName */ String, /* err */ js.Any, Unit]] = js.undefined
    
    /**
      * Allows to optionally define which prettifier module to use.
      */
    // TODO: use type definitions from 'pino-pretty' when available.
    var prettifier: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
      * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
      */
    var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
    
    /**
      * As an array, the redact option specifies paths that should have their values redacted from any log output.
      *
      * Each path must be a string using a syntax which corresponds to JavaScript dot and bracket notation.
      *
      * If an object is supplied, three options can be specified:
      *
      *      paths (String[]): Required. An array of paths
      *      censor (String): Optional. A value to overwrite key which are to be redacted. Default: '[Redacted]'
      *      remove (Boolean): Optional. Instead of censoring the value, remove both the key and the value. Default: false
      */
    var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
    
    /**
      * Avoid error causes by circular references in the object tree. Default: `true`.
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * an object containing functions for custom serialization of objects.
      * These functions should return an JSONifiable object and they should never throw. When logging an object,
      * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
      */
    var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
    
    /**
      * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
      * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
      * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
      * Caution: any sort of formatted time will significantly slow down Pino's performance.
      */
    var timestamp: js.UndefOr[TimeFn | Boolean] = js.undefined
    
    /**
      * Outputs the level as a string instead of integer. Default: `false`.
      */
    var useLevelLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use this option to only use defined `customLevels` and omit Pino's levels.
      * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
      * Warning: this option may not be supported by downstream transports.
      */
    var useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setBase(value: StringDictionary[js.Any]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseNull: Self = StObject.set(x, "base", null)
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBrowser(value: AsObject): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setChangeLevelName(value: String): Self = StObject.set(x, "changeLevelName", value.asInstanceOf[js.Any])
      
      inline def setChangeLevelNameUndefined: Self = StObject.set(x, "changeLevelName", js.undefined)
      
      inline def setCustomLevels(value: StringDictionary[Double]): Self = StObject.set(x, "customLevels", value.asInstanceOf[js.Any])
      
      inline def setCustomLevelsUndefined: Self = StObject.set(x, "customLevels", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormatters(value: typings.pino.anon.Bindings): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setHooks(value: LogMethod): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setLevel(value: LevelWithSilent | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelKey(value: String): Self = StObject.set(x, "levelKey", value.asInstanceOf[js.Any])
      
      inline def setLevelKeyUndefined: Self = StObject.set(x, "levelKey", js.undefined)
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLevelVal(value: Double): Self = StObject.set(x, "levelVal", value.asInstanceOf[js.Any])
      
      inline def setLevelValUndefined: Self = StObject.set(x, "levelVal", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      inline def setMixin(value: () => js.Object): Self = StObject.set(x, "mixin", js.Any.fromFunction0(value))
      
      inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNestedKey(value: String): Self = StObject.set(x, "nestedKey", value.asInstanceOf[js.Any])
      
      inline def setNestedKeyUndefined: Self = StObject.set(x, "nestedKey", js.undefined)
      
      inline def setOnTerminated(value: (/* eventName */ String, /* err */ js.Any) => Unit): Self = StObject.set(x, "onTerminated", js.Any.fromFunction2(value))
      
      inline def setOnTerminatedUndefined: Self = StObject.set(x, "onTerminated", js.undefined)
      
      inline def setPrettifier(value: js.Any): Self = StObject.set(x, "prettifier", value.asInstanceOf[js.Any])
      
      inline def setPrettifierUndefined: Self = StObject.set(x, "prettifier", js.undefined)
      
      inline def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setRedact(value: js.Array[String] | redactOptions): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
      
      inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
      
      inline def setRedactVarargs(value: String*): Self = StObject.set(x, "redact", js.Array(value :_*))
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSerializers(value: StringDictionary[SerializerFn]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setTimestamp(value: TimeFn | Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampFunction0(value: () => String): Self = StObject.set(x, "timestamp", js.Any.fromFunction0(value))
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUseLevelLabels(value: Boolean): Self = StObject.set(x, "useLevelLabels", value.asInstanceOf[js.Any])
      
      inline def setUseLevelLabelsUndefined: Self = StObject.set(x, "useLevelLabels", js.undefined)
      
      inline def setUseOnlyCustomLevels(value: Boolean): Self = StObject.set(x, "useOnlyCustomLevels", value.asInstanceOf[js.Any])
      
      inline def setUseOnlyCustomLevelsUndefined: Self = StObject.set(x, "useOnlyCustomLevels", js.undefined)
    }
  }
  
  type MixinFn = js.Function0[js.Object]
  
  trait PrettyOptions extends StObject {
    
    /**
      * If set to true, will add color information to the formatted output message. Default: `false`.
      */
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
      */
    var crlf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define the log keys that are associated with error like objects. Default: ["err", "error"]
      */
    var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  When formatting an error object, display this list of properties.
      *  The list should be a comma separated list of properties. Default: ''
      */
    var errorProps: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore one or several keys. Example: "time,hostname"
      */
    var ignore: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
      */
    var levelFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
      */
    var messageFormat: js.UndefOr[`false` | String] = js.undefined
    
    /**
      * The key in the JSON object to use as the highlighted message. Default: "msg".
      */
    var messageKey: js.UndefOr[String] = js.undefined
    
    /**
      * Specify a search pattern according to {@link http://jmespath.org|jmespath}
      */
    var search: js.UndefOr[String] = js.undefined
    
    /**
      * Suppress warning on first synchronous flushing.
      */
    var suppressFlushSyncWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key in the JSON object to use for timestamp display. Default: "time".
      */
    var timestampKey: js.UndefOr[String] = js.undefined
    
    /**
      * Translate the epoch time value into a human readable date and time string.
      * This flag also can set the format string to apply when translating the date to human readable format.
      * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
      * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
      */
    var translateTime: js.UndefOr[Boolean | String] = js.undefined
  }
  object PrettyOptions {
    
    inline def apply(): PrettyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyOptions]
    }
    
    extension [Self <: PrettyOptions](x: Self) {
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setCrlf(value: Boolean): Self = StObject.set(x, "crlf", value.asInstanceOf[js.Any])
      
      inline def setCrlfUndefined: Self = StObject.set(x, "crlf", js.undefined)
      
      inline def setErrorLikeObjectKeys(value: js.Array[String]): Self = StObject.set(x, "errorLikeObjectKeys", value.asInstanceOf[js.Any])
      
      inline def setErrorLikeObjectKeysUndefined: Self = StObject.set(x, "errorLikeObjectKeys", js.undefined)
      
      inline def setErrorLikeObjectKeysVarargs(value: String*): Self = StObject.set(x, "errorLikeObjectKeys", js.Array(value :_*))
      
      inline def setErrorProps(value: String): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
      
      inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setLevelFirst(value: Boolean): Self = StObject.set(x, "levelFirst", value.asInstanceOf[js.Any])
      
      inline def setLevelFirstUndefined: Self = StObject.set(x, "levelFirst", js.undefined)
      
      inline def setMessageFormat(value: `false` | String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSuppressFlushSyncWarning(value: Boolean): Self = StObject.set(x, "suppressFlushSyncWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressFlushSyncWarningUndefined: Self = StObject.set(x, "suppressFlushSyncWarning", js.undefined)
      
      inline def setTimestampKey(value: String): Self = StObject.set(x, "timestampKey", value.asInstanceOf[js.Any])
      
      inline def setTimestampKeyUndefined: Self = StObject.set(x, "timestampKey", js.undefined)
      
      inline def setTranslateTime(value: Boolean | String): Self = StObject.set(x, "translateTime", value.asInstanceOf[js.Any])
      
      inline def setTranslateTimeUndefined: Self = StObject.set(x, "translateTime", js.undefined)
    }
  }
  
  type SerializedError = typings.pinoStdSerializers.mod.SerializedError
  
  type SerializedRequest = typings.pinoStdSerializers.mod.SerializedRequest
  
  type SerializedResponse = typings.pinoStdSerializers.mod.SerializedResponse
  
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  
  type TimeFn = js.Function0[String]
  
  type WriteFn = js.Function1[/* o */ js.Object, Unit]
  
  trait redactOptions extends StObject {
    
    var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, js.Any])] = js.undefined
    
    var paths: js.Array[String]
    
    var remove: js.UndefOr[Boolean] = js.undefined
  }
  object redactOptions {
    
    inline def apply(paths: js.Array[String]): redactOptions = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[redactOptions]
    }
    
    extension [Self <: redactOptions](x: Self) {
      
      inline def setCensor(value: String | (js.Function1[/* v */ js.Any, js.Any])): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
      
      inline def setCensorFunction1(value: /* v */ js.Any => js.Any): Self = StObject.set(x, "censor", js.Any.fromFunction1(value))
      
      inline def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
