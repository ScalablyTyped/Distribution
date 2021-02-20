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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  def apply(): HttpLogger = js.native
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): HttpLogger = js.native
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  def apply(opts: Options): HttpLogger = js.native
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  @JSImport("pino-http", JSImport.Namespace)
  @js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
  
  @JSImport("pino-http", "startTime")
  @js.native
  val startTime: js.Symbol = js.native
  
  @js.native
  trait AutoLoggingOptions extends StObject {
    
    var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.native
    
    var ignorePaths: js.UndefOr[js.Array[String]] = js.native
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
  
  @js.native
  trait CustomAttributeKeys extends StObject {
    
    var err: js.UndefOr[String] = js.native
    
    var req: js.UndefOr[String] = js.native
    
    var res: js.UndefOr[String] = js.native
    
    var responseTime: js.UndefOr[String] = js.native
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
  @js.native
  trait Options extends LoggerOptions {
    
    var autoLogging: js.UndefOr[Boolean | AutoLoggingOptions] = js.native
    
    var customAttributeKeys: js.UndefOr[CustomAttributeKeys] = js.native
    
    var customErrorMessage: js.UndefOr[js.Function2[/* error */ Error, /* res */ ServerResponse, String]] = js.native
    
    var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ Error, Level]] = js.native
    
    var customSuccessMessage: js.UndefOr[js.Function1[/* res */ ServerResponse, String]] = js.native
    
    var genReqId: js.UndefOr[GenReqId] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
    
    var reqCustomProps: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.Object]] = js.native
    
    var stream: js.UndefOr[DestinationStream] = js.native
    
    var useLevel: js.UndefOr[Level] = js.native
    
    var wrapSerializers: js.UndefOr[Boolean] = js.native
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
    
    @js.native
    trait IncomingMessage extends StObject {
      
      var id: ReqId = js.native
      
      var log: Logger = js.native
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
    
    @js.native
    trait ServerResponse extends StObject {
      
      var err: js.UndefOr[Error] = js.native
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
