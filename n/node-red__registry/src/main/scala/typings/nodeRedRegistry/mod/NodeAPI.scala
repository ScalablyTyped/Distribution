package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.Application
import typings.node.eventsMod.EventEmitter
import typings.node.httpsMod.Server
import typings.node.nodeHttpMod.IncomingMessage
import typings.node.nodeHttpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Runtime API provided to nodes by Node Registry
  */
trait NodeAPI[TSets /* <: NodeAPISettingsWithData */] extends StObject {
  
  @JSName("_")
  var _underscore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ Any
  
  var auth: NodeAPIAuth
  
  var comms: NodeAPIComms
  
  var events: EventEmitter
  
  var hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Hooks */ Any
  
  def httpAdmin(): Application
  @JSName("httpAdmin")
  val httpAdmin_Original: Express
  
  def httpNode(): Application
  @JSName("httpNode")
  val httpNode_Original: Express
  
  var library: NodeAPILibrary
  
  var log: NodeApiLog
  
  var nodes: NodeAPINodes
  
  def require(id: String): Any
  
  val server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ]
  
  var settings: TSets
  
  var util: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ Any
  
  def version(): js.Promise[String]
}
object NodeAPI {
  
  inline def apply[TSets /* <: NodeAPISettingsWithData */](
    _underscore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ Any,
    auth: NodeAPIAuth,
    comms: NodeAPIComms,
    events: EventEmitter,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Hooks */ Any,
    httpAdmin: Express,
    httpNode: Express,
    library: NodeAPILibrary,
    log: NodeApiLog,
    nodes: NodeAPINodes,
    require: String => Any,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ],
    settings: TSets,
    util: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ Any,
    version: () => js.Promise[String]
  ): NodeAPI[TSets] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], comms = comms.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAPI[TSets]]
  }
  
  extension [Self <: NodeAPI[?], TSets /* <: NodeAPISettingsWithData */](x: Self & NodeAPI[TSets]) {
    
    inline def setAuth(value: NodeAPIAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setComms(value: NodeAPIComms): Self = StObject.set(x, "comms", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setHooks(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Hooks */ Any
    ): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
    
    inline def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
    
    inline def setLibrary(value: NodeAPILibrary): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLog(value: NodeApiLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NodeAPINodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setRequire(value: String => Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: TSets): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setUtil(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ Any
    ): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: () => js.Promise[String]): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    inline def set_underscore(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ Any
    ): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
