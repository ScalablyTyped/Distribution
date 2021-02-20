package typings.neverbounce

import typings.neverbounce.anon.Academichost
import typings.neverbounce.anon.Complete
import typings.neverbounce.anon.ContentType
import typings.neverbounce.anon.Remote
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neverbounce", JSImport.Namespace)
  @js.native
  class ^ protected () extends NeverBounce {
    def this(config: Config) = this()
  }
  @JSImport("neverbounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("neverbounce", "defaultConfig")
  @js.native
  def defaultConfig: Config = js.native
  @scala.inline
  def defaultConfig_=(x: Config): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
  
  /* static member */
  object job {
    
    @JSImport("neverbounce", "job")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("neverbounce", "job.inputType")
    @js.native
    def inputType: Remote = js.native
    @scala.inline
    def inputType_=(x: Remote): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputType")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "job.status")
    @js.native
    def status: Complete = js.native
    @scala.inline
    def status_=(x: Complete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object result {
    
    @JSImport("neverbounce", "result")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("neverbounce", "result.catchall")
    @js.native
    def catchall: Double = js.native
    @scala.inline
    def catchall_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("catchall")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.disposable")
    @js.native
    def disposable: Double = js.native
    @scala.inline
    def disposable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposable")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.flags")
    @js.native
    def flags: Academichost = js.native
    @scala.inline
    def flags_=(x: Academichost): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flags")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.invalid")
    @js.native
    def invalid: Double = js.native
    @scala.inline
    def invalid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.unknown")
    @js.native
    def unknown: Double = js.native
    @scala.inline
    def unknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknown")(x.asInstanceOf[js.Any])
    
    @JSImport("neverbounce", "result.valid")
    @js.native
    def valid: Double = js.native
    @scala.inline
    def valid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
    
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
  }
  
  @js.native
  trait Account extends StObject {
    
    def info(): js.Promise[typings.std.Response] = js.native
  }
  object Account {
    
    @scala.inline
    def apply(info: () => js.Promise[typings.std.Response]): Account = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction0(info))
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: () => js.Promise[typings.std.Response]): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var apiKey: js.UndefOr[js.Any] = js.native
    
    var opts: js.UndefOr[ConfigOptions] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: js.Any): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setOpts(value: ConfigOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var acceptedType: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[ContentType] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptedType(value: String): Self = StObject.set(x, "acceptedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptedTypeUndefined: Self = StObject.set(x, "acceptedType", js.undefined)
      
      @scala.inline
      def setHeaders(value: ContentType): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  type Errors = Error
  
  @js.native
  trait Jobs extends StObject {
    
    def create(input: js.Any, inputLocation: js.Any, fileName: js.Any): js.Promise[typings.std.Response] = js.native
    def create(
      input: js.Any,
      inputLocation: js.Any,
      fileName: js.Any,
      runSample: js.UndefOr[scala.Nothing],
      autoParse: js.UndefOr[scala.Nothing],
      autoStart: js.Any
    ): js.Promise[typings.std.Response] = js.native
    def create(
      input: js.Any,
      inputLocation: js.Any,
      fileName: js.Any,
      runSample: js.UndefOr[scala.Nothing],
      autoParse: js.Any
    ): js.Promise[typings.std.Response] = js.native
    def create(
      input: js.Any,
      inputLocation: js.Any,
      fileName: js.Any,
      runSample: js.UndefOr[scala.Nothing],
      autoParse: js.Any,
      autoStart: js.Any
    ): js.Promise[typings.std.Response] = js.native
    def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any): js.Promise[typings.std.Response] = js.native
    def create(
      input: js.Any,
      inputLocation: js.Any,
      fileName: js.Any,
      runSample: js.Any,
      autoParse: js.UndefOr[scala.Nothing],
      autoStart: js.Any
    ): js.Promise[typings.std.Response] = js.native
    def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any, autoParse: js.Any): js.Promise[typings.std.Response] = js.native
    def create(
      input: js.Any,
      inputLocation: js.Any,
      fileName: js.Any,
      runSample: js.Any,
      autoParse: js.Any,
      autoStart: js.Any
    ): js.Promise[typings.std.Response] = js.native
    
    def download(jobId: Double): js.Promise[typings.std.Response] = js.native
    
    def parse(jobId: Double): js.Promise[typings.std.Response] = js.native
    def parse(jobId: Double, autoStart: js.Any): js.Promise[typings.std.Response] = js.native
    
    def results(jobId: Double, query: js.Any): js.Promise[typings.std.Response] = js.native
    
    def search(query: js.Any): js.Promise[typings.std.Response] = js.native
    
    def start(jobId: Double): js.Promise[typings.std.Response] = js.native
    def start(jobId: Double, runSample: js.Any): js.Promise[typings.std.Response] = js.native
    
    def status(jobId: Double): js.Promise[typings.std.Response] = js.native
  }
  
  @js.native
  trait NeverBounce extends StObject {
    
    var account: Account = js.native
    
    var errors: Errors = js.native
    
    def getConfig(): Config = js.native
    
    def getRequestOpts(opts: ConfigOptions): ConfigOptions = js.native
    
    var jobs: Jobs = js.native
    
    var poe: Poe = js.native
    
    def setApiKey(key: String): Unit = js.native
    
    def setHost(host: String): Unit = js.native
    
    var single: Single = js.native
  }
  object NeverBounce {
    
    @scala.inline
    def apply(
      account: Account,
      errors: Errors,
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
    
    @scala.inline
    implicit class NeverBounceMutableBuilder[Self <: NeverBounce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetConfig(value: () => Config): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRequestOpts(value: ConfigOptions => ConfigOptions): Self = StObject.set(x, "getRequestOpts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJobs(value: Jobs): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoe(value: Poe): Self = StObject.set(x, "poe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetApiKey(value: String => Unit): Self = StObject.set(x, "setApiKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHost(value: String => Unit): Self = StObject.set(x, "setHost", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSingle(value: Single): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Poe extends StObject {
    
    def confirm(email: String, result: String, confirmationToken: String, transactionId: String): js.Promise[typings.std.Response] = js.native
  }
  object Poe {
    
    @scala.inline
    def apply(confirm: (String, String, String, String) => js.Promise[typings.std.Response]): Poe = {
      val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction4(confirm))
      __obj.asInstanceOf[Poe]
    }
    
    @scala.inline
    implicit class PoeMutableBuilder[Self <: Poe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirm(value: (String, String, String, String) => js.Promise[typings.std.Response]): Self = StObject.set(x, "confirm", js.Any.fromFunction4(value))
    }
  }
  
  type Response = js.Object
  
  @js.native
  trait Single extends StObject {
    
    def check(email: String): js.Promise[typings.std.Response] = js.native
    def check(
      email: String,
      addressInfo: js.UndefOr[scala.Nothing],
      creditsInfo: js.UndefOr[scala.Nothing],
      timeout: js.Any
    ): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: js.UndefOr[scala.Nothing], creditsInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: js.UndefOr[scala.Nothing], creditsInfo: Boolean, timeout: js.Any): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: js.UndefOr[scala.Nothing], timeout: js.Any): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: Boolean): js.Promise[typings.std.Response] = js.native
    def check(email: String, addressInfo: Boolean, creditsInfo: Boolean, timeout: js.Any): js.Promise[typings.std.Response] = js.native
  }
}
