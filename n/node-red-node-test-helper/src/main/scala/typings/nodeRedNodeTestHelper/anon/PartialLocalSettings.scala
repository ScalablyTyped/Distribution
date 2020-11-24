package typings.nodeRedNodeTestHelper.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cors.mod.CorsOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.httpsMod.ServerOptions
import typings.nodeRedNodeTestHelper.nodeRedNodeTestHelperBooleans.`false`
import typings.nodeRedRuntime.anon.Authenticate
import typings.nodeRedRuntime.anon.Console
import typings.nodeRedRuntime.anon.Default
import typings.nodeRedRuntime.anon.DeployButton
import typings.nodeRedRuntime.anon.Module
import typings.nodeRedRuntime.anon.Origin
import typings.nodeRedRuntime.anon.Pass
import typings.nodeRedRuntime.anon.Path
import typings.nodeRedRuntime.anon.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@node-red/runtime.@node-red/runtime.LocalSettings> */
@js.native
trait PartialLocalSettings extends js.Object {
  
  var adminAuth: js.UndefOr[Default | Authenticate | Strategy] = js.native
  
  var apiMaxLength: js.UndefOr[String] = js.native
  
  var contextStorage: js.UndefOr[StringDictionary[String | Module]] = js.native
  
  var credentialSecret: js.UndefOr[String | `false`] = js.native
  
  var debugMaxLength: js.UndefOr[Double] = js.native
  
  var debugUseColors: js.UndefOr[Boolean] = js.native
  
  var disableEditor: js.UndefOr[Boolean] = js.native
  
  var editorTheme: js.UndefOr[DeployButton] = js.native
  
  var exportGlobalContextKeys: js.UndefOr[Boolean] = js.native
  
  var flowFile: js.UndefOr[String] = js.native
  
  var flowFilePretty: js.UndefOr[Boolean] = js.native
  
  var functionGlobalContext: js.UndefOr[js.Object] = js.native
  
  var httpAdminRoot: js.UndefOr[String | `false`] = js.native
  
  var httpNodeAuth: js.UndefOr[Pass] = js.native
  
  var httpNodeCors: js.UndefOr[CorsOptions] = js.native
  
  var httpNodeMiddleware: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.native
  
  var httpNodeRoot: js.UndefOr[String | `false`] = js.native
  
  var httpRequestTimeout: js.UndefOr[Double] = js.native
  
  var httpRoot: js.UndefOr[String | `false`] = js.native
  
  var httpServerOptions: js.UndefOr[js.Object] = js.native
  
  var httpStatic: js.UndefOr[String] = js.native
  
  var httpStaticAuth: js.UndefOr[Pass] = js.native
  
  var https: js.UndefOr[ServerOptions] = js.native
  
  var logging: js.UndefOr[Console] = js.native
  
  var mqttReconnectTime: js.UndefOr[Double] = js.native
  
  var nodeMessageBufferMaxLength: js.UndefOr[Double] = js.native
  
  var nodesDir: js.UndefOr[String] = js.native
  
  var paletteCategories: js.UndefOr[js.Array[String]] = js.native
  
  var safeMode: js.UndefOr[Boolean] = js.native
  
  var serialReconnectTime: js.UndefOr[Double] = js.native
  
  var socketReconnectTime: js.UndefOr[Double] = js.native
  
  var socketTimeout: js.UndefOr[Double] = js.native
  
  var tcpMsgQueueSize: js.UndefOr[Double] = js.native
  
  var tlsConfigDisableLocalFiles: js.UndefOr[Boolean] = js.native
  
  var ui: js.UndefOr[Path] = js.native
  
  var uiHost: js.UndefOr[String] = js.native
  
  var uiPort: js.UndefOr[Double] = js.native
  
  var userDir: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
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
object PartialLocalSettings {
  
  @scala.inline
  def apply(): PartialLocalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocalSettings]
  }
  
  @scala.inline
  implicit class PartialLocalSettingsOps[Self <: PartialLocalSettings] (val x: Self) extends AnyVal {
    
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
    def setUiHost(value: String): Self = this.set("uiHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiHost: Self = this.set("uiHost", js.undefined)
    
    @scala.inline
    def setUiPort(value: Double): Self = this.set("uiPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiPort: Self = this.set("uiPort", js.undefined)
    
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
