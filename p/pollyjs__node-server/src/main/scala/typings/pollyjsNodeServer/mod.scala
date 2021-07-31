package typings.pollyjsNodeServer

import typings.cors.mod.CorsOptions
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pollyjsNodeServer.anon.PartialConfig
import typings.pollyjsNodeServer.anon.PartialServerConfig
import typings.pollyjsNodeServer.anon.PickConfigrecordingsDir
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/node-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pollyjs/node-server", "API")
  @js.native
  class API protected () extends StObject {
    def this(options: PickConfigrecordingsDir) = this()
    
    def deleteRecording(recording: String): APIResponse = js.native
    
    def filenameFor(recording: String): String = js.native
    
    def getRecordings(recording: String): APIResponse = js.native
    
    def respond(status: Double): APIResponse = js.native
    def respond(status: Double, data: js.Any): APIResponse = js.native
    
    def saveRecording(recording: String, data: js.Any): APIResponse = js.native
  }
  
  @JSImport("@pollyjs/node-server", "Defaults")
  @js.native
  val Defaults: Config = js.native
  
  @JSImport("@pollyjs/node-server", "Server")
  @js.native
  class Server () extends StObject {
    def this(options: PartialServerConfig) = this()
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var config: ServerConfig = js.native
    
    def listen(): typings.node.httpMod.Server = js.native
    def listen(port: Double): typings.node.httpMod.Server = js.native
    def listen(port: Double, host: String): typings.node.httpMod.Server = js.native
    def listen(port: Unit, host: String): typings.node.httpMod.Server = js.native
    
    var server: js.UndefOr[typings.node.httpMod.Server] = js.native
  }
  
  @scala.inline
  def registerExpressAPI(app: Express, config: PartialConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerExpressAPI")(app.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait APIResponse extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var status: Double
  }
  object APIResponse {
    
    @scala.inline
    def apply(status: Double): APIResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIResponse]
    }
    
    @scala.inline
    implicit class APIResponseMutableBuilder[Self <: APIResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var apiNamespace: String
    
    var port: Double
    
    var quiet: Boolean
    
    var recordingSizeLimit: String
    
    var recordingsDir: String
  }
  object Config {
    
    @scala.inline
    def apply(
      apiNamespace: String,
      port: Double,
      quiet: Boolean,
      recordingSizeLimit: String,
      recordingsDir: String
    ): Config = {
      val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerConfig
    extends StObject
       with Config {
    
    var corsOptions: js.UndefOr[CorsOptions] = js.undefined
  }
  object ServerConfig {
    
    @scala.inline
    def apply(
      apiNamespace: String,
      port: Double,
      quiet: Boolean,
      recordingSizeLimit: String,
      recordingsDir: String
    ): ServerConfig = {
      val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig]
    }
    
    @scala.inline
    implicit class ServerConfigMutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorsOptions(value: CorsOptions): Self = StObject.set(x, "corsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsOptionsUndefined: Self = StObject.set(x, "corsOptions", js.undefined)
    }
  }
}
