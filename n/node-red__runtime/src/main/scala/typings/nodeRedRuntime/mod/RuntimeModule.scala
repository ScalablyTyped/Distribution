package typings.nodeRedRuntime.mod

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.Server
import typings.nodeRedUtil.mod.Util
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeModule extends StObject {
  
  @JSName("_")
  var _underscore: InternalRuntimeAPI
  
  var comms: CommsModule
  
  var context: ContextModule
  
  var events: EventEmitter
  
  var flows: FlowsModule
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpAdmin(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
  def httpAdmin(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
  def httpAdmin(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
  def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any
  @JSName("httpAdmin")
  val httpAdmin_Original: Express
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpNode(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
  def httpNode(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
  def httpNode(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
  def httpNode(req: IncomingMessage, res: ServerResponse): js.Any
  @JSName("httpNode")
  val httpNode_Original: Express
  
  /**
    * Initialise the runtime module.
    * @param settings - the runtime settings object
    * @param server - the http server instance for the server to use
    * @param adminApi - an instance of @node-red/editor-api
    */
  def init(
    userSettings: LocalSettings,
    httpServer: Server,
    _adminApi: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ js.Any
  ): Unit
  
  /**
    * Returns whether the runtime is started
    */
  def isStarted(): js.Promise[Boolean]
  
  var library: LibraryModule
  
  var nodes: NodesModule
  
  var projects: ProjectsModule
  
  val server: Server
  
  var settings: SettingsModule
  
  /**
    * Start the runtime. Resolves when the runtime is started. This does not
    *   mean the flows will be running as they are started asynchronously.
    */
  def start(): js.Promise[Unit]
  
  /**
    * Stops the runtime. Resolves when the runtime is stopped.
    */
  def stop(): js.Promise[Unit]
  
  var storage: StorageModule
  
  var util: Util
  
  /**
    * Returns version number of the runtime
    */
  def version(): js.Promise[String]
}
object RuntimeModule {
  
  @scala.inline
  def apply(
    _underscore: InternalRuntimeAPI,
    comms: CommsModule,
    context: ContextModule,
    events: EventEmitter,
    flows: FlowsModule,
    httpAdmin: Express,
    httpNode: Express,
    init: (LocalSettings, Server, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ js.Any) => Unit,
    isStarted: () => js.Promise[Boolean],
    library: LibraryModule,
    nodes: NodesModule,
    projects: ProjectsModule,
    server: Server,
    settings: SettingsModule,
    start: () => js.Promise[Unit],
    stop: () => js.Promise[Unit],
    storage: StorageModule,
    util: Util,
    version: () => js.Promise[String]
  ): RuntimeModule = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], flows = flows.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], init = js.Any.fromFunction3(init), isStarted = js.Any.fromFunction0(isStarted), library = library.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), storage = storage.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeModule]
  }
  
  @scala.inline
  implicit class RuntimeModuleMutableBuilder[Self <: RuntimeModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComms(value: CommsModule): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: ContextModule): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlows(value: FlowsModule): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(
      value: (LocalSettings, Server, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorAPIModule */ js.Any) => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsStarted(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLibrary(value: LibraryModule): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: NodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjects(value: ProjectsModule): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: SettingsModule): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStorage(value: StorageModule): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: () => js.Promise[String]): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_underscore(value: InternalRuntimeAPI): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
