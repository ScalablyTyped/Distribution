package typings.nodeRedEditorApi

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Express
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.Server
import typings.nodeRedRuntime.mod.LocalSettings
import typings.nodeRedRuntime.mod.RuntimeModule
import typings.nodeRedRuntime.mod.StorageModule
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@node-red/editor-api", JSImport.Namespace)
  @js.native
  val ^ : EditorAPIModule = js.native
  
  trait Auth extends StObject {
    
    def needsPermission(permission: String): js.Function3[
        /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
        /* res */ Response_[js.Any], 
        /* next */ NextFunction, 
        Unit
      ]
  }
  object Auth {
    
    inline def apply(
      needsPermission: String => js.Function3[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* res */ Response_[js.Any], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Auth = {
      val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setNeedsPermission(
        value: String => js.Function3[
              /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
              /* res */ Response_[js.Any], 
              /* next */ NextFunction, 
              Unit
            ]
      ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
    }
  }
  
  trait EditorAPIModule extends StObject {
    
    var auth: Auth
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    /**
      * The Express app used to serve the Node-RED Editor
      */
    def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any
    /**
      * The Express app used to serve the Node-RED Editor
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express
    
    /**
      * Initialise the module.
      * @param  settings   The runtime settings
      * @param  _server    An instance of HTTP Server
      * @param  storage    An instance of Node-RED Storage
      * @param  runtimeAPI An instance of Node-RED Runtime
      */
    def init(settings: LocalSettings, _server: Server, storage: StorageModule, runtimeAPI: RuntimeModule): Unit
    
    /**
      * Start the module.
      */
    def start(): js.Promise[Unit]
    
    /**
      * Stop the module.
      */
    def stop(): js.Promise[Unit]
  }
  object EditorAPIModule {
    
    inline def apply(
      auth: Auth,
      httpAdmin: Express,
      init: (LocalSettings, Server, StorageModule, RuntimeModule) => Unit,
      start: () => js.Promise[Unit],
      stop: () => js.Promise[Unit]
    ): EditorAPIModule = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], init = js.Any.fromFunction4(init), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[EditorAPIModule]
    }
    
    extension [Self <: EditorAPIModule](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
      
      inline def setInit(value: (LocalSettings, Server, StorageModule, RuntimeModule) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction4(value))
      
      inline def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type _To = EditorAPIModule
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EditorAPIModule = ^
}
