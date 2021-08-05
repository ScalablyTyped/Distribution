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
    
    inline def BalanceContext_=(x: BalanceContextConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BalanceContext")(x.asInstanceOf[js.Any])
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
  
  inline def Middleware(): js.Function3[
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
  inline def Middleware(options: Service): js.Function3[
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
    
    inline def beforeRequest(context: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeRequest")(context.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def normalizeConfig(context: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(context.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  object RAL {
    
    inline def apply(serviceName: String): RalRunner = ^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any]).asInstanceOf[RalRunner]
    inline def apply(serviceName: String, options: js.Object): RalRunner = (^.asInstanceOf[js.Dynamic].apply(serviceName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RalRunner]
    
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
    
    inline def appendExtPath(extPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("appendExtPath")(extPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    inline def getRawConf(name: String): typings.nodeRal.mod.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawConf")(name.asInstanceOf[js.Any]).asInstanceOf[typings.nodeRal.mod.Config]
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    inline def reload(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfigNormalizer")(normalizers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def RALPromise[T](name: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def RALPromise[T](name: String, options: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("RALPromise")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
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
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def load(pathOrModule: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load(pathOrModule: RalModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(pathOrModule.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("node-ral", "RalModule.modules")
    @js.native
    def modules: StringDictionary[RalModule] = js.native
    inline def modules_=(x: StringDictionary[RalModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
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
    
    inline def apply(
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
    
    extension [Self <: LogInfo](x: Self) {
      
      inline def setConv(value: String): Self = StObject.set(x, "conv", value.asInstanceOf[js.Any])
      
      inline def setCost(value: String): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPack(value: String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProt(value: String): Self = StObject.set(x, "prot", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRequestID(value: String): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: String): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setTalk(value: String): Self = StObject.set(x, "talk", value.asInstanceOf[js.Any])
      
      inline def setUnpack(value: String): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      debug: /* repeated */ js.Any => Unit,
      fatal: /* repeated */ js.Any => Unit,
      notice: /* repeated */ js.Any => Unit,
      trace: /* repeated */ js.Any => Unit,
      warning: /* repeated */ js.Any => Unit
    ): RalLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), fatal = js.Any.fromFunction1(fatal), notice = js.Any.fromFunction1(notice), trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[RalLogger]
    }
    
    extension [Self <: RalLogger](x: Self) {
      
      inline def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setFatal(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      inline def setNotice(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setWarning(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
  
  trait Server extends StObject {
    
    var host: String
    
    var idc: js.UndefOr[String] = js.undefined
    
    var port: String | Double
  }
  object Server {
    
    inline def apply(host: String, port: String | Double): Server = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIdc(value: String): Self = StObject.set(x, "idc", value.asInstanceOf[js.Any])
      
      inline def setIdcUndefined: Self = StObject.set(x, "idc", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      balance: random | roundrobin | hashring,
      pack: buildInConverter,
      protocol: http | https | soap | redis,
      server: js.Array[Server],
      unpack: buildInConverter
    ): Service = {
      val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setBalance(value: random | roundrobin | hashring): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: `utf-8` | GBK): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHybird(value: Boolean): Self = StObject.set(x, "hybird", value.asInstanceOf[js.Any])
      
      inline def setHybirdUndefined: Self = StObject.set(x, "hybird", js.undefined)
      
      inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPack(value: buildInConverter): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: http | https | soap | redis): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setServer(value: js.Array[Server]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerVarargs(value: Server*): Self = StObject.set(x, "server", js.Array(value :_*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUnpack(value: buildInConverter): Self = StObject.set(x, "unpack", value.asInstanceOf[js.Any])
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
    
    inline def form: typings.nodeRal.nodeRalStrings.form = "form".asInstanceOf[typings.nodeRal.nodeRalStrings.form]
    
    inline def formData: typings.nodeRal.nodeRalStrings.formData = "formData".asInstanceOf[typings.nodeRal.nodeRalStrings.formData]
    
    inline def json: typings.nodeRal.nodeRalStrings.json = "json".asInstanceOf[typings.nodeRal.nodeRalStrings.json]
    
    inline def protobuf: typings.nodeRal.nodeRalStrings.protobuf = "protobuf".asInstanceOf[typings.nodeRal.nodeRalStrings.protobuf]
    
    inline def querystring: typings.nodeRal.nodeRalStrings.querystring = "querystring".asInstanceOf[typings.nodeRal.nodeRalStrings.querystring]
    
    inline def raw: typings.nodeRal.nodeRalStrings.raw = "raw".asInstanceOf[typings.nodeRal.nodeRalStrings.raw]
    
    inline def redis: typings.nodeRal.nodeRalStrings.redis = "redis".asInstanceOf[typings.nodeRal.nodeRalStrings.redis]
    
    inline def stream: typings.nodeRal.nodeRalStrings.stream = "stream".asInstanceOf[typings.nodeRal.nodeRalStrings.stream]
    
    inline def string: typings.nodeRal.nodeRalStrings.string = "string".asInstanceOf[typings.nodeRal.nodeRalStrings.string]
  }
}
