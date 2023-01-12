package typings.pinoHttp

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pino.mod.DestinationStream
import typings.pino.mod.Level
import typings.pino.mod.Logger
import typings.pino.mod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): HttpLogger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HttpLogger]
  inline def apply(opts: Unit, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  inline def apply(opts: Options): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  inline def apply(opts: Options, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  inline def apply(stream: DestinationStream): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pino-http", "startTime")
  @js.native
  val startTime: js.Symbol = js.native
  
  trait AutoLoggingOptions extends StObject {
    
    var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.undefined
    
    var ignore: js.UndefOr[js.Function1[/* req */ IncomingMessage, Boolean]] = js.undefined
    
    var ignorePaths: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object AutoLoggingOptions {
    
    inline def apply(): AutoLoggingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoLoggingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoLoggingOptions] (val x: Self) extends AnyVal {
      
      inline def setGetPath(value: /* req */ IncomingMessage => js.UndefOr[String]): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setIgnore(value: /* req */ IncomingMessage => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnorePaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignorePaths", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathsUndefined: Self = StObject.set(x, "ignorePaths", js.undefined)
      
      inline def setIgnorePathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignorePaths", js.Array(value*))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    }
  }
  
  trait CustomAttributeKeys extends StObject {
    
    var err: js.UndefOr[String] = js.undefined
    
    var req: js.UndefOr[String] = js.undefined
    
    var reqId: js.UndefOr[String] = js.undefined
    
    var res: js.UndefOr[String] = js.undefined
    
    var responseTime: js.UndefOr[String] = js.undefined
  }
  object CustomAttributeKeys {
    
    inline def apply(): CustomAttributeKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAttributeKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttributeKeys] (val x: Self) extends AnyVal {
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setReq(value: String): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
      
      inline def setReqIdUndefined: Self = StObject.set(x, "reqId", js.undefined)
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    }
  }
  
  type GenReqId = js.Function1[/* req */ IncomingMessage, ReqId]
  
  @js.native
  trait HttpLogger extends StObject {
    
    def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit = js.native
    def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], next: js.Function0[Unit]): Unit = js.native
    
    var logger: Logger[LoggerOptions] = js.native
  }
  
  /**
    * Options for pino-http
    *
    * See https://github.com/pinojs/pino-http#pinohttpopts-stream
    */
  trait Options
    extends StObject
       with typings.pino.mod.pino.LoggerOptions {
    
    var autoLogging: js.UndefOr[Boolean | AutoLoggingOptions] = js.undefined
    
    var customAttributeKeys: js.UndefOr[CustomAttributeKeys] = js.undefined
    
    var customErrorMessage: js.UndefOr[
        js.Function2[/* error */ js.Error, /* res */ ServerResponse[IncomingMessage], String]
      ] = js.undefined
    
    var customLogLevel: js.UndefOr[
        js.Function2[/* res */ ServerResponse[IncomingMessage], /* error */ js.Error, Level]
      ] = js.undefined
    
    var customSuccessMessage: js.UndefOr[js.Function1[/* res */ ServerResponse[IncomingMessage], String]] = js.undefined
    
    var genReqId: js.UndefOr[GenReqId] = js.undefined
    
    var logger: js.UndefOr[Logger[LoggerOptions]] = js.undefined
    
    var quietReqLogger: js.UndefOr[Boolean] = js.undefined
    
    var reqCustomProps: js.UndefOr[
        js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], js.Object]
      ] = js.undefined
    
    var stream: js.UndefOr[DestinationStream] = js.undefined
    
    var useLevel: js.UndefOr[Level] = js.undefined
    
    var wrapSerializers: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoLogging(value: Boolean | AutoLoggingOptions): Self = StObject.set(x, "autoLogging", value.asInstanceOf[js.Any])
      
      inline def setAutoLoggingUndefined: Self = StObject.set(x, "autoLogging", js.undefined)
      
      inline def setCustomAttributeKeys(value: CustomAttributeKeys): Self = StObject.set(x, "customAttributeKeys", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributeKeysUndefined: Self = StObject.set(x, "customAttributeKeys", js.undefined)
      
      inline def setCustomErrorMessage(value: (/* error */ js.Error, /* res */ ServerResponse[IncomingMessage]) => String): Self = StObject.set(x, "customErrorMessage", js.Any.fromFunction2(value))
      
      inline def setCustomErrorMessageUndefined: Self = StObject.set(x, "customErrorMessage", js.undefined)
      
      inline def setCustomLogLevel(value: (/* res */ ServerResponse[IncomingMessage], /* error */ js.Error) => Level): Self = StObject.set(x, "customLogLevel", js.Any.fromFunction2(value))
      
      inline def setCustomLogLevelUndefined: Self = StObject.set(x, "customLogLevel", js.undefined)
      
      inline def setCustomSuccessMessage(value: /* res */ ServerResponse[IncomingMessage] => String): Self = StObject.set(x, "customSuccessMessage", js.Any.fromFunction1(value))
      
      inline def setCustomSuccessMessageUndefined: Self = StObject.set(x, "customSuccessMessage", js.undefined)
      
      inline def setGenReqId(value: /* req */ IncomingMessage => ReqId): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      inline def setLogger(value: Logger[LoggerOptions]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setQuietReqLogger(value: Boolean): Self = StObject.set(x, "quietReqLogger", value.asInstanceOf[js.Any])
      
      inline def setQuietReqLoggerUndefined: Self = StObject.set(x, "quietReqLogger", js.undefined)
      
      inline def setReqCustomProps(value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => js.Object): Self = StObject.set(x, "reqCustomProps", js.Any.fromFunction2(value))
      
      inline def setReqCustomPropsUndefined: Self = StObject.set(x, "reqCustomProps", js.undefined)
      
      inline def setStream(value: DestinationStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setUseLevel(value: Level): Self = StObject.set(x, "useLevel", value.asInstanceOf[js.Any])
      
      inline def setUseLevelUndefined: Self = StObject.set(x, "useLevel", js.undefined)
      
      inline def setWrapSerializers(value: Boolean): Self = StObject.set(x, "wrapSerializers", value.asInstanceOf[js.Any])
      
      inline def setWrapSerializersUndefined: Self = StObject.set(x, "wrapSerializers", js.undefined)
    }
  }
  
  type ReqId = Double | String | js.Object
  
  /* augmented module */
  object httpAugmentingMod {
    
    trait IncomingMessage extends StObject {
      
      var id: ReqId
      
      var log: Logger[LoggerOptions]
    }
    object IncomingMessage {
      
      inline def apply(id: ReqId, log: Logger[LoggerOptions]): typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage] (val x: Self) extends AnyVal {
        
        inline def setId(value: ReqId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLog(value: Logger[LoggerOptions]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OutgoingMessage extends StObject
    
    trait ServerResponse extends StObject {
      
      var err: js.UndefOr[js.Error] = js.undefined
    }
    object ServerResponse {
      
      inline def apply(): typings.pinoHttp.mod.httpAugmentingMod.ServerResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.pinoHttp.mod.httpAugmentingMod.ServerResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.pinoHttp.mod.httpAugmentingMod.ServerResponse] (val x: Self) extends AnyVal {
        
        inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
        
        inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      }
    }
  }
}
