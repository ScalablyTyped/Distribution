package typings.nodeRedRuntime.mod

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.Server
import typings.nodeRedUtil.mod.I18n
import typings.nodeRedUtil.mod.Log
import typings.nodeRedUtil.mod.Util
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:no-empty-interface
trait InternalRuntimeAPI extends StObject {
  
  val adminApi: js.Object
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def adminApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
  def adminApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
  def adminApp(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
  def adminApp(req: IncomingMessage, res: ServerResponse): js.Any
  @JSName("adminApp")
  val adminApp_Original: Express
  
  var events: EventEmitter
  
  var exec: InternalExecModule
  
  val i18n: I18n
  
  def isStarted(): Boolean
  
  var library: InternalLibraryModule
  
  val log: Log
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def nodeApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
  def nodeApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
  def nodeApp(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
  def nodeApp(req: IncomingMessage, res: ServerResponse): js.Any
  @JSName("nodeApp")
  val nodeApp_Original: Express
  
  var nodes: InternalNodesModule
  
  val server: Server
  
  var settings: PersistentSettings
  
  var storage: StorageModule
  
  var util: Util
  
  def version(): String
}
object InternalRuntimeAPI {
  
  @scala.inline
  def apply(
    adminApi: js.Object,
    adminApp: Express,
    events: EventEmitter,
    exec: InternalExecModule,
    i18n: I18n,
    isStarted: () => Boolean,
    library: InternalLibraryModule,
    log: Log,
    nodeApp: Express,
    nodes: InternalNodesModule,
    server: Server,
    settings: PersistentSettings,
    storage: StorageModule,
    util: Util,
    version: () => String
  ): InternalRuntimeAPI = {
    val __obj = js.Dynamic.literal(adminApi = adminApi.asInstanceOf[js.Any], adminApp = adminApp.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isStarted = js.Any.fromFunction0(isStarted), library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodeApp = nodeApp.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[InternalRuntimeAPI]
  }
  
  @scala.inline
  implicit class InternalRuntimeAPIMutableBuilder[Self <: InternalRuntimeAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminApi(value: js.Object): Self = StObject.set(x, "adminApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminApp(value: Express): Self = StObject.set(x, "adminApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExec(value: InternalExecModule): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n(value: I18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStarted(value: () => Boolean): Self = StObject.set(x, "isStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLibrary(value: InternalLibraryModule): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeApp(value: Express): Self = StObject.set(x, "nodeApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: InternalNodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: PersistentSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: StorageModule): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: () => String): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
  }
}
