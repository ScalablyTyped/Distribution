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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSettings extends StObject {
  
  /**
    * For password protected Node-RED editor and admin API, the property
    * contains the auth data.
    *
    * See http://nodered.org/docs/security.html for details.
    */
  var adminAuth: js.UndefOr[Default | Authenticate | Strategy] = js.undefined
  
  /**
    * The maximum size of HTTP request that will be accepted by the runtime api.
    */
  var apiMaxLength: js.UndefOr[String] = js.undefined
  
  /**
    * Context Storage
    * The following property can be used to enable context storage. The configuration
    * provided here will enable file-based context that flushes to disk every 30 seconds.
    * Refer to the documentation for further options: https://nodered.org/docs/api/context/
    */
  var contextStorage: js.UndefOr[StringDictionary[String | Module]] = js.undefined
  
  /**
    * By default, credentials are encrypted in storage using a generated key. To
    * specify your own secret, set the following property.
    * If you want to disable encryption of credentials, set this property to false.
    * Note: once you set this property, do not change it - doing so will prevent
    * node-red from being able to decrypt your existing credentials and they will be
    * lost.
    */
  var credentialSecret: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * The maximum length, in characters, of any message sent to the debug sidebar tab
    */
  var debugMaxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Colourise the console output of the debug node
    */
  var debugUseColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Editor disabled.
    */
  var disableEditor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customising the editor
    */
  var editorTheme: js.UndefOr[DeployButton] = js.undefined
  
  /**
    * `global.keys()` returns a list of all properties set in global context.
    * This allows them to be displayed in the Context Sidebar within the editor.
    * In some circumstances it is not desirable to expose them to the editor. The
    * following property can be used to hide any property set in `functionGlobalContext`
    * from being list by `global.keys()`.
    * By default, the property is set to false to avoid accidental exposure of
    * their values. Setting this to true will cause the keys to be listed.
    */
  var exportGlobalContextKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file containing the flows. If not set, it defaults to flows_<hostname>.json
    */
  var flowFile: js.UndefOr[String] = js.undefined
  
  /**
    * To enabled pretty-printing of the flow within the flow file, set the property to true
    */
  var flowFilePretty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The following property can be used to seed Global Context with predefined
    * values. This allows extra node modules to be made available with the
    * Function node.
    * For example,
    *    functionGlobalContext: { os:require('os') }
    * can be accessed in a function block as:
    *    global.get("os")
    */
  var functionGlobalContext: js.UndefOr[js.Object] = js.undefined
  
  /**
    * By default, the Node-RED UI is available at http://localhost:1880/
    * The following property can be used to specify a different root path.
    * If set to false, this is disabled.
    */
  var httpAdminRoot: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * For password protected node-defined HTTP endpoints (httpNodeRoot),
    * contains the auth data.
    *
    * The pass field is a bcrypt hash of the password.
    * See http://nodered.org/docs/security.html#generating-the-password-hash
    */
  var httpNodeAuth: js.UndefOr[Pass] = js.undefined
  
  /**
    * The following property can be used to configure cross-origin resource sharing
    * in the HTTP nodes.
    */
  var httpNodeCors: js.UndefOr[CorsOptions] = js.undefined
  
  /**
    * The following property can be used to add a custom middleware function
    * in front of all http in nodes. This allows custom authentication to be
    * applied to all http in nodes, or any other sort of common request processing.
    */
  var httpNodeMiddleware: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Some nodes, such as HTTP In, can be used to listen for incoming http requests.
    * By default, these are served relative to '/'. The following property
    * can be used to specifiy a different root path. If set to false, this is
    * disabled.
    */
  var httpNodeRoot: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * Timeout in milliseconds for HTTP request connections
    */
  var httpRequestTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The following property can be used in place of 'httpAdminRoot' and 'httpNodeRoot',
    * to apply the same root to both parts.
    */
  var httpRoot: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * The following property can be used to pass custom options to the Express.js
    * server used by Node-RED. For a full list of available options, refer
    * to http://expressjs.com/en/api.html#app.settings.table
    */
  var httpServerOptions: js.UndefOr[js.Object] = js.undefined
  
  /**
    * When httpAdminRoot is used to move the UI to a different root path, the
    * following property is used to identify a directory of static content
    * that should be served at http://localhost:1880/.
    */
  var httpStatic: js.UndefOr[String] = js.undefined
  
  /**
    * For password protected static content (httpStatic), contains the auth data.
    *
    * The pass field is a bcrypt hash of the password.
    * See http://nodered.org/docs/security.html#generating-the-password-hash
    */
  var httpStaticAuth: js.UndefOr[Pass] = js.undefined
  
  /**
    * HTTPS options
    */
  var https: js.UndefOr[ServerOptions] = js.undefined
  
  /**
    * Configure the logging output
    */
  var logging: js.UndefOr[Console] = js.undefined
  
  /**
    * Retry time in milliseconds for MQTT connections
    */
  var mqttReconnectTime: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of messages nodes will buffer internally as part of their
    * operation. This applies across a range of nodes that operate on message sequences.
    */
  var nodeMessageBufferMaxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Node-RED scans the `nodes` directory in the userDir to find local node files.
    * The following property can be used to specify an additional directory to scan.
    */
  var nodesDir: js.UndefOr[String] = js.undefined
  
  /**
    * The following property can be used to order the categories in the editor
    * palette. If a node's category is not in the list, the category will get
    * added to the end of the palette.
    * If not set, the following default order is used:
    * paletteCategories: ['subflows','flow','input','output','function','parser','social','mobile','storage','analysis','advanced'],
    */
  var paletteCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var safeMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Retry time in milliseconds for Serial port connections
    */
  var serialReconnectTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Retry time in milliseconds for TCP socket connections
    */
  var socketReconnectTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout in milliseconds for TCP server socket connections
    */
  var socketTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of messages to wait in queue while attempting to connect to TCP socket
    */
  var tcpMsgQueueSize: js.UndefOr[Double] = js.undefined
  
  /**
    * To disable the option for using local files for storing keys and certificates in the TLS configuration
    * node, set this to true
    */
  var tlsConfigDisableLocalFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you installed the optional node-red-dashboard, the property contains its
    * path relative to httpRoot
    */
  var ui: js.UndefOr[Path] = js.undefined
  
  /**
    * Interfaces Node-RED UI accepts connections on
    */
  var uiHost: String
  
  /**
    * the tcp port that the Node-RED web server is listening on
    */
  var uiPort: Double
  
  /**
    * By default, all user data is stored in a directory called `.node-red` under
    * the user's home directory. To use a different location, the following
    * property can be used
    */
  var userDir: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
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
  ] = js.undefined
}
object LocalSettings {
  
