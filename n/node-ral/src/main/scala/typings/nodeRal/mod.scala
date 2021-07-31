package typings.nodeRal

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeRal.anon.App
import typings.nodeRal.mod.Balance.BalanceContextClass
import typings.nodeRal.mod.RAL.NormalizerManager
import typings.nodeRal.nodeRalBooleans.`false`
import typings.nodeRal.nodeRalStrings.GBK
import typings.nodeRal.nodeRalStrings.GET
import typings.nodeRal.nodeRalStrings.POST
import typings.nodeRal.nodeRalStrings.`utf-8`
import typings.nodeRal.nodeRalStrings.hashring
import typings.nodeRal.nodeRalStrings.http
import typings.nodeRal.nodeRalStrings.https
import typings.nodeRal.nodeRalStrings.random
import typings.nodeRal.nodeRalStrings.redis
import typings.nodeRal.nodeRalStrings.roundrobin
import typings.nodeRal.nodeRalStrings.soap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ral", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-ral", "Balance")
  @js.native
  abstract class Balance () extends StObject {
    
    def fetchServer(balanceContext: BalanceContextClass, conf: js.Any, prevBackend: Server): Server = js.native
    
    def getCategory(): js.Any = js.native
    
    def getContextClass(): BalanceContextConstructor = js.native
  }
  /* static members */
  object Balance {
    
    @JSImport("node-ral", "Balance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-ral", "Balance.BalanceContext")
    @js.native
    def BalanceContext: BalanceContextConstructor = js.native
    
    @JSImport("node-ral", "Balance.BalanceContextClass")
    @js.native
    class BalanceContextClass protected () extends StObject {
      def this(serviceID: String, service: Service) = this()
      
      var crossIDCServers: js.Array[String] = js.native
      
      var currentIDC: String = js.native
      
      var reqIDCServers: js.Array[String] = js.native
      
      var serviceID: String = js.native
    }
    
    @scala.inline
    def BalanceContext_=(x: BalanceContextConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BalanceContext")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Config extends StObject {
    
    def clearConf(): Unit = js.native
    
    def disableUpdate(): Unit = js.native
    
    def enableUpdate(interval: Double, all: Boolean, cb: js.Function2[/* err */ js.Any, /* confs */ js.Any, js.Any]): Unit = js.native
    
    def getConf(name: String): Service = js.native
    
    def getConfNames(): js.Array[String] = js.native
    
    def getContext(serviceID: String): Service = js.native
    def getContext(serviceID: String, options: Service): Service = js.native
    
    def getRawConf(): js.Any = js.native
    
    def getUpdateNeededRawConf(): js.Any = js.native
    
    def isAutoUpdateEnabled(): Boolean = js.native
    
    def load(confPath: String): js.Object = js.native
    
    def loadRawConf(): Service = js.native
    def loadRawConf(config: Service): Service = js.native
    
    def normalize(): js.Object = js.native
    def normalize(config: Service): js.Object = js.native
    
    var normalizerManager: NormalizerManager = js.native
  }
  @JSImport("node-ral", "Config")
  @js.native
  val Config: typings.nodeRal.mod.Config = js.native
  
  @JSImport("node-ral", "ConfigNormalizer")
  @js.native
  abstract class ConfigNormalizer () extends RalModule {
    
    def needUpdate(): Boolean = js.native
    def needUpdate(config: js.Any): Boolean = js.native
    
    def normalizeConfig(config: js.Any): typings.nodeRal.mod.Config = js.native
  }
  
  @JSImport("node-ral", "Converter")
  @js.native
  abstract class Converter () extends RalModule {
    
    var isStreamify: `false` = js.native
    
    def pack(config: Service, data: js.Any): Buffer = js.native
    
    def unpack(config: Service, data: js.Any): js.Any = js.native
  }
  
  @JSImport("node-ral", "Logger")
  @js.native
  val Logger: LoggerFactory = js.native
  
  @scala.inline
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resp */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")().asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resp */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  @scala.inline
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resp */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Middleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* resp */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  @JSImport("node-ral", "Protocol")
  @js.native
  abstract class Protocol () extends RalModule {
    
    def _request(config: js.Any, callback: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = js.native
    
    def beforeRequest(context: js.Any): js.Any = js.native
    
    def normalizeConfig(context: js.Any): js.Any = js.native
    
    def talk(config: js.Any, callback: js.Any): js.Any = js.native
  }
  /* static members */
  object Protocol {
    
    @JSImport("node-ral", "Protocol")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def beforeRequest(context: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeRequest")(context.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def normalizeConfig(context: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(context.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object RAL {
    
    @scala.inline
    def apply(serviceName: String): RalRunner = ^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any]).asInstanceOf[RalRunner]
    @scala.inline
    def apply(serviceName: String, options: js.Object): RalRunner = (^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RalRunner]
    
    @JSImport("node-ral", "RAL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-ral", "RAL.NormalizerManager")
    @js.native
    class NormalizerManager () extends StObject {
      
      @JSName("apply")
      def apply(config: js.Object): js.Object = js.native
      
      def needUpdate(config: js.Any): Boolean = js.native
      
      var normalizers: js.Array[String] = js.native
      
      def setConfigNormalizer(normalizers: js.Array[String]): Unit = js.native
    }
    
    @JSImport("node-ral", "RAL.RalRunner")
    @js.native
    class RalRunner protected () extends EventEmitter {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
      
      def callRetry(err: js.Any): Unit = js.native
      
      def doRequest(): Unit = js.native
      
      def getLogInfo(): LogInfo = js.native
      
      def throwError(err: js.Any): Unit = js.native
    }
    
    @scala.inline
    def appendExtPath(extPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendExtPath")(extPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def getConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    @scala.inline
    def getRawConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    @scala.inline
    def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    @scala.inline
    def init(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    @scala.inline
    def reload(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigNormalizer")(normalizers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def RALPromise[T](name: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def RALPromise[T](name: String, options: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("node-ral", "RalModule")
  @js.native
  abstract class RalModule () extends StObject {
    
    def getCategory(): String = js.native
    
    def getName(): String = js.native
  }
  /* static members */
  object RalModule {
    
    @JSImport("node-ral", "RalModule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    @scala.inline
    def load(pathOrModule: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def load(pathOrModule: RalModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("node-ral", "RalModule.modules")
    @js.native
    def modules: StringDictionary[RalModule] = js.native
    @scala.inline
    def modules_=(x: StringDictionary[RalModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  type BalanceContextConstructor = Instantiable2[/* serviceID */ String, /* service */ Service, BalanceContextClass]
  
  trait LogInfo extends StObject {
    
    var conv: String
    
    var cost: String
    
    var method: String
    
    var pack: String
    
    var path: String
    
    var prot: String
    
    var proxy: String
    
    var query: String
    
    var read: String
    
    var remote: String
    
    var requestID: String
    
    var retry: String
    
    var service: String
    
    var talk: String
    
    var unpack: String
    
    var write: String
  }
  object LogInfo {
    
    @scala.inline
    def apply(
      conv: String,
      cost: String,
      method: String,
      pack: String,
      path: String,
      prot: String,
      proxy: String,
      query: String,
      read: String,
      remote: String,
      requestID: String,
      retry: String,
      service: String,
      talk: String,
      unpack: String,
      write: String
    ): LogInfo = {
      val __obj = js.Dynamic.literal(conv = conv.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prot = prot.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], requestID = requestID.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], talk = talk.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    @scala.inline
    implicit class LogInfoMutableBuilder[Self <: LogInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConv(value: String): Self = StObject.set(x, "conv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPack(value: String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProt(value: String): Self = StObject.set(x, "prot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestID(value: String): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTalk(value: String): Self = StObject.set(x, "talk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpack(value: String): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoggerFactory extends StObject {
    
    def apply(prefix: String): RalLogger = js.native
    
    var options: App = js.native
  }
  
  trait RalLogger extends StObject {
    
    def debug(param: js.Any*): Unit
    
    def fatal(param: js.Any*): Unit
    
    def notice(param: js.Any*): Unit
    
    def trace(param: js.Any*): Unit
    
    def warning(param: js.Any*): Unit
  }
  object RalLogger {
    
    @scala.inline
    def apply(
      debug: /* repeated */ js.Any => Unit,
      fatal: /* repeated */ js.Any => Unit,
      notice: /* repeated */ js.Any => Unit,
      trace: /* repeated */ js.Any => Unit,
      warning: /* repeated */ js.Any => Unit
    ): RalLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), fatal = js.Any.fromFunction1(fatal), notice = js.Any.fromFunction1(notice), trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[RalLogger]
    }
    
    @scala.inline
    implicit class RalLoggerMutableBuilder[Self <: RalLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFatal(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotice(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarning(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  trait Server extends StObject {
    
    var host: String
    
    var idc: js.UndefOr[String] = js.undefined
    
    var port: String | Double
  }
  object Server {
    
    @scala.inline
    def apply(host: String, port: String | Double): Server = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdc(value: String): Self = StObject.set(x, "idc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdcUndefined: Self = StObject.set(x, "idc", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service extends StObject {
    
    var balance: random | roundrobin | hashring
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var encoding: js.UndefOr[`utf-8` | GBK] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var hybird: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[GET | POST] = js.undefined
    
    var pack: buildInConverter
    
    var path: js.UndefOr[String] = js.undefined
    
    var protocol: http | https | soap | redis
    
    var query: js.UndefOr[js.Any] = js.undefined
    
    var retry: js.UndefOr[Double] = js.undefined
    
    var server: js.Array[Server]
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var unpack: buildInConverter
  }
  object Service {
    
    @scala.inline
    def apply(
      balance: random | roundrobin | hashring,
      pack: buildInConverter,
      protocol: http | https | soap | redis,
      server: js.Array[Server],
      unpack: buildInConverter
    ): Service = {
      val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalance(value: random | roundrobin | hashring): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEncoding(value: `utf-8` | GBK): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHybird(value: Boolean): Self = StObject.set(x, "hybird", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHybirdUndefined: Self = StObject.set(x, "hybird", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPack(value: buildInConverter): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProtocol(value: http | https | soap | redis): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setServer(value: js.Array[Server]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerVarargs(value: Server*): Self = StObject.set(x, "server", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUnpack(value: buildInConverter): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeRal.nodeRalStrings.form
    - typings.nodeRal.nodeRalStrings.formData
    - typings.nodeRal.nodeRalStrings.json
    - typings.nodeRal.nodeRalStrings.protobuf
    - typings.nodeRal.nodeRalStrings.querystring
    - typings.nodeRal.nodeRalStrings.raw
    - typings.nodeRal.nodeRalStrings.redis
    - typings.nodeRal.nodeRalStrings.stream
    - typings.nodeRal.nodeRalStrings.string
  */
  trait buildInConverter extends StObject
  object buildInConverter {
    
    @scala.inline
    def form: typings.nodeRal.nodeRalStrings.form = "form".asInstanceOf[typings.nodeRal.nodeRalStrings.form]
    
    @scala.inline
    def formData: typings.nodeRal.nodeRalStrings.formData = "formData".asInstanceOf[typings.nodeRal.nodeRalStrings.formData]
    
    @scala.inline
    def json: typings.nodeRal.nodeRalStrings.json = "json".asInstanceOf[typings.nodeRal.nodeRalStrings.json]
    
    @scala.inline
    def protobuf: typings.nodeRal.nodeRalStrings.protobuf = "protobuf".asInstanceOf[typings.nodeRal.nodeRalStrings.protobuf]
    
    @scala.inline
    def querystring: typings.nodeRal.nodeRalStrings.querystring = "querystring".asInstanceOf[typings.nodeRal.nodeRalStrings.querystring]
    
    @scala.inline
    def raw: typings.nodeRal.nodeRalStrings.raw = "raw".asInstanceOf[typings.nodeRal.nodeRalStrings.raw]
    
    @scala.inline
    def redis: typings.nodeRal.nodeRalStrings.redis = "redis".asInstanceOf[typings.nodeRal.nodeRalStrings.redis]
    
    @scala.inline
    def stream: typings.nodeRal.nodeRalStrings.stream = "stream".asInstanceOf[typings.nodeRal.nodeRalStrings.stream]
    
    @scala.inline
    def string: typings.nodeRal.nodeRalStrings.string = "string".asInstanceOf[typings.nodeRal.nodeRalStrings.string]
  }
}
