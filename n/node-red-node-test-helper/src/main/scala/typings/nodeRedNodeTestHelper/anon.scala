package typings.nodeRedNodeTestHelper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.cors.mod.CorsOptions
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.node.httpsMod.ServerOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var `type`: String
    
    var wires: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  }
  object Id {
    
    inline def apply(id: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWires(value: js.Array[js.Array[String]]): Self = StObject.set(x, "wires", value.asInstanceOf[js.Any])
      
      inline def setWiresUndefined: Self = StObject.set(x, "wires", js.undefined)
      
      inline def setWiresVarargs(value: js.Array[String]*): Self = StObject.set(x, "wires", js.Array(value*))
    }
  }
  
  trait NodeTestHelper extends StObject {
    
    var NodeTestHelper: Instantiable0[typings.nodeRedNodeTestHelper.mod.NodeTestHelper]
  }
  object NodeTestHelper {
    
    inline def apply(NodeTestHelper: Instantiable0[typings.nodeRedNodeTestHelper.mod.NodeTestHelper]): NodeTestHelper = {
      val __obj = js.Dynamic.literal(NodeTestHelper = NodeTestHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTestHelper]
    }
    
    extension [Self <: NodeTestHelper](x: Self) {
      
      inline def setNodeTestHelper(value: Instantiable0[typings.nodeRedNodeTestHelper.mod.NodeTestHelper]): Self = StObject.set(x, "NodeTestHelper", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@node-red/runtime.@node-red/runtime.LocalSettings> */
  trait PartialLocalSettings extends StObject {
    
    var adminAuth: js.UndefOr[Default | Authenticate | Strategy] = js.undefined
    
    var apiMaxLength: js.UndefOr[String] = js.undefined
    
    var contextStorage: js.UndefOr[StringDictionary[String | Module]] = js.undefined
    
    var credentialSecret: js.UndefOr[String | `false`] = js.undefined
    
    var debugMaxLength: js.UndefOr[Double] = js.undefined
    
    var debugUseColors: js.UndefOr[Boolean] = js.undefined
    
    var disableEditor: js.UndefOr[Boolean] = js.undefined
    
    var editorTheme: js.UndefOr[DeployButton] = js.undefined
    
    var exportGlobalContextKeys: js.UndefOr[Boolean] = js.undefined
    
    var flowFile: js.UndefOr[String] = js.undefined
    
    var flowFilePretty: js.UndefOr[Boolean] = js.undefined
    
    var functionGlobalContext: js.UndefOr[js.Object] = js.undefined
    
    var httpAdminRoot: js.UndefOr[String | `false`] = js.undefined
    
    var httpNodeAuth: js.UndefOr[Pass] = js.undefined
    
    var httpNodeCors: js.UndefOr[CorsOptions] = js.undefined
    
    var httpNodeMiddleware: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ NextFunction, 
          Unit
        ]
      ] = js.undefined
    
    var httpNodeRoot: js.UndefOr[String | `false`] = js.undefined
    
    var httpRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var httpRoot: js.UndefOr[String | `false`] = js.undefined
    
    var httpServerOptions: js.UndefOr[js.Object] = js.undefined
    
    var httpStatic: js.UndefOr[String] = js.undefined
    
    var httpStaticAuth: js.UndefOr[Pass] = js.undefined
    
    var https: js.UndefOr[
        ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var logging: js.UndefOr[Console] = js.undefined
    
    var mqttReconnectTime: js.UndefOr[Double] = js.undefined
    
    var nodeMessageBufferMaxLength: js.UndefOr[Double] = js.undefined
    
    var nodesDir: js.UndefOr[String] = js.undefined
    
    var paletteCategories: js.UndefOr[js.Array[String]] = js.undefined
    
    var safeMode: js.UndefOr[Boolean] = js.undefined
    
    var serialReconnectTime: js.UndefOr[Double] = js.undefined
    
    var socketReconnectTime: js.UndefOr[Double] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var tcpMsgQueueSize: js.UndefOr[Double] = js.undefined
    
    var tlsConfigDisableLocalFiles: js.UndefOr[Boolean] = js.undefined
    
    var ui: js.UndefOr[Path] = js.undefined
    
    var uiHost: js.UndefOr[String] = js.undefined
    
    var uiPort: js.UndefOr[Double] = js.undefined
    
    var userDir: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
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
  object PartialLocalSettings {
    
    inline def apply(): PartialLocalSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocalSettings]
    }
    
    extension [Self <: PartialLocalSettings](x: Self) {
      
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
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => Unit
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
      
      inline def setHttps(
        value: ServerOptions[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
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
      
      inline def setPaletteCategoriesVarargs(value: String*): Self = StObject.set(x, "paletteCategories", js.Array(value*))
      
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
      
      inline def setUiHostUndefined: Self = StObject.set(x, "uiHost", js.undefined)
      
      inline def setUiPort(value: Double): Self = StObject.set(x, "uiPort", value.asInstanceOf[js.Any])
      
      inline def setUiPortUndefined: Self = StObject.set(x, "uiPort", js.undefined)
      
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
  
  /* Inlined node-red-node-test-helper.node-red-node-test-helper.TestFlowsItem<node-red.node-red.NodeDef> */
  trait TestFlowsItemNodeDef extends StObject {
    
    var id: js.UndefOr[String] & String
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] & String
    
    var wires: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var z: js.UndefOr[String] = js.undefined
  }
  object TestFlowsItemNodeDef {
    
    inline def apply(id: js.UndefOr[String] & String, `type`: js.UndefOr[String] & String): TestFlowsItemNodeDef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFlowsItemNodeDef]
    }
    
    extension [Self <: TestFlowsItemNodeDef](x: Self) {
      
      inline def setId(value: js.UndefOr[String] & String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: js.UndefOr[String] & String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWires(value: js.Array[js.Array[String]]): Self = StObject.set(x, "wires", value.asInstanceOf[js.Any])
      
      inline def setWiresUndefined: Self = StObject.set(x, "wires", js.undefined)
      
      inline def setWiresVarargs(value: js.Array[String]*): Self = StObject.set(x, "wires", js.Array(value*))
      
      inline def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