  inline def apply(uiHost: String, uiPort: Double): LocalSettings = {
    val __obj = js.Dynamic.literal(uiHost = uiHost.asInstanceOf[js.Any], uiPort = uiPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSettings]
  }
  
  extension [Self <: LocalSettings](x: Self) {
    
    inline def setAdminAuth(value: Default | Authenticate | Strategy): Self = StObject.set(x, "adminAuth", value.asInstanceOf[js.Any])
    
    inline def setAdminAuthUndefined: Self = StObject.set(x, "adminAuth", js.undefined)
    
    inline def setApiMaxLength(value: String): Self = StObject.set(x, "apiMaxLength", value.asInstanceOf[js.Any])
    
    inline def setApiMaxLengthUndefined: Self = StObject.set(x, "apiMaxLength", js.undefined)
    
    inline def setContextStorage(value: StringDictionary[String | Module]): Self = StObject.set(x, "contextStorage", value.asInstanceOf[js.Any])
    
    inline def setContextStorageUndefined: Self = StObject.set(x, "contextStorage", js.undefined)
    
    inline def setCredentialSecret(value: String | `false`): Self = StObject.set(x, "credentialSecret", value.asInstanceOf[js.Any])
    
    inline def setCredentialSecretUndefined: Self = StObject.set(x, "credentialSecret", js.undefined)
    
