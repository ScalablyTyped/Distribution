package typings.nodeRedRegistry.mod

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.Server
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Runtime API provided to nodes by Node Registry
  */
trait NodeAPI[TSets /* <: NodeAPISettingsWithData */] extends StObject {
  
  @JSName("_")
  var _underscore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ js.Any
  
  var auth: NodeAPIAuth
  
  var comms: NodeAPIComms
  
  var events: EventEmitter
  
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
  
  var library: NodeAPILibrary
  
  var log: NodeApiLog
  
  var nodes: NodeAPINodes
  
  def require(id: String): js.Any
  
  val server: Server
  
  var settings: TSets
  
  var util: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ js.Any
  
  def version(): js.Promise[String]
}
object NodeAPI {
  
  inline def apply[TSets /* <: NodeAPISettingsWithData */](
    _underscore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ js.Any,
    auth: NodeAPIAuth,
    comms: NodeAPIComms,
    events: EventEmitter,
    httpAdmin: Express,
    httpNode: Express,
    library: NodeAPILibrary,
    log: NodeApiLog,
    nodes: NodeAPINodes,
    require: String => js.Any,
    server: Server,
    settings: TSets,
    util: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ js.Any,
    version: () => js.Promise[String]
  ): NodeAPI[TSets] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], comms = comms.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAPI[TSets]]
  }
  
  extension [Self <: NodeAPI[?], TSets /* <: NodeAPISettingsWithData */](x: Self & NodeAPI[TSets]) {
    
    inline def setAuth(value: NodeAPIAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setComms(value: NodeAPIComms): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
    
    inline def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: NodeAPILibrary): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLog(value: NodeApiLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NodeAPINodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setRequire(value: String => js.Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: TSets): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setUtil(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ js.Any
    ): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: () => js.Promise[String]): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    inline def set_underscore(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ js.Any
    ): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
