package typings.pollyjsNodeServer

import org.scalablytyped.runtime.Instantiable1
import typings.cors.mod.CorsOptions
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.Application
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.pollyjsNodeServer.anon.PartialConfig
import typings.pollyjsNodeServer.anon.PartialServerConfig
import typings.pollyjsNodeServer.anon.PickConfigrecordingsDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/node-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pollyjs/node-server", "API")
  @js.native
  open class API protected () extends StObject {
    def this(options: PickConfigrecordingsDir) = this()
    
    def deleteRecording(recording: String): APIResponse = js.native
    
    def filenameFor(recording: String): String = js.native
    
    def getRecordings(recording: String): APIResponse = js.native
    
    def respond(status: Double): APIResponse = js.native
    def respond(status: Double, data: Any): APIResponse = js.native
    
    def saveRecording(recording: String, data: Any): APIResponse = js.native
  }
  
  @JSImport("@pollyjs/node-server", "Defaults")
  @js.native
  val Defaults: Config = js.native
  
  @JSImport("@pollyjs/node-server", "Server")
  @js.native
  open class Server () extends StObject {
    def this(options: PartialServerConfig) = this()
    
    def app(): Application = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var config: ServerConfig = js.native
    
    def listen(): typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double): typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Double, host: String): typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def listen(port: Unit, host: String): typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    var server: js.UndefOr[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
  }
  
  inline def registerExpressAPI(app: Express, config: PartialConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerExpressAPI")(app.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait APIResponse extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var status: Double
  }
  object APIResponse {
    
    inline def apply(status: Double): APIResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIResponse]
    }
    
    extension [Self <: APIResponse](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      apiNamespace: String,
      port: Double,
      quiet: Boolean,
      recordingSizeLimit: String,
      recordingsDir: String
    ): Config = {
      val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setRecordingSizeLimit(value: String): Self = StObject.set(x, "recordingSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerConfig
    extends StObject
       with Config {
    
    var corsOptions: js.UndefOr[CorsOptions] = js.undefined
  }
  object ServerConfig {
    
    inline def apply(
      apiNamespace: String,
      port: Double,
      quiet: Boolean,
      recordingSizeLimit: String,
      recordingsDir: String
    ): ServerConfig = {
      val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig]
    }
    
    extension [Self <: ServerConfig](x: Self) {
      
      inline def setCorsOptions(value: CorsOptions): Self = StObject.set(x, "corsOptions", value.asInstanceOf[js.Any])
      
      inline def setCorsOptionsUndefined: Self = StObject.set(x, "corsOptions", js.undefined)
    }
  }
}