    inline def setDebugMaxLength(value: Double): Self = StObject.set(x, "debugMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDebugMaxLengthUndefined: Self = StObject.set(x, "debugMaxLength", js.undefined)
    
    inline def setDebugUseColors(value: Boolean): Self = StObject.set(x, "debugUseColors", value.asInstanceOf[js.Any])
    
    inline def setDebugUseColorsUndefined: Self = StObject.set(x, "debugUseColors", js.undefined)
    
    inline def setDisableEditor(value: Boolean): Self = StObject.set(x, "disableEditor", value.asInstanceOf[js.Any])
    
    inline def setDisableEditorUndefined: Self = StObject.set(x, "disableEditor", js.undefined)
    
    inline def setEditorTheme(value: DeployButton): Self = StObject.set(x, "editorTheme", value.asInstanceOf[js.Any])
    
    inline def setEditorThemeUndefined: Self = StObject.set(x, "editorTheme", js.undefined)
    
    inline def setExportGlobalContextKeys(value: Boolean): Self = StObject.set(x, "exportGlobalContextKeys", value.asInstanceOf[js.Any])
    
    inline def setExportGlobalContextKeysUndefined: Self = StObject.set(x, "exportGlobalContextKeys", js.undefined)
    
    inline def setFlowFile(value: String): Self = StObject.set(x, "flowFile", value.asInstanceOf[js.Any])
    
    inline def setFlowFilePretty(value: Boolean): Self = StObject.set(x, "flowFilePretty", value.asInstanceOf[js.Any])
    
    inline def setFlowFilePrettyUndefined: Self = StObject.set(x, "flowFilePretty", js.undefined)
    
    inline def setFlowFileUndefined: Self = StObject.set(x, "flowFile", js.undefined)
    
    inline def setFunctionGlobalContext(value: js.Object): Self = StObject.set(x, "functionGlobalContext", value.asInstanceOf[js.Any])
    
    inline def setFunctionGlobalContextUndefined: Self = StObject.set(x, "functionGlobalContext", js.undefined)
    
    inline def setHttpAdminRoot(value: String | `false`): Self = StObject.set(x, "httpAdminRoot", value.asInstanceOf[js.Any])
    
    inline def setHttpAdminRootUndefined: Self = StObject.set(x, "httpAdminRoot", js.undefined)
    
    inline def setHttpNodeAuth(value: Pass): Self = StObject.set(x, "httpNodeAuth", value.asInstanceOf[js.Any])
    
    inline def setHttpNodeAuthUndefined: Self = StObject.set(x, "httpNodeAuth", js.undefined)
    
    inline def setHttpNodeCors(value: CorsOptions): Self = StObject.set(x, "httpNodeCors", value.asInstanceOf[js.Any])
    
    inline def setHttpNodeCorsUndefined: Self = StObject.set(x, "httpNodeCors", js.undefined)
    
    inline def setHttpNodeMiddleware(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* next */ NextFunction) => Unit
    ): Self = StObject.set(x, "httpNodeMiddleware", js.Any.fromFunction3(value))
    
    inline def setHttpNodeMiddlewareUndefined: Self = StObject.set(x, "httpNodeMiddleware", js.undefined)
    
    inline def setHttpNodeRoot(value: String | `false`): Self = StObject.set(x, "httpNodeRoot", value.asInstanceOf[js.Any])
    
    inline def setHttpNodeRootUndefined: Self = StObject.set(x, "httpNodeRoot", js.undefined)
    
