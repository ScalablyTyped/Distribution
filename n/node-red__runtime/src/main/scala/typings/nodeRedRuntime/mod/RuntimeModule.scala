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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeModule extends js.Object {
  
  @JSName("_")
  var _underscore: InternalRuntimeAPI = js.native
  
  var comms: CommsModule = js.native
  
  var context: ContextModule = js.native
  
  var events: EventEmitter = js.native
  
  var flows: FlowsModule = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("httpAdmin")
  val httpAdmin_Original: Express = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def httpNode(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def httpNode(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("httpNode")
  val httpNode_Original: Express = js.native
  
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
  ): Unit = js.native
  
  /**
    * Returns whether the runtime is started
    */
  def isStarted(): js.Promise[Boolean] = js.native
  
  var library: LibraryModule = js.native
  
  var nodes: NodesModule = js.native
  
  var projects: ProjectsModule = js.native
  
  val server: Server = js.native
  
  var settings: SettingsModule = js.native
  
  /**
    * Start the runtime. Resolves when the runtime is started. This does not
    *   mean the flows will be running as they are started asynchronously.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stops the runtime. Resolves when the runtime is stopped.
    */
  def stop(): js.Promise[Unit] = js.native
  
  var storage: StorageModule = js.native
  
  var util: Util = js.native
  
  /**
    * Returns version number of the runtime
    */
  def version(): js.Promise[String] = js.native
}
