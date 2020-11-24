package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cors.mod.CorsOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpsMod.ServerOptions
import typings.nodeRedRuntime.anon.Authenticate
import typings.nodeRedRuntime.anon.Console
import typings.nodeRedRuntime.anon.Default
import typings.nodeRedRuntime.anon.DeployButton
import typings.nodeRedRuntime.anon.Module
import typings.nodeRedRuntime.anon.Origin
import typings.nodeRedRuntime.anon.Pass
import typings.nodeRedRuntime.anon.Path
import typings.nodeRedRuntime.anon.Strategy
import typings.nodeRedRuntime.nodeRedRuntimeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalSettings extends js.Object {
  
  /**
    * For password protected Node-RED editor and admin API, the property
    * contains the auth data.
    *
    * See http://nodered.org/docs/security.html for details.
    */
  var adminAuth: js.UndefOr[Default | Authenticate | Strategy] = js.native
  
  /**
    * The maximum size of HTTP request that will be accepted by the runtime api.
    */
  var apiMaxLength: js.UndefOr[String] = js.native
  
  /**
    * Context Storage
    * The following property can be used to enable context storage. The configuration
    * provided here will enable file-based context that flushes to disk every 30 seconds.
    * Refer to the documentation for further options: https://nodered.org/docs/api/context/
    */
  var contextStorage: js.UndefOr[StringDictionary[String | Module]] = js.native
  
  /**
    * By default, credentials are encrypted in storage using a generated key. To
    * specify your own secret, set the following property.
    * If you want to disable encryption of credentials, set this property to false.
    * Note: once you set this property, do not change it - doing so will prevent
    * node-red from being able to decrypt your existing credentials and they will be
    * lost.
    */
  var credentialSecret: js.UndefOr[String | `false`] = js.native
  
  /**
    * The maximum length, in characters, of any message sent to the debug sidebar tab
    */
  var debugMaxLength: js.UndefOr[Double] = js.native
  
  /**
    * Colourise the console output of the debug node
    */
  var debugUseColors: js.UndefOr[Boolean] = js.native
  
  /**
    * Editor disabled.
    */
  var disableEditor: js.UndefOr[Boolean] = js.native
  
  /**
    * Customising the editor
    */
  var editorTheme: js.UndefOr[DeployButton] = js.native
  
  /**
    * `global.keys()` returns a list of all properties set in global context.
    * This allows them to be displayed in the Context Sidebar within the editor.
    * In some circumstances it is not desirable to expose them to the editor. The
    * following property can be used to hide any property set in `functionGlobalContext`
    * from being list by `global.keys()`.
    * By default, the property is set to false to avoid accidental exposure of
    * their values. Setting this to true will cause the keys to be listed.
    */
  var exportGlobalContextKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * The file containing the flows. If not set, it defaults to flows_<hostname>.json
    */
  var flowFile: js.UndefOr[String] = js.native
  
  /**
    * To enabled pretty-printing of the flow within the flow file, set the property to true
    */
  var flowFilePretty: js.UndefOr[Boolean] = js.native
  
  /**
    * The following property can be used to seed Global Context with predefined
    * values. This allows extra node modules to be made available with the
    * Function node.
    * For example,
    *    functionGlobalContext: { os:require('os') }
    * can be accessed in a function block as:
    *    global.get("os")
    */
  var functionGlobalContext: js.UndefOr[js.Object] = js.native
  
  /**
    * By default, the Node-RED UI is available at http://localhost:1880/
    * The following property can be used to specify a different root path.
    * If set to false, this is disabled.
    */
  var httpAdminRoot: js.UndefOr[String | `false`] = js.native
  
  /**
    * For password protected node-defined HTTP endpoints (httpNodeRoot),
    * contains the auth data.
    *
    * The pass field is a bcrypt hash of the password.
    * See http://nodered.org/docs/security.html#generating-the-password-hash
    */
  var httpNodeAuth: js.UndefOr[Pass] = js.native
  
  /**
    * The following property can be used to configure cross-origin resource sharing
    * in the HTTP nodes.
    */
  var httpNodeCors: js.UndefOr[CorsOptions] = js.native
  
  /**
    * The following property can be used to add a custom middleware function
    * in front of all http in nodes. This allows custom authentication to be
    * applied to all http in nodes, or any other sort of common request processing.
    */
  var httpNodeMiddleware: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.native
  
  /**
    * Some nodes, such as HTTP In, can be used to listen for incoming http requests.
    * By default, these are served relative to '/'. The following property
    * can be used to specifiy a different root path. If set to false, this is
    * disabled.
    */
  var httpNodeRoot: js.UndefOr[String | `false`] = js.native
  
  /**
    * Timeout in milliseconds for HTTP request connections
    */
  var httpRequestTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The following property can be used in place of 'httpAdminRoot' and 'httpNodeRoot',
    * to apply the same root to both parts.
    */
  var httpRoot: js.UndefOr[String | `false`] = js.native
  
  /**
    * The following property can be used to pass custom options to the Express.js
    * server used by Node-RED. For a full list of available options, refer
    * to http://expressjs.com/en/api.html#app.settings.table
    */
  var httpServerOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * When httpAdminRoot is used to move the UI to a different root path, the
    * following property is used to identify a directory of static content
    * that should be served at http://localhost:1880/.
    */
  var httpStatic: js.UndefOr[String] = js.native
  
  /**
    * For password protected static content (httpStatic), contains the auth data.
    *
    * The pass field is a bcrypt hash of the password.
    * See http://nodered.org/docs/security.html#generating-the-password-hash
    */
  var httpStaticAuth: js.UndefOr[Pass] = js.native
  
  /**
    * HTTPS options
    */
  var https: js.UndefOr[ServerOptions] = js.native
  
  /**
    * Configure the logging output
    */
  var logging: js.UndefOr[Console] = js.native
  
  /**
    * Retry time in milliseconds for MQTT connections
    */
  var mqttReconnectTime: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of messages nodes will buffer internally as part of their
    * operation. This applies across a range of nodes that operate on message sequences.
    */
  var nodeMessageBufferMaxLength: js.UndefOr[Double] = js.native
  
  /**
    * Node-RED scans the `nodes` directory in the userDir to find local node files.
    * The following property can be used to specify an additional directory to scan.
    */
  var nodesDir: js.UndefOr[String] = js.native
  
  /**
    * The following property can be used to order the categories in the editor
    * palette. If a node's category is not in the list, the category will get
    * added to the end of the palette.
    * If not set, the following default order is used:
    * paletteCategories: ['subflows','flow','input','output','function','parser','social','mobile','storage','analysis','advanced'],
    */
  var paletteCategories: js.UndefOr[js.Array[String]] = js.native
  
  var safeMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Retry time in milliseconds for Serial port connections
    */
  var serialReconnectTime: js.UndefOr[Double] = js.native
  
  /**
    * Retry time in milliseconds for TCP socket connections
    */
  var socketReconnectTime: js.UndefOr[Double] = js.native
  
  /**
    * Timeout in milliseconds for TCP server socket connections
    */
  var socketTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of messages to wait in queue while attempting to connect to TCP socket
    */
  var tcpMsgQueueSize: js.UndefOr[Double] = js.native
  
  /**
    * To disable the option for using local files for storing keys and certificates in the TLS configuration
    * node, set this to true
    */
  var tlsConfigDisableLocalFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * If you installed the optional node-red-dashboard, the property contains its
    * path relative to httpRoot
    */
  var ui: js.UndefOr[Path] = js.native
  
  /**
    * Interfaces Node-RED UI accepts connections on
    */
  var uiHost: String = js.native
  
  /**
    * the tcp port that the Node-RED web server is listening on
    */
  var uiPort: Double = js.native
  
  /**
    * By default, all user data is stored in a directory called `.node-red` under
    * the user's home directory. To use a different location, the following
    * property can be used
    */
  var userDir: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  /**
    * The following property can be used to verify websocket connection attempts.
    * This allows, for example, the HTTP request headers to be checked to ensure
    * they include valid authentication information.
    */
  var webSocketNodeVerifyClient: js.UndefOr[
    (js.Function1[/* info */ Origin, Boolean]) | (js.Function2[
      /* info */ Origin, 
      /* callback */ js.Function3[
        /* result */ Boolean, 
        /* code */ js.UndefOr[String], 
        /* reason */ js.UndefOr[String], 
        Unit
      ], 
      Unit
    ])
  ] = js.native
}
object LocalSettings {
  
