package typings.pinoHttp

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pino.mod.DestinationStream
import typings.pino.mod.Level
import typings.pino.mod.Logger
import typings.pino.mod.LoggerOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): HttpLogger = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Unit, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Options): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(opts: Options, stream: DestinationStream): HttpLogger = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[HttpLogger]
  @scala.inline
  def apply(stream: DestinationStream): HttpLogger = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[HttpLogger]
  
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pino-http", "startTime")
  @js.native
  val startTime: js.Symbol = js.native
  
  trait AutoLoggingOptions extends StObject {
    
    var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.undefined
    
    var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AutoLoggingOptions {
    
    @scala.inline
    def apply(): AutoLoggingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoLoggingOptions]
    }
    
    @scala.inline
    implicit class AutoLoggingOptionsMutableBuilder[Self <: AutoLoggingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPath(value: /* req */ IncomingMessage => js.UndefOr[String]): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      @scala.inline
      def setIgnorePaths(value: js.Array[String]): Self = StObject.set(x, "ignorePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathsUndefined: Self = StObject.set(x, "ignorePaths", js.undefined)
      
      @scala.inline
      def setIgnorePathsVarargs(value: String*): Self = StObject.set(x, "ignorePaths", js.Array(value :_*))
    }
  }
  
  trait CustomAttributeKeys extends StObject {
    
    var err: js.UndefOr[String] = js.undefined
    
    var req: js.UndefOr[String] = js.undefined
    
    var res: js.UndefOr[String] = js.undefined
    
    var responseTime: js.UndefOr[String] = js.undefined
  }
  object CustomAttributeKeys {
    
    @scala.inline
    def apply(): CustomAttributeKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAttributeKeys]
    }
    
    @scala.inline
    implicit class CustomAttributeKeysMutableBuilder[Self <: CustomAttributeKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setReq(value: String): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
      
      @scala.inline
      def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      @scala.inline
      def setResponseTime(value: String): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    }
  }
  
  type GenReqId = js.Function1[/* req */ IncomingMessage, ReqId]
  
  type HttpLogger = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  
  /**
    * Options for pino-http
    *
    * See https://github.com/pinojs/pino-http#pinohttpopts-stream
    */
  trait Options
    extends StObject
       with LoggerOptions {
    
    var autoLogging: js.UndefOr[Boolean | AutoLoggingOptions] = js.undefined
    
    var customAttributeKeys: js.UndefOr[CustomAttributeKeys] = js.undefined
    
    var customErrorMessage: js.UndefOr[js.Function2[/* error */ Error, /* res */ ServerResponse, String]] = js.undefined
    
    var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ Error, Level]] = js.undefined
    
    var customSuccessMessage: js.UndefOr[js.Function1[/* res */ ServerResponse, String]] = js.undefined
    
    var genReqId: js.UndefOr[GenReqId] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var reqCustomProps: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.Object]] = js.undefined
    
    var stream: js.UndefOr[DestinationStream] = js.undefined
    
    var useLevel: js.UndefOr[Level] = js.undefined
    
    var wrapSerializers: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoLogging(value: Boolean | AutoLoggingOptions): Self = StObject.set(x, "autoLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLoggingUndefined: Self = StObject.set(x, "autoLogging", js.undefined)
      
      @scala.inline
      def setCustomAttributeKeys(value: CustomAttributeKeys): Self = StObject.set(x, "customAttributeKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAttributeKeysUndefined: Self = StObject.set(x, "customAttributeKeys", js.undefined)
      
      @scala.inline
      def setCustomErrorMessage(value: (/* error */ Error, /* res */ ServerResponse) => String): Self = StObject.set(x, "customErrorMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomErrorMessageUndefined: Self = StObject.set(x, "customErrorMessage", js.undefined)
      
      @scala.inline
      def setCustomLogLevel(value: (/* res */ ServerResponse, /* error */ Error) => Level): Self = StObject.set(x, "customLogLevel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomLogLevelUndefined: Self = StObject.set(x, "customLogLevel", js.undefined)
      
      @scala.inline
      def setCustomSuccessMessage(value: /* res */ ServerResponse => String): Self = StObject.set(x, "customSuccessMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomSuccessMessageUndefined: Self = StObject.set(x, "customSuccessMessage", js.undefined)
      
      @scala.inline
      def setGenReqId(value: /* req */ IncomingMessage => ReqId): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setReqCustomProps(value: /* req */ IncomingMessage => js.Object): Self = StObject.set(x, "reqCustomProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReqCustomPropsUndefined: Self = StObject.set(x, "reqCustomProps", js.undefined)
      
      @scala.inline
      def setStream(value: DestinationStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setUseLevel(value: Level): Self = StObject.set(x, "useLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLevelUndefined: Self = StObject.set(x, "useLevel", js.undefined)
      
      @scala.inline
      def setWrapSerializers(value: Boolean): Self = StObject.set(x, "wrapSerializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapSerializersUndefined: Self = StObject.set(x, "wrapSerializers", js.undefined)
    }
  }
  
  type ReqId = Double | String | js.Object
  
  /* augmented module */
  object httpAugmentingMod {
    
    trait IncomingMessage extends StObject {
      
      var id: ReqId
      
      var log: Logger
    }
    object IncomingMessage {
      
      @scala.inline
      def apply(id: ReqId, log: Logger): typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage]
      }
      
      @scala.inline
      implicit class IncomingMessageMutableBuilder[Self <: typings.pinoHttp.mod.httpAugmentingMod.IncomingMessage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: ReqId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait OutgoingMessage extends StObject
    
    trait ServerResponse extends StObject {
      
      var err: js.UndefOr[Error] = js.undefined
    }
    object ServerResponse {
      
      @scala.inline
      def apply(): typings.pinoHttp.mod.httpAugmentingMod.ServerResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.pinoHttp.mod.httpAugmentingMod.ServerResponse]
      }
      
      @scala.inline
      implicit class ServerResponseMutableBuilder[Self <: typings.pinoHttp.mod.httpAugmentingMod.ServerResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      }
    }
  }
}
