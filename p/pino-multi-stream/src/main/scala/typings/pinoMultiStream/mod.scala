package typings.pinoMultiStream

import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Writable
import typings.pino.mod.DestinationStream
import typings.pino.mod.PrettyOptions
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.pinoStdSerializers.mod.CustomErrorSerializer
import typings.pinoStdSerializers.mod.CustomRequestSerializer
import typings.pinoStdSerializers.mod.CustomResponseSerializer
import typings.pinoStdSerializers.mod.SerializedError
import typings.pinoStdSerializers.mod.SerializedRequest
import typings.pinoStdSerializers.mod.SerializedResponse
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-multi-stream", JSImport.Namespace)
  @js.native
  def apply(options: LoggerOptions): Logger = js.native
  
  @JSImport("pino-multi-stream", "multistream")
  @js.native
  def multistream(streams: Streams): Writable = js.native
  @JSImport("pino-multi-stream", "multistream")
  @js.native
  def multistream(streams: Streams, opts: MultiStreamOptions): Writable = js.native
  
  @JSImport("pino-multi-stream", "prettyStream")
  @js.native
  def prettyStream(): DestinationStream = js.native
  @JSImport("pino-multi-stream", "prettyStream")
  @js.native
  def prettyStream(opts: PrettyStreamOptions): DestinationStream = js.native
  
  object stdSerializers {
    
    @JSImport("pino-multi-stream", "stdSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes an Error object.
      */
    @JSImport("pino-multi-stream", "stdSerializers.err")
    @js.native
    def err: js.Function1[/* err */ Error, SerializedError] = js.native
    /**
      * Serializes an Error object.
      */
    @JSImport("pino-multi-stream", "stdSerializers.err")
    @js.native
    def err(err: Error): SerializedError = js.native
    @scala.inline
    def err_=(x: js.Function1[/* err */ Error, SerializedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("err")(x.asInstanceOf[js.Any])
    
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
    @JSImport("pino-multi-stream", "stdSerializers.mapHttpRequest")
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
    @JSImport("pino-multi-stream", "stdSerializers.mapHttpRequest")
    @js.native
    def mapHttpRequest(req: IncomingMessage): Req = js.native
    @scala.inline
    def mapHttpRequest_=(x: js.Function1[/* req */ IncomingMessage, Req]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapHttpRequest")(x.asInstanceOf[js.Any])
    
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
    @JSImport("pino-multi-stream", "stdSerializers.mapHttpResponse")
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
    @JSImport("pino-multi-stream", "stdSerializers.mapHttpResponse")
    @js.native
    def mapHttpResponse(res: ServerResponse): Res = js.native
    @scala.inline
    def mapHttpResponse_=(x: js.Function1[/* res */ ServerResponse, Res]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapHttpResponse")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino-multi-stream", "stdSerializers.req")
    @js.native
    def req: js.Function1[/* req */ IncomingMessage, SerializedRequest] = js.native
    /**
      * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino-multi-stream", "stdSerializers.req")
    @js.native
    def req(req: IncomingMessage): SerializedRequest = js.native
    @scala.inline
    def req_=(x: js.Function1[/* req */ IncomingMessage, SerializedRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("req")(x.asInstanceOf[js.Any])
    
    /**
      * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino-multi-stream", "stdSerializers.res")
    @js.native
    def res: js.Function1[/* res */ ServerResponse, SerializedResponse] = js.native
    /**
      * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
      */
    @JSImport("pino-multi-stream", "stdSerializers.res")
    @js.native
    def res(res: ServerResponse): SerializedResponse = js.native
    @scala.inline
    def res_=(x: js.Function1[/* res */ ServerResponse, SerializedResponse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("res")(x.asInstanceOf[js.Any])
    
    /**
      * A utility method for wrapping the default error serializer. Allows custom serializers to work with the
      * already serialized object.
      * @param customSerializer The custom error serializer. Accepts a single parameter: the newly serialized
      * error object. Returns the new (or updated) error object.
      * @return A new error serializer.
      */
    @JSImport("pino-multi-stream", "stdSerializers.wrapErrorSerializer")
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
    @JSImport("pino-multi-stream", "stdSerializers.wrapErrorSerializer")
    @js.native
    def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, _]] = js.native
    @scala.inline
    def wrapErrorSerializer_=(
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
    @JSImport("pino-multi-stream", "stdSerializers.wrapRequestSerializer")
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
    @JSImport("pino-multi-stream", "stdSerializers.wrapRequestSerializer")
    @js.native
    def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
    @scala.inline
    def wrapRequestSerializer_=(
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
    @JSImport("pino-multi-stream", "stdSerializers.wrapResponseSerializer")
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
    @JSImport("pino-multi-stream", "stdSerializers.wrapResponseSerializer")
    @js.native
    def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, _]] = js.native
    @scala.inline
    def wrapResponseSerializer_=(
      x: js.Function1[
          /* customSerializer */ CustomResponseSerializer, 
          js.Function1[/* res */ ServerResponse, Record[String, js.Any]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapResponseSerializer")(x.asInstanceOf[js.Any])
  }
  
  type Level = typings.pino.mod.Level
  
  type Logger = typings.pino.mod.Logger
  
  @js.native
  trait LoggerOptions
    extends typings.pino.mod.LoggerOptions {
    
    var streams: js.UndefOr[Streams] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStreams(value: Streams): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: typings.pinoMultiStream.anon.Level*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MultiStreamOptions extends StObject {
    
    var dedupe: js.UndefOr[Boolean] = js.native
  }
  object MultiStreamOptions {
    
    @scala.inline
    def apply(): MultiStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiStreamOptions]
    }
    
    @scala.inline
    implicit class MultiStreamOptionsMutableBuilder[Self <: MultiStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<pino.pino.LoggerOptions, 'prettyPrint'> */
  @js.native
  trait PrettyStreamOptions extends StObject {
    
    var dest: js.UndefOr[DestinationStream | WritableStream] = js.native
    
    /**
      * Allows to optionally define which prettifier module to use
      */
    // TODO: use type definitions from 'pino-pretty' when available.
    var prettifier: js.UndefOr[js.Any] = js.native
    
    var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
  }
  object PrettyStreamOptions {
    
    @scala.inline
    def apply(): PrettyStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyStreamOptions]
    }
    
    @scala.inline
    implicit class PrettyStreamOptionsMutableBuilder[Self <: PrettyStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: DestinationStream | WritableStream): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setPrettifier(value: js.Any): Self = StObject.set(x, "prettifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifierUndefined: Self = StObject.set(x, "prettifier", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean | PrettyOptions): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    }
  }
  
  type Streams = js.Array[typings.pinoMultiStream.anon.Level]
}
