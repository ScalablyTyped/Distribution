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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:no-empty-interface
@js.native
trait InternalRuntimeAPI extends StObject {
  
  val adminApi: js.Object = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def adminApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def adminApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def adminApp(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def adminApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("adminApp")
  val adminApp_Original: Express = js.native
  
  var events: EventEmitter = js.native
  
  var exec: InternalExecModule = js.native
  
  val i18n: I18n = js.native
  
  def isStarted(): Boolean = js.native
  
  var library: InternalLibraryModule = js.native
  
  val log: Log = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def nodeApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def nodeApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def nodeApp(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def nodeApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("nodeApp")
  val nodeApp_Original: Express = js.native
  
  var nodes: InternalNodesModule = js.native
  
  val server: Server = js.native
  
  var settings: PersistentSettings = js.native
  
  var storage: StorageModule = js.native
  
  var util: Util = js.native
  
  def version(): String = js.native
}
