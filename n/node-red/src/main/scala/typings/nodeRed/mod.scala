package typings.nodeRed

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
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
import typings.nodeRedUtil.mod.Log
import typings.nodeRedUtil.mod.Util
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  type NodeConstructor[TNode /* <: Node[TCreds] */, TNodeDef /* <: NodeDef */, TCreds] = typings.nodeRedRegistry.mod.NodeConstructor[TNode, TNodeDef, TCreds]
  
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
  
  @js.native
  trait NodeRedApp extends StObject {
    
    /**
      * The editor authentication api.
      */
    var auth: Auth = js.native
    
    /**
      * Runtime events emitter
      */
    var events: EventEmitter = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    /**
      * The express application for the Editor Admin API
      */
    def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    /**
      * The express application for the Editor Admin API
      */
    @JSName("httpAdmin")
    val httpAdmin_Original: Express = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    /**
      * The express application for HTTP Nodes
      */
    def httpNode(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    /**
      * The express application for HTTP Nodes
      */
    @JSName("httpNode")
    val httpNode_Original: Express = js.native
    
    /**
      * Initialise the Node-RED application.
      * @param httpServer - the HTTP server object to use
      * @param userSettings - an object containing the runtime settings
      */
    def init(httpServer: Server, userSettings: LocalSettings): Unit = js.native
    
    /**
      * Logging utilities
      */
    var log: Log = js.native
    
    /**
      * This provides access to the internal nodes module of the
      * runtime. The details of this API remain undocumented as they should not
      * be used directly.
      *
      * Most administrative actions should be performed use the runtime api
      * under @node-red/runtime.
      */
    val nodes: InternalNodesModule = js.native
    
    /**
      * The runtime api
      */
    var runtime: RuntimeModule = js.native
    
    /**
      * The HTTP Server used by the runtime
      */
    val server: Server = js.native
    
    /**
      * This provides access to the internal settings module of the
      * runtime.
      */
    val settings: PersistentSettings = js.native
    
    /**
      * Start the Node-RED application.
      */
    def start(): js.Promise[Unit] = js.native
    
    /**
      * Stop the Node-RED application.
      */
    def stop(): js.Promise[Unit] = js.native
    
    /**
      * General utilities
      */
    var util: Util = js.native
    
    /**
      * Get the version of the runtime
      */
    val version: String = js.native
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