    inline def setHttpRequestTimeout(value: Double): Self = StObject.set(x, "httpRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestTimeoutUndefined: Self = StObject.set(x, "httpRequestTimeout", js.undefined)
    
    inline def setHttpRoot(value: String | `false`): Self = StObject.set(x, "httpRoot", value.asInstanceOf[js.Any])
    
    inline def setHttpRootUndefined: Self = StObject.set(x, "httpRoot", js.undefined)
    
    inline def setHttpServerOptions(value: js.Object): Self = StObject.set(x, "httpServerOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpServerOptionsUndefined: Self = StObject.set(x, "httpServerOptions", js.undefined)
    
    inline def setHttpStatic(value: String): Self = StObject.set(x, "httpStatic", value.asInstanceOf[js.Any])
    
    inline def setHttpStaticAuth(value: Pass): Self = StObject.set(x, "httpStaticAuth", value.asInstanceOf[js.Any])
    
    inline def setHttpStaticAuthUndefined: Self = StObject.set(x, "httpStaticAuth", js.undefined)
    
    inline def setHttpStaticUndefined: Self = StObject.set(x, "httpStatic", js.undefined)
    
    inline def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setLogging(value: Console): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMqttReconnectTime(value: Double): Self = StObject.set(x, "mqttReconnectTime", value.asInstanceOf[js.Any])
    
    inline def setMqttReconnectTimeUndefined: Self = StObject.set(x, "mqttReconnectTime", js.undefined)
    
    inline def setNodeMessageBufferMaxLength(value: Double): Self = StObject.set(x, "nodeMessageBufferMaxLength", value.asInstanceOf[js.Any])
    
    inline def setNodeMessageBufferMaxLengthUndefined: Self = StObject.set(x, "nodeMessageBufferMaxLength", js.undefined)
    
    inline def setNodesDir(value: String): Self = StObject.set(x, "nodesDir", value.asInstanceOf[js.Any])
    
    inline def setNodesDirUndefined: Self = StObject.set(x, "nodesDir", js.undefined)
    
    inline def setPaletteCategories(value: js.Array[String]): Self = StObject.set(x, "paletteCategories", value.asInstanceOf[js.Any])
    
    inline def setPaletteCategoriesUndefined: Self = StObject.set(x, "paletteCategories", js.undefined)
    
    inline def setPaletteCategoriesVarargs(value: String*): Self = StObject.set(x, "paletteCategories", js.Array(value :_*))
    
    inline def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
    
    inline def setSerialReconnectTime(value: Double): Self = StObject.set(x, "serialReconnectTime", value.asInstanceOf[js.Any])
    
    inline def setSerialReconnectTimeUndefined: Self = StObject.set(x, "serialReconnectTime", js.undefined)
    
    inline def setSocketReconnectTime(value: Double): Self = StObject.set(x, "socketReconnectTime", value.asInstanceOf[js.Any])
    
    inline def setSocketReconnectTimeUndefined: Self = StObject.set(x, "socketReconnectTime", js.undefined)
    
    inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
    
    inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    
    inline def setTcpMsgQueueSize(value: Double): Self = StObject.set(x, "tcpMsgQueueSize", value.asInstanceOf[js.Any])
    
    inline def setTcpMsgQueueSizeUndefined: Self = StObject.set(x, "tcpMsgQueueSize", js.undefined)
    
    inline def setTlsConfigDisableLocalFiles(value: Boolean): Self = StObject.set(x, "tlsConfigDisableLocalFiles", value.asInstanceOf[js.Any])
    
    inline def setTlsConfigDisableLocalFilesUndefined: Self = StObject.set(x, "tlsConfigDisableLocalFiles", js.undefined)
    
    inline def setUi(value: Path): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiHost(value: String): Self = StObject.set(x, "uiHost", value.asInstanceOf[js.Any])
    
    inline def setUiPort(value: Double): Self = StObject.set(x, "uiPort", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setUserDir(value: String): Self = StObject.set(x, "userDir", value.asInstanceOf[js.Any])
    
    inline def setUserDirUndefined: Self = StObject.set(x, "userDir", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWebSocketNodeVerifyClient(
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
    ): Self = StObject.set(x, "webSocketNodeVerifyClient", value.asInstanceOf[js.Any])
    
    inline def setWebSocketNodeVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "webSocketNodeVerifyClient", js.Any.fromFunction1(value))
    
    inline def setWebSocketNodeVerifyClientFunction2(
      value: (/* info */ Origin, /* callback */ js.Function3[
          /* result */ Boolean, 
          /* code */ js.UndefOr[String], 
          /* reason */ js.UndefOr[String], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "webSocketNodeVerifyClient", js.Any.fromFunction2(value))
    
    inline def setWebSocketNodeVerifyClientUndefined: Self = StObject.set(x, "webSocketNodeVerifyClient", js.undefined)
  }
}
