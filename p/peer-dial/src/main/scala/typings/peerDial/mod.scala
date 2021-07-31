package typings.peerDial

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.nodeUuid.mod.UUIDOptions
import typings.peerDial.anon.Icon
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("peer-dial", "Client")
  @js.native
  class Client () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def getDialDevice(deviceDescriptionUrl: String): Unit = js.native
    def getDialDevice(
      deviceDescriptionUrl: String,
      callback: js.Function2[/* data */ DialDevice, /* err */ js.Any, Unit]
    ): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("peer-dial", "DialDevice")
  @js.native
  class DialDevice protected () extends StObject {
    def this(deviceInfo: DeviceInfo) = this()
    
    def getAppInfo(appName: String): Unit = js.native
    def getAppInfo(appName: String, callback: js.Function2[/* data */ AppInfo, /* err */ js.Any, Unit]): Unit = js.native
    
    def getAppInfoXml(appName: String): Unit = js.native
    def getAppInfoXml(appName: String, callback: js.Function2[/* data */ String, /* err */ js.Any, Unit]): Unit = js.native
    
    def launchApp(appName: String, launchData: String, contentType: String): Unit = js.native
    def launchApp(
      appName: String,
      launchData: String,
      contentType: String,
      callback: js.Function2[/* data */ String, /* err */ js.Any, Unit]
    ): Unit = js.native
    
    def stopApp(appName: String, pid: String): Unit = js.native
    def stopApp(appName: String, pid: String, callback: js.Function2[/* data */ Double, /* err */ js.Any, Unit]): Unit = js.native
  }
  
  @JSImport("peer-dial", "Server")
  @js.native
  class Server protected () extends EventEmitter {
    def this(options: ServerOptions) = this()
    
    def corsOptionsAppsDelegate(req: String, callback: js.Function2[/* err */ js.Any, /* data */ CorsOptions, Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait App extends StObject {
    
    var allowStop: Boolean
    
    def launch(launchData: String): Unit
    
    var name: String
    
    var pid: String
    
    var state: String
  }
  object App {
    
    @scala.inline
    def apply(allowStop: Boolean, launch: String => Unit, name: String, pid: String, state: String): App = {
      val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any], launch = js.Any.fromFunction1(launch), name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowStop(value: Boolean): Self = StObject.set(x, "allowStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunch(value: String => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppInfo extends StObject {
    
    var dialVer: String
    
    var name: String
    
    var options: AppInfoOptions
    
    var state: String
    
    var xmlns: String
  }
  object AppInfo {
    
    @scala.inline
    def apply(dialVer: String, name: String, options: AppInfoOptions, state: String, xmlns: String): AppInfo = {
      val __obj = js.Dynamic.literal(dialVer = dialVer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInfo]
    }
    
    @scala.inline
    implicit class AppInfoMutableBuilder[Self <: AppInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialVer(value: String): Self = StObject.set(x, "dialVer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: AppInfoOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppInfoOptions extends StObject {
    
    var allowStop: String
  }
  object AppInfoOptions {
    
    @scala.inline
    def apply(allowStop: String): AppInfoOptions = {
      val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInfoOptions]
    }
    
    @scala.inline
    implicit class AppInfoOptionsMutableBuilder[Self <: AppInfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowStop(value: String): Self = StObject.set(x, "allowStop", value.asInstanceOf[js.Any])
    }
  }
  
  trait CorsOptions extends StObject {
    
    var exposedHeaders: js.Array[String]
    
    var methods: js.Array[String]
    
    var origin: Boolean
  }
  object CorsOptions {
    
    @scala.inline
    def apply(exposedHeaders: js.Array[String], methods: js.Array[String], origin: Boolean): CorsOptions = {
      val __obj = js.Dynamic.literal(exposedHeaders = exposedHeaders.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorsOptions]
    }
    
    @scala.inline
    implicit class CorsOptionsMutableBuilder[Self <: CorsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExposedHeaders(value: js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setOrigin(value: Boolean): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delegate extends StObject {
    
    def getApp(appName: String): App
    
    def launchApp(appName: String, launchData: String, callback: js.Function1[/* data */ String, Unit]): Unit
    
    def stopApp(appName: String, pid: String, callback: js.Function1[/* data */ Boolean, Unit]): Unit
  }
  object Delegate {
    
    @scala.inline
    def apply(
      getApp: String => App,
      launchApp: (String, String, js.Function1[/* data */ String, Unit]) => Unit,
      stopApp: (String, String, js.Function1[/* data */ Boolean, Unit]) => Unit
    ): Delegate = {
      val __obj = js.Dynamic.literal(getApp = js.Any.fromFunction1(getApp), launchApp = js.Any.fromFunction3(launchApp), stopApp = js.Any.fromFunction3(stopApp))
      __obj.asInstanceOf[Delegate]
    }
    
    @scala.inline
    implicit class DelegateMutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetApp(value: String => App): Self = StObject.set(x, "getApp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLaunchApp(value: (String, String, js.Function1[/* data */ String, Unit]) => Unit): Self = StObject.set(x, "launchApp", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStopApp(value: (String, String, js.Function1[/* data */ Boolean, Unit]) => Unit): Self = StObject.set(x, "stopApp", js.Any.fromFunction3(value))
    }
  }
  
  trait DeviceInfo extends StObject {
    
    var UDN: String
    
    var applicationUrl: String
    
    var descriptionUrl: String
    
    var deviceType: String
    
    var friendlyName: String
    
    var iconList: js.Array[js.Object] | Icon
    
    var manufacturer: String
    
    var modelName: String
  }
  object DeviceInfo {
    
    @scala.inline
    def apply(
      UDN: String,
      applicationUrl: String,
      descriptionUrl: String,
      deviceType: String,
      friendlyName: String,
      iconList: js.Array[js.Object] | Icon,
      manufacturer: String,
      modelName: String
    ): DeviceInfo = {
      val __obj = js.Dynamic.literal(UDN = UDN.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any], descriptionUrl = descriptionUrl.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], iconList = iconList.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceInfo]
    }
    
    @scala.inline
    implicit class DeviceInfoMutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationUrl(value: String): Self = StObject.set(x, "applicationUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUrl(value: String): Self = StObject.set(x, "descriptionUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconList(value: js.Array[js.Object] | Icon): Self = StObject.set(x, "iconList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconListVarargs(value: js.Object*): Self = StObject.set(x, "iconList", js.Array(value :_*))
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUDN(value: String): Self = StObject.set(x, "UDN", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerOptions extends StObject {
    
    var corsAllowOrigins: String | Boolean
    
    var delegate: Delegate
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def expressApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def expressApp(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def expressApp(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def expressApp(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("expressApp")
    var expressApp_Original: Express
    
    var extraHeaders: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var manufacturer: String
    
    var maxContentLength: js.UndefOr[Double] = js.undefined
    
    var modelName: String
    
    var port: Double
    
    var prefix: String
    
    var uuid: js.UndefOr[UUIDOptions] = js.undefined
  }
  object ServerOptions {
    
    @scala.inline
    def apply(
      corsAllowOrigins: String | Boolean,
      delegate: Delegate,
      expressApp: Express,
      manufacturer: String,
      modelName: String,
      port: Double,
      prefix: String
    ): ServerOptions = {
      val __obj = js.Dynamic.literal(corsAllowOrigins = corsAllowOrigins.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], expressApp = expressApp.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorsAllowOrigins(value: String | Boolean): Self = StObject.set(x, "corsAllowOrigins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegate(value: Delegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressApp(value: Express): Self = StObject.set(x, "expressApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeaders(value: js.Object): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: UUIDOptions): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
