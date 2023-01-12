package typings.nodeRed

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.Application
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.nodeRedEditorApi.mod.Auth
import typings.nodeRedEditorClient.mod.NodeInstance
import typings.nodeRedEditorClient.mod.NodeProperties
import typings.nodeRedEditorClient.mod.NodePropertiesDef
import typings.nodeRedEditorClient.mod.NodePropertyDef
import typings.nodeRedEditorClient.mod.RED
import typings.nodeRedEditorClient.mod.WidgetEditableList
import typings.nodeRedEditorClient.mod.WidgetEditableListOptions
import typings.nodeRedEditorClient.mod.WidgetTypedInput
import typings.nodeRedEditorClient.mod.WidgetTypedInputOptions
import typings.nodeRedEditorClient.mod.WidgetTypedInputType
import typings.nodeRedEditorClient.mod.WidgetTypedInputTypeDefinition
import typings.nodeRedRuntime.mod.InternalNodesModule
import typings.nodeRedRuntime.mod.LocalSettings
import typings.nodeRedRuntime.mod.PersistentSettings
import typings.nodeRedRuntime.mod.RuntimeModule
import typings.nodeRedUtil.mod.Hooks
import typings.nodeRedUtil.mod.Log
import typings.nodeRedUtil.mod.Util
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-red", JSImport.Namespace)
  @js.native
  val ^ : NodeRedApp = js.native
  
  type EditorNodeCredential = typings.nodeRedEditorClient.mod.NodeCredential
  
  type EditorNodeCredentials[T] = typings.nodeRedEditorClient.mod.NodeCredentials[T]
  
  /**
    * Node Definition
    * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
    */
  type EditorNodeDef[TProps /* <: EditorNodeProperties */, TCreds, TInstProps /* <: TProps */] = typings.nodeRedEditorClient.mod.NodeDef[TProps, TCreds, TInstProps]
  
  type EditorNodeInstance[TProps /* <: EditorNodeProperties */] = NodeInstance[TProps]
  
  /**
    * Node properties
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodeProperties = NodeProperties
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodePropertiesDef[TProps /* <: EditorNodeProperties */, TInstProps /* <: TProps */] = NodePropertiesDef[TProps, TInstProps]
  
  /********************************************************************
    * Type shortcuts for writing the editor side of nodes (.html file)
    ********************************************************************/
  /**
    * Property definition
    * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
    */
  type EditorNodePropertyDef[TVal, TInstProps /* <: EditorNodeProperties */] = NodePropertyDef[TVal, TInstProps]
  
  /**
    * Type def for the global `RED` in the node .html files.
    * Should be used to access `RED.nodes.registerType` function
    * registering a node with the editor.
    *
    * Example:
    * ```
    * declare const RED: EditorRED;
    *
    * RED.nodes.registerType<
    *   MyNodeProps
    * >("my-node", {
    *   ...
    * })
    * ```
    *
    */
  type EditorRED = RED
  
  type EditorWidgetEditableList = WidgetEditableList
  
  /**
    * WIDGETS
    */
  type EditorWidgetEditableListOptions[T] = WidgetEditableListOptions[T]
  
  type EditorWidgetTypedInput = WidgetTypedInput
  
  type EditorWidgetTypedInputOptions = WidgetTypedInputOptions
  
  type EditorWidgetTypedInputType = WidgetTypedInputType
  
  type EditorWidgetTypedInputTypeDefinition = WidgetTypedInputTypeDefinition
  
  type Node[TCreds /* <: js.Object */] = typings.nodeRedRegistry.mod.Node[TCreds]
  
  type NodeAPI[TSets /* <: NodeAPISettingsWithData */] = typings.nodeRedRegistry.mod.NodeAPI[TSets]
  
  type NodeAPISettingsWithData = typings.nodeRedRegistry.mod.NodeAPISettingsWithData
  
  type NodeConstructor[TNode /* <: Node[TCreds] */, TNodeDef /* <: NodeDef */, TCreds /* <: js.Object */] = typings.nodeRedRegistry.mod.NodeConstructor[TNode, TNodeDef, TCreds]
  
  type NodeContext = typings.nodeRedRegistry.mod.NodeContext
  
  type NodeContextData = typings.nodeRedRegistry.mod.NodeContextData
  
  type NodeCredential = typings.nodeRedRegistry.mod.NodeCredential
  
  type NodeCredentials[TCreds] = typings.nodeRedRegistry.mod.NodeCredentials[TCreds]
  
  type NodeDef = typings.nodeRedRegistry.mod.NodeDef
  
  /*******************************************************************
    * Type shortcuts for writing the runtime side of nodes (.js file)
    *******************************************************************/
  /**
    * Type def for the functions that should be exported
    * by the node .js files.
    */
  type NodeInitializer[TSets /* <: NodeAPISettingsWithData */] = typings.nodeRedRegistry.mod.NodeInitializer[TSets]
  
  type NodeMessage = typings.nodeRedRegistry.mod.NodeMessage
  
  type NodeMessageInFlow = typings.nodeRedRegistry.mod.NodeMessageInFlow
  
  type NodeMessageParts = typings.nodeRedRegistry.mod.NodeMessageParts
  
  trait NodeRedApp extends StObject {
    
    /**
      * The editor authentication api.
      */
    var auth: Auth
    
    /**
      * Runtime events emitter
      */
    var events: EventEmitter
    
    /**
      * Runtime hooks engine
      */
    var hooks: Hooks
    
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(): Application
    /**
      * The express application for the Editor Admin API
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express
    
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(): Application
    /**
      * The express application for HTTP Nodes
      */
    @JSName("httpNode")
    val httpNode_Original: Express
    
    /**
      * Initialise the Node-RED application.
      * @param httpServer - the HTTP server object to use
      * @param userSettings - an object containing the runtime settings
      */
    def init(
      httpServer: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      userSettings: LocalSettings
    ): Unit
    
    /**
      * Logging utilities
      */
    var log: Log
    
    /**
      * This provides access to the internal nodes module of the
      * runtime. The details of this API remain undocumented as they should not
      * be used directly.
      *
      * Most administrative actions should be performed use the runtime api
      * under @node-red/runtime.
      */
    val nodes: InternalNodesModule
    
    /**
      * The runtime api
      */
    var runtime: RuntimeModule
    
    /**
      * The HTTP Server used by the runtime
      */
    val server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]
    
    /**
      * This provides access to the internal settings module of the
      * runtime.
      */
    val settings: PersistentSettings
    
    /**
      * Start the Node-RED application.
      */
    def start(): js.Promise[Unit]
    
    /**
      * Stop the Node-RED application.
      */
    def stop(): js.Promise[Unit]
    
    /**
      * General utilities
      */
    var util: Util
    
    /**
      * Get the version of the runtime
      */
    val version: String
  }
  object NodeRedApp {
    
    inline def apply(
      auth: Auth,
      events: EventEmitter,
      hooks: Hooks,
      httpAdmin: Express,
      httpNode: Express,
      init: (Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ], LocalSettings) => Unit,
      log: Log,
      nodes: InternalNodesModule,
      runtime: RuntimeModule,
      server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      settings: PersistentSettings,
      start: () => js.Promise[Unit],
      stop: () => js.Promise[Unit],
      util: Util,
      version: String
    ): NodeRedApp = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), util = util.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeRedApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeRedApp] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHttpAdmin(value: Express): Self = StObject.set(x, "httpAdmin", value.asInstanceOf[js.Any])
      
      inline def setHttpNode(value: Express): Self = StObject.set(x, "httpNode", value.asInstanceOf[js.Any])
      
      inline def setInit(
        value: (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ], LocalSettings) => Unit
      ): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setLog(value: Log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: InternalNodesModule): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: RuntimeModule): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: PersistentSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setUtil(value: Util): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeSetting[T] = typings.nodeRedRegistry.mod.NodeSetting[T]
  
  type NodeSettings[TSets] = typings.nodeRedRegistry.mod.NodeSettings[TSets]
  
  type NodeStatus = typings.nodeRedRegistry.mod.NodeStatus
  
  type NodeStatusFill = typings.nodeRedRegistry.mod.NodeStatusFill
  
  type NodeStatusShape = typings.nodeRedRegistry.mod.NodeStatusShape
  
  type _To = NodeRedApp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeRedApp = ^
}
