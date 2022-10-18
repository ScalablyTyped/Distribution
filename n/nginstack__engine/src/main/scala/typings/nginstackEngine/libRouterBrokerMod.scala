package typings.nginstackEngine

import typings.nginstackEngine.anon.Action
import typings.nginstackEngine.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterBrokerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/Broker", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Broker
  @JSImport("@nginstack/engine/lib/router/Broker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Broker = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Broker]
  
  inline def runStartupScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runStartupScripts")().asInstanceOf[Unit]
  
  @js.native
  trait Broker extends StObject {
    
    /* private */ var authorizationHandlers_ : Any = js.native
    
    def authorizeUser(request: Request, route: Path): Unit = js.native
    
    def clear(): Unit = js.native
    
    def clearIncludeCaches(): Unit = js.native
    
    /* private */ var configureAllowOriginHeader_ : Any = js.native
    
    /* private */ var controllerCache_ : Any = js.native
    
    /* private */ var errorLoadingConfig_ : Any = js.native
    
    /* private */ var getControllerInstance_ : Any = js.native
    
    def getModuleVersion_(path: Any): Any = js.native
    
    /* private */ var getRealmConfig_ : Any = js.native
    
    def handleRequest(route: Action, pathParameters: Any): Unit = js.native
    def handleRequest(route: Action, pathParameters: Any, opt_options: typings.nginstackEngine.anon.Request): Unit = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var realmConfigCache_ : Any = js.native
    
    /* private */ var resolveParameters_ : Any = js.native
    
    /* private */ var resolveType_ : Any = js.native
    
    def runStartupScripts(): Unit = js.native
    
    /* private */ var serverId_ : Any = js.native
    
    /* private */ var userCanAccessRemotely_ : Any = js.native
    
    /* private */ var validateAcceptHeader_ : Any = js.native
    
    /* private */ var validateScope_ : Any = js.native
    
    /* private */ var vfsForCheckChange_ : Any = js.native
  }
  
  type Request = typings.nginstackEngine.libHttpRequestMod.^
  
  type Response = typings.nginstackEngine.libHttpResponseMod.^
}
