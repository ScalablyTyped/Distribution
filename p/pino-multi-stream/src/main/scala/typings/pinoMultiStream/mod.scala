package typings.pinoMultiStream

import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Writable
import typings.pino.mod.DestinationStream
import typings.pino.mod.LevelWithSilent
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.pinoStdSerializers.mod.CustomErrorSerializer
import typings.pinoStdSerializers.mod.CustomRequestSerializer
import typings.pinoStdSerializers.mod.CustomResponseSerializer
import typings.pinoStdSerializers.mod.SerializedError
import typings.pinoStdSerializers.mod.SerializedRequest
import typings.pinoStdSerializers.mod.SerializedResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: LoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @JSImport("pino-multi-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multistream(streams: Streams): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streams.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def multistream(streams: Streams, opts: MultiStreamOptions): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("multistream")(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  inline def prettyStream(): DestinationStream = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyStream")().asInstanceOf[DestinationStream]
  inline def prettyStream(opts: PrettyStreamOptions): DestinationStream = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyStream")(opts.asInstanceOf[js.Any]).asInstanceOf[DestinationStream]
  
  object stdSerializers {
    
    @JSImport("pino-multi-stream", "stdSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def err(err: js.Error): SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(err.asInstanceOf[js.Any]).asInstanceOf[SerializedError]
    
    inline def mapHttpRequest(req: IncomingMessage): Req = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Req]
    
    inline def mapHttpResponse(res: ServerResponse[IncomingMessage]): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Res]
    
    inline def req(req: IncomingMessage): SerializedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(req.asInstanceOf[js.Any]).asInstanceOf[SerializedRequest]
    
    inline def res(res: ServerResponse[IncomingMessage]): SerializedResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(res.asInstanceOf[js.Any]).asInstanceOf[SerializedResponse]
    
    inline def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ js.Error, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapErrorSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ js.Error, Record[String, Any]]]
    
    inline def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequestSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* req */ IncomingMessage, Record[String, Any]]]
    
    inline def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapResponseSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]]]
  }
  
  type Level = LevelWithSilent
  
  type Logger = typings.pino.mod.Logger[typings.pino.mod.LoggerOptions]
  
  trait LoggerOptions
    extends StObject
       with typings.pino.mod.pino.LoggerOptions {
    
    var streams: js.UndefOr[Streams] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setStreams(value: Streams): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: typings.pinoMultiStream.anon.Level*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
  
  trait MultiStreamOptions extends StObject {
    
    var dedupe: js.UndefOr[Boolean] = js.undefined
  }
  object MultiStreamOptions {
    
    inline def apply(): MultiStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiStreamOptions]
    }
    
    extension [Self <: MultiStreamOptions](x: Self) {
      
      inline def setDedupe(value: Boolean): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<pino.pino.LoggerOptions, 'prettyPrint'> */
  trait PrettyStreamOptions extends StObject {
    
    var dest: js.UndefOr[DestinationStream | WritableStream] = js.undefined
    
    /**
      * Allows to optionally define which prettifier module to use
      */
    // TODO: use type definitions from 'pino-pretty' when available.
    var prettifier: js.UndefOr[Any] = js.undefined
    
    var prettyPrint: js.UndefOr[Any] = js.undefined
  }
  object PrettyStreamOptions {
    
    inline def apply(): PrettyStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyStreamOptions]
    }
    
    extension [Self <: PrettyStreamOptions](x: Self) {
      
      inline def setDest(value: DestinationStream | WritableStream): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setPrettifier(value: Any): Self = StObject.set(x, "prettifier", value.asInstanceOf[js.Any])
      
      inline def setPrettifierUndefined: Self = StObject.set(x, "prettifier", js.undefined)
      
      inline def setPrettyPrint(value: Any): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    }
  }
  
  type Streams = js.Array[typings.pinoMultiStream.anon.Level]
}