  @scala.inline
  def apply(uiHost: String, uiPort: Double): LocalSettings = {
    val __obj = js.Dynamic.literal(uiHost = uiHost.asInstanceOf[js.Any], uiPort = uiPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSettings]
  }
  
  @scala.inline
  implicit class LocalSettingsOps[Self <: LocalSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUiHost(value: String): Self = this.set("uiHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiPort(value: Double): Self = this.set("uiPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminAuth(value: Default | Authenticate | Strategy): Self = this.set("adminAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminAuth: Self = this.set("adminAuth", js.undefined)
    
    @scala.inline
    def setApiMaxLength(value: String): Self = this.set("apiMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMaxLength: Self = this.set("apiMaxLength", js.undefined)
    
    @scala.inline
    def setContextStorage(value: StringDictionary[String | Module]): Self = this.set("contextStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextStorage: Self = this.set("contextStorage", js.undefined)
    
    @scala.inline
    def setCredentialSecret(value: String | `false`): Self = this.set("credentialSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialSecret: Self = this.set("credentialSecret", js.undefined)
    
    @scala.inline
    def setDebugMaxLength(value: Double): Self = this.set("debugMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMaxLength: Self = this.set("debugMaxLength", js.undefined)
    
    @scala.inline
    def setDebugUseColors(value: Boolean): Self = this.set("debugUseColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugUseColors: Self = this.set("debugUseColors", js.undefined)
    
    @scala.inline
    def setDisableEditor(value: Boolean): Self = this.set("disableEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEditor: Self = this.set("disableEditor", js.undefined)
    
    @scala.inline
    def setEditorTheme(value: DeployButton): Self = this.set("editorTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorTheme: Self = this.set("editorTheme", js.undefined)
    
    @scala.inline
    def setExportGlobalContextKeys(value: Boolean): Self = this.set("exportGlobalContextKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportGlobalContextKeys: Self = this.set("exportGlobalContextKeys", js.undefined)
    
    @scala.inline
    def setFlowFile(value: String): Self = this.set("flowFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowFile: Self = this.set("flowFile", js.undefined)
    
    @scala.inline
    def setFlowFilePretty(value: Boolean): Self = this.set("flowFilePretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowFilePretty: Self = this.set("flowFilePretty", js.undefined)
    
    @scala.inline
    def setFunctionGlobalContext(value: js.Object): Self = this.set("functionGlobalContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionGlobalContext: Self = this.set("functionGlobalContext", js.undefined)
    
    @scala.inline
    def setHttpAdminRoot(value: String | `false`): Self = this.set("httpAdminRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpAdminRoot: Self = this.set("httpAdminRoot", js.undefined)
    
    @scala.inline
    def setHttpNodeAuth(value: Pass): Self = this.set("httpNodeAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpNodeAuth: Self = this.set("httpNodeAuth", js.undefined)
    
    @scala.inline
    def setHttpNodeCors(value: CorsOptions): Self = this.set("httpNodeCors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpNodeCors: Self = this.set("httpNodeCors", js.undefined)
    
    @scala.inline
    def setHttpNodeMiddleware(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
    ): Self = this.set("httpNodeMiddleware", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHttpNodeMiddleware: Self = this.set("httpNodeMiddleware", js.undefined)
    
    @scala.inline
    def setHttpNodeRoot(value: String | `false`): Self = this.set("httpNodeRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpNodeRoot: Self = this.set("httpNodeRoot", js.undefined)
    
    @scala.inline
    def setHttpRequestTimeout(value: Double): Self = this.set("httpRequestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRequestTimeout: Self = this.set("httpRequestTimeout", js.undefined)
    
    @scala.inline
    def setHttpRoot(value: String | `false`): Self = this.set("httpRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRoot: Self = this.set("httpRoot", js.undefined)
    
    @scala.inline
    def setHttpServerOptions(value: js.Object): Self = this.set("httpServerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpServerOptions: Self = this.set("httpServerOptions", js.undefined)
    
    @scala.inline
    def setHttpStatic(value: String): Self = this.set("httpStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatic: Self = this.set("httpStatic", js.undefined)
    
    @scala.inline
    def setHttpStaticAuth(value: Pass): Self = this.set("httpStaticAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStaticAuth: Self = this.set("httpStaticAuth", js.undefined)
    
    @scala.inline
    def setHttps(value: ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setLogging(value: Console): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMqttReconnectTime(value: Double): Self = this.set("mqttReconnectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMqttReconnectTime: Self = this.set("mqttReconnectTime", js.undefined)
    
    @scala.inline
    def setNodeMessageBufferMaxLength(value: Double): Self = this.set("nodeMessageBufferMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeMessageBufferMaxLength: Self = this.set("nodeMessageBufferMaxLength", js.undefined)
    
    @scala.inline
    def setNodesDir(value: String): Self = this.set("nodesDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodesDir: Self = this.set("nodesDir", js.undefined)
    
    @scala.inline
    def setPaletteCategoriesVarargs(value: String*): Self = this.set("paletteCategories", js.Array(value :_*))
    
    @scala.inline
    def setPaletteCategories(value: js.Array[String]): Self = this.set("paletteCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteCategories: Self = this.set("paletteCategories", js.undefined)
    
    @scala.inline
    def setSafeMode(value: Boolean): Self = this.set("safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeMode: Self = this.set("safeMode", js.undefined)
    
    @scala.inline
    def setSerialReconnectTime(value: Double): Self = this.set("serialReconnectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialReconnectTime: Self = this.set("serialReconnectTime", js.undefined)
    
    @scala.inline
    def setSocketReconnectTime(value: Double): Self = this.set("socketReconnectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketReconnectTime: Self = this.set("socketReconnectTime", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    
    @scala.inline
    def setTcpMsgQueueSize(value: Double): Self = this.set("tcpMsgQueueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpMsgQueueSize: Self = this.set("tcpMsgQueueSize", js.undefined)
    
    @scala.inline
    def setTlsConfigDisableLocalFiles(value: Boolean): Self = this.set("tlsConfigDisableLocalFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsConfigDisableLocalFiles: Self = this.set("tlsConfigDisableLocalFiles", js.undefined)
    
    @scala.inline
    def setUi(value: Path): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    
    @scala.inline
    def setUserDir(value: String): Self = this.set("userDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDir: Self = this.set("userDir", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWebSocketNodeVerifyClientFunction2(
      value: (/* info */ Origin, /* callback */ js.Function3[
          /* result */ Boolean, 
          /* code */ js.UndefOr[String], 
          /* reason */ js.UndefOr[String], 
          Unit
        ]) => Unit
    ): Self = this.set("webSocketNodeVerifyClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWebSocketNodeVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = this.set("webSocketNodeVerifyClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebSocketNodeVerifyClient(
      value: (js.Function1[/* info */ Origin, Boolean]) | (js.Function2[
          /* info */ Origin, 
          /* callback */ js.Function3[
            /* result */ Boolean, 
            /* code */ js.UndefOr[String], 
            /* reason */ js.UndefOr[String], 
            Unit
          ], 
          Unit
        ])
    ): Self = this.set("webSocketNodeVerifyClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebSocketNodeVerifyClient: Self = this.set("webSocketNodeVerifyClient", js.undefined)
  }
}
