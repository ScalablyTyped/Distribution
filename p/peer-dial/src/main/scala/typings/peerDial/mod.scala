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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait App extends StObject {
    
    var allowStop: Boolean = js.native
    
    def launch(launchData: String): Unit = js.native
    
    var name: String = js.native
    
    var pid: String = js.native
    
    var state: String = js.native
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
  
  @js.native
  trait AppInfo extends StObject {
    
    var dialVer: String = js.native
    
    var name: String = js.native
    
    var options: AppInfoOptions = js.native
    
    var state: String = js.native
    
    var xmlns: String = js.native
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
  
  @js.native
  trait AppInfoOptions extends StObject {
    
    var allowStop: String = js.native
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
  
  @js.native
  trait CorsOptions extends StObject {
    
    var exposedHeaders: js.Array[String] = js.native
    
    var methods: js.Array[String] = js.native
    
    var origin: Boolean = js.native
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
  
  @js.native
  trait Delegate extends StObject {
    
    def getApp(appName: String): App = js.native
    
    def launchApp(appName: String, launchData: String, callback: js.Function1[/* data */ String, Unit]): Unit = js.native
    
    def stopApp(appName: String, pid: String, callback: js.Function1[/* data */ Boolean, Unit]): Unit = js.native
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
  
  @js.native
  trait DeviceInfo extends StObject {
    
    var UDN: String = js.native
    
    var applicationUrl: String = js.native
    
    var descriptionUrl: String = js.native
    
    var deviceType: String = js.native
    
    var friendlyName: String = js.native
    
    var iconList: js.Array[js.Object] | Icon = js.native
    
    var manufacturer: String = js.native
    
    var modelName: String = js.native
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
  
  @js.native
  trait ServerOptions extends StObject {
    
    var corsAllowOrigins: String | Boolean = js.native
    
    var delegate: Delegate = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def expressApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def expressApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def expressApp(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def expressApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("expressApp")
    var expressApp_Original: Express = js.native
    
    var extraHeaders: js.UndefOr[js.Object] = js.native
    
    var friendlyName: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var manufacturer: String = js.native
    
    var maxContentLength: js.UndefOr[Double] = js.native
    
    var modelName: String = js.native
    
    var port: Double = js.native
    
    var prefix: String = js.native
    
    var uuid: js.UndefOr[UUIDOptions] = js.native
  }
}
