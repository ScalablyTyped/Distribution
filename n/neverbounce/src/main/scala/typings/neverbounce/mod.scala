package typings.neverbounce

import typings.neverbounce.anon.Academichost
import typings.neverbounce.anon.Complete
import typings.neverbounce.anon.ContentType
import typings.neverbounce.anon.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neverbounce", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NeverBounce {
    def this(config: Config) = this()
    
    /* CompleteClass */
    var account: Account = js.native
    
    /* CompleteClass */
    var errors: js.Error = js.native
    
    /* CompleteClass */
    override def getConfig(): Config = js.native
    
    /* CompleteClass */
    override def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
    
    /* CompleteClass */
    var jobs: Jobs = js.native
    
    /* CompleteClass */
    var poe: Poe = js.native
    
    /* CompleteClass */
    override def setApiKey(key: String): Unit = js.native
    
    /* CompleteClass */
    override def setHost(host: String): Unit = js.native
    
    /* CompleteClass */
    var single: Single = js.native
  }
  @JSImport("neverbounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("neverbounce", "defaultConfig")
  @js.native
  def defaultConfig: Config = js.native
  inline def defaultConfig_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
  
  /* static member */
  object job {
    
    @JSImport("neverbounce", "job")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("neverbounce", "job.inputType")
    @js.native
    def inputType: Remote = js.native
    inline def inputType_=(x: Remote): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputType")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "job.status")
    @js.native
    def status: Complete = js.native
    inline def status_=(x: Complete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object result {
    
    @JSImport("neverbounce", "result")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("neverbounce", "result.0")
    @js.native
    val `0`: String = js.native
    
    @JSImport("neverbounce", "result.1")
    @js.native
    val `1`: String = js.native
    
    @JSImport("neverbounce", "result.2")
    @js.native
    val `2`: String = js.native
    
    @JSImport("neverbounce", "result.3")
    @js.native
    val `3`: String = js.native
    
    @JSImport("neverbounce", "result.4")
    @js.native
    val `4`: String = js.native
    
    @JSImport("neverbounce", "result.catchall")
    @js.native
    def catchall: Double = js.native
    inline def catchall_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("catchall")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.disposable")
    @js.native
    def disposable: Double = js.native
    inline def disposable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposable")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.flags")
    @js.native
    def flags: Academichost = js.native
    inline def flags_=(x: Academichost): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flags")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.invalid")
    @js.native
    def invalid: Double = js.native
    inline def invalid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.unknown")
    @js.native
    def unknown: Double = js.native
    inline def unknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknown")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.valid")
    @js.native
    def valid: Double = js.native
    inline def valid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  trait Account extends StObject {
    
    def info(): js.Promise[typings.std.Response]
  }
  object Account {
    
    inline def apply(info: () => js.Promise[typings.std.Response]): Account = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction0(info))
      __obj.asInstanceOf[Account]
    }
    
    extension [Self <: Account](x: Self) {
      
      inline def setInfo(value: () => js.Promise[typings.std.Response]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    }
  }
  
  trait Config extends StObject {
    
    var apiKey: js.UndefOr[Any] = js.undefined
    
    var opts: js.UndefOr[ConfigOptions] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApiKey(value: Any): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setOpts(value: ConfigOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    var acceptedType: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[ContentType] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setAcceptedType(value: String): Self = StObject.set(x, "acceptedType", value.asInstanceOf[js.Any])
      
      inline def setAcceptedTypeUndefined: Self = StObject.set(x, "acceptedType", js.undefined)
      
      inline def setHeaders(value: ContentType): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  type Errors = js.Error
  
  @js.native
  trait Jobs extends StObject {
    
    def create(input: Any, inputLocation: Any, fileName: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Any, autoParse: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Any, autoParse: Any, autoStart: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Any, autoParse: Unit, autoStart: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Unit, autoParse: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Unit, autoParse: Any, autoStart: Any): js.Promise[typings.std.Response] = js.native
    def create(input: Any, inputLocation: Any, fileName: Any, runSample: Unit, autoParse: Unit, autoStart: Any): js.Promise[typings.std.Response] = js.native
    
    def download(jobId: Double): js.Promise[typings.std.Response] = js.native
    
    def parse(jobId: Double): js.Promise[typings.std.Response] = js.native
    def parse(jobId: Double, autoStart: Any): js.Promise[typings.std.Response] = js.native
    
    def results(jobId: Double, query: Any): js.Promise[typings.std.Response] = js.native
    
    def search(query: Any): js.Promise[typings.std.Response] = js.native
    
    def start(jobId: Double): js.Promise[typings.std.Response] = js.native
    def start(jobId: Double, runSample: Any): js.Promise[typings.std.Response] = js.native
    
    def status(jobId: Double): js.Promise[typings.std.Response] = js.native
  }
  
  trait NeverBounce extends StObject {
    
    var account: Account
    
    var errors: js.Error
    
    def getConfig(): Config
    
    def getRequestOpts(opts: ConfigOptions): ConfigOptions
    
    var jobs: Jobs
    
    var poe: Poe
    
    def setApiKey(key: String): Unit
    
    def setHost(host: String): Unit
    
    var single: Single
  }
  object NeverBounce {
    
    inline def apply(
      account: Account,
      errors: js.Error,
      getConfig: () => Config,
      getRequestOpts: ConfigOptions => ConfigOptions,
      jobs: Jobs,
      poe: Poe,
      setApiKey: String => Unit,
      setHost: String => Unit,
      single: Single
    ): NeverBounce = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getRequestOpts = js.Any.fromFunction1(getRequestOpts), jobs = jobs.asInstanceOf[js.Any], poe = poe.asInstanceOf[js.Any], setApiKey = js.Any.fromFunction1(setApiKey), setHost = js.Any.fromFunction1(setHost), single = single.asInstanceOf[js.Any])
      __obj.asInstanceOf[NeverBounce]
    }
    
    extension [Self <: NeverBounce](x: Self) {
      
      inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Error): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setGetConfig(value: () => Config): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      inline def setGetRequestOpts(value: ConfigOptions => ConfigOptions): Self = StObject.set(x, "getRequestOpts", js.Any.fromFunction1(value))
      
      inline def setJobs(value: Jobs): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setPoe(value: Poe): Self = StObject.set(x, "poe", value.asInstanceOf[js.Any])
      
      inline def setSetApiKey(value: String => Unit): Self = StObject.set(x, "setApiKey", js.Any.fromFunction1(value))
      
      inline def setSetHost(value: String => Unit): Self = StObject.set(x, "setHost", js.Any.fromFunction1(value))
      
      inline def setSingle(value: Single): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    }
  }
  
  trait Poe extends StObject {
    
    def confirm(email: String, result: String, confirmationToken: String, transactionId: String): js.Promise[typings.std.Response]
  }
  object Poe {
    
    inline def apply(confirm: (String, String, String, String) => js.Promise[typings.std.Response]): Poe = {
      val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction4(confirm))
      __obj.asInstanceOf[Poe]
    }
    
    extension [Self <: Poe](x: Self) {
      
      inline def setConfirm(value: (String, String, String, String) => js.Promise[typings.std.Response]): Self = StObject.set(x, "confirm", js.Any.fromFunction4(value))
    }
  }
  
  type Response = js.Object
  
  @js.native
  trait Single extends StObject {
    
    def check(email: String): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: Boolean, timeout: Any): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: Unit, timeout: Any): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Unit, creditsInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Unit, creditsInfo: Boolean, timeout: Any): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Unit, creditsInfo: Unit, timeout: Any): js.Promise[typings.std.Response] = js.native
  }
}
