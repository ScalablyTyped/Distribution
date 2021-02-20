package typings.nodeRedNodeTestHelper

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var `type`: String = js.native
    
    var wires: js.UndefOr[js.Array[js.Array[String]]] = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWires(value: js.Array[js.Array[String]]): Self = StObject.set(x, "wires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWiresUndefined: Self = StObject.set(x, "wires", js.undefined)
      
      @scala.inline
      def setWiresVarargs(value: js.Array[String]*): Self = StObject.set(x, "wires", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@node-red/runtime.@node-red/runtime.LocalSettings> */
  @js.native
  trait PartialLocalSettings extends StObject {
    
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
    implicit class PartialLocalSettingsMutableBuilder[Self <: PartialLocalSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminAuth(value: Default | Authenticate | Strategy): Self = StObject.set(x, "adminAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminAuthUndefined: Self = StObject.set(x, "adminAuth", js.undefined)
      
      @scala.inline
      def setApiMaxLength(value: String): Self = StObject.set(x, "apiMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiMaxLengthUndefined: Self = StObject.set(x, "apiMaxLength", js.undefined)
      
      @scala.inline
      def setContextStorage(value: StringDictionary[String | Module]): Self = StObject.set(x, "contextStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextStorageUndefined: Self = StObject.set(x, "contextStorage", js.undefined)
      
      @scala.inline
      def setCredentialSecret(value: String | `false`): Self = StObject.set(x, "credentialSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialSecretUndefined: Self = StObject.set(x, "credentialSecret", js.undefined)
      
      @scala.inline
      def setDebugMaxLength(value: Double): Self = StObject.set(x, "debugMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugMaxLengthUndefined: Self = StObject.set(x, "debugMaxLength", js.undefined)
      
      @scala.inline
      def setDebugUseColors(value: Boolean): Self = StObject.set(x, "debugUseColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUseColorsUndefined: Self = StObject.set(x, "debugUseColors", js.undefined)
      
      @scala.inline
      def setDisableEditor(value: Boolean): Self = StObject.set(x, "disableEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEditorUndefined: Self = StObject.set(x, "disableEditor", js.undefined)
      
      @scala.inline
      def setEditorTheme(value: DeployButton): Self = StObject.set(x, "editorTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorThemeUndefined: Self = StObject.set(x, "editorTheme", js.undefined)
      
      @scala.inline
      def setExportGlobalContextKeys(value: Boolean): Self = StObject.set(x, "exportGlobalContextKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportGlobalContextKeysUndefined: Self = StObject.set(x, "exportGlobalContextKeys", js.undefined)
      
      @scala.inline
      def setFlowFile(value: String): Self = StObject.set(x, "flowFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowFilePretty(value: Boolean): Self = StObject.set(x, "flowFilePretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowFilePrettyUndefined: Self = StObject.set(x, "flowFilePretty", js.undefined)
      
      @scala.inline
      def setFlowFileUndefined: Self = StObject.set(x, "flowFile", js.undefined)
      
      @scala.inline
      def setFunctionGlobalContext(value: js.Object): Self = StObject.set(x, "functionGlobalContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionGlobalContextUndefined: Self = StObject.set(x, "functionGlobalContext", js.undefined)
      
      @scala.inline
      def setHttpAdminRoot(value: String | `false`): Self = StObject.set(x, "httpAdminRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAdminRootUndefined: Self = StObject.set(x, "httpAdminRoot", js.undefined)
      
      @scala.inline
      def setHttpNodeAuth(value: Pass): Self = StObject.set(x, "httpNodeAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpNodeAuthUndefined: Self = StObject.set(x, "httpNodeAuth", js.undefined)
      
      @scala.inline
      def setHttpNodeCors(value: CorsOptions): Self = StObject.set(x, "httpNodeCors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpNodeCorsUndefined: Self = StObject.set(x, "httpNodeCors", js.undefined)
      
      @scala.inline
      def setHttpNodeMiddleware(
        value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
      ): Self = StObject.set(x, "httpNodeMiddleware", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHttpNodeMiddlewareUndefined: Self = StObject.set(x, "httpNodeMiddleware", js.undefined)
      
      @scala.inline
      def setHttpNodeRoot(value: String | `false`): Self = StObject.set(x, "httpNodeRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpNodeRootUndefined: Self = StObject.set(x, "httpNodeRoot", js.undefined)
      
      @scala.inline
      def setHttpRequestTimeout(value: Double): Self = StObject.set(x, "httpRequestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpRequestTimeoutUndefined: Self = StObject.set(x, "httpRequestTimeout", js.undefined)
      
      @scala.inline
      def setHttpRoot(value: String | `false`): Self = StObject.set(x, "httpRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpRootUndefined: Self = StObject.set(x, "httpRoot", js.undefined)
      
      @scala.inline
      def setHttpServerOptions(value: js.Object): Self = StObject.set(x, "httpServerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpServerOptionsUndefined: Self = StObject.set(x, "httpServerOptions", js.undefined)
      
      @scala.inline
      def setHttpStatic(value: String): Self = StObject.set(x, "httpStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpStaticAuth(value: Pass): Self = StObject.set(x, "httpStaticAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpStaticAuthUndefined: Self = StObject.set(x, "httpStaticAuth", js.undefined)
      
      @scala.inline
      def setHttpStaticUndefined: Self = StObject.set(x, "httpStatic", js.undefined)
      
      @scala.inline
      def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLogging(value: Console): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMqttReconnectTime(value: Double): Self = StObject.set(x, "mqttReconnectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMqttReconnectTimeUndefined: Self = StObject.set(x, "mqttReconnectTime", js.undefined)
      
      @scala.inline
      def setNodeMessageBufferMaxLength(value: Double): Self = StObject.set(x, "nodeMessageBufferMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeMessageBufferMaxLengthUndefined: Self = StObject.set(x, "nodeMessageBufferMaxLength", js.undefined)
      
      @scala.inline
      def setNodesDir(value: String): Self = StObject.set(x, "nodesDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesDirUndefined: Self = StObject.set(x, "nodesDir", js.undefined)
      
      @scala.inline
      def setPaletteCategories(value: js.Array[String]): Self = StObject.set(x, "paletteCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteCategoriesUndefined: Self = StObject.set(x, "paletteCategories", js.undefined)
      
      @scala.inline
      def setPaletteCategoriesVarargs(value: String*): Self = StObject.set(x, "paletteCategories", js.Array(value :_*))
      
      @scala.inline
      def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
      
      @scala.inline
      def setSerialReconnectTime(value: Double): Self = StObject.set(x, "serialReconnectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialReconnectTimeUndefined: Self = StObject.set(x, "serialReconnectTime", js.undefined)
      
      @scala.inline
      def setSocketReconnectTime(value: Double): Self = StObject.set(x, "socketReconnectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketReconnectTimeUndefined: Self = StObject.set(x, "socketReconnectTime", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      @scala.inline
      def setTcpMsgQueueSize(value: Double): Self = StObject.set(x, "tcpMsgQueueSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcpMsgQueueSizeUndefined: Self = StObject.set(x, "tcpMsgQueueSize", js.undefined)
      
      @scala.inline
      def setTlsConfigDisableLocalFiles(value: Boolean): Self = StObject.set(x, "tlsConfigDisableLocalFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsConfigDisableLocalFilesUndefined: Self = StObject.set(x, "tlsConfigDisableLocalFiles", js.undefined)
      
      @scala.inline
      def setUi(value: Path): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiHost(value: String): Self = StObject.set(x, "uiHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiHostUndefined: Self = StObject.set(x, "uiHost", js.undefined)
      
      @scala.inline
      def setUiPort(value: Double): Self = StObject.set(x, "uiPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiPortUndefined: Self = StObject.set(x, "uiPort", js.undefined)
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      @scala.inline
      def setUserDir(value: String): Self = StObject.set(x, "userDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDirUndefined: Self = StObject.set(x, "userDir", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
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
      ): Self = StObject.set(x, "webSocketNodeVerifyClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketNodeVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "webSocketNodeVerifyClient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWebSocketNodeVerifyClientFunction2(
        value: (/* info */ Origin, /* callback */ js.Function3[
              /* result */ Boolean, 
              /* code */ js.UndefOr[String], 
              /* reason */ js.UndefOr[String], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "webSocketNodeVerifyClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWebSocketNodeVerifyClientUndefined: Self = StObject.set(x, "webSocketNodeVerifyClient", js.undefined)
    }
  }
  
  /* Inlined node-red-node-test-helper.node-red-node-test-helper.TestFlowsItem<node-red.node-red.NodeDef> */
  @js.native
  trait TestFlowsItemNodeDef extends StObject {
    
    var id: js.UndefOr[String] with String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] with String = js.native
    
    var wires: js.UndefOr[js.Array[js.Array[String]]] = js.native
    
    var z: js.UndefOr[String] = js.native
  }
  object TestFlowsItemNodeDef {
    
    @scala.inline
    def apply(id: js.UndefOr[String] with String, `type`: js.UndefOr[String] with String): TestFlowsItemNodeDef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFlowsItemNodeDef]
    }
    
    @scala.inline
    implicit class TestFlowsItemNodeDefMutableBuilder[Self <: TestFlowsItemNodeDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.UndefOr[String] with String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: js.UndefOr[String] with String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWires(value: js.Array[js.Array[String]]): Self = StObject.set(x, "wires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWiresUndefined: Self = StObject.set(x, "wires", js.undefined)
      
      @scala.inline
      def setWiresVarargs(value: js.Array[String]*): Self = StObject.set(x, "wires", js.Array(value :_*))
      
      @scala.inline
      def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
