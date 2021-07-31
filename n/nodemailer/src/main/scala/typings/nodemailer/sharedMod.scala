package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.smtpConnectionMod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("nodemailer/lib/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assign(target: js.Object, sources: js.Object*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def callbackPromise(resolve: js.Function1[/* repeated */ js.Any, Unit], reject: js.Function1[/* err */ Error, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("callbackPromise")(resolve.asInstanceOf[js.Any], reject.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def encodeXText(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeXText")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  @scala.inline
  def getLogger(options: StringDictionary[js.Any]): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  @scala.inline
  def getLogger(options: StringDictionary[js.Any], defaults: StringDictionary[js.Any]): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Logger]
  @scala.inline
  def getLogger(options: Unit, defaults: StringDictionary[js.Any]): Logger = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Logger]
  
  @scala.inline
  def parseConnectionUrl(url: String): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConnectionUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  @scala.inline
  def resolveContent(data: js.Array[js.Any], key: String): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  @scala.inline
  def resolveContent(
    data: js.Array[js.Any],
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveContent(data: js.Array[js.Any], key: Double): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  @scala.inline
  def resolveContent(
    data: js.Array[js.Any],
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveContent(data: js.Object, key: String): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  @scala.inline
  def resolveContent(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveContent(data: js.Object, key: Double): js.Promise[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | String]]
  @scala.inline
  def resolveContent(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContent")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveHostname(
    options: Null,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveHostname(
    options: Unit,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveHostname(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostname")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Logger extends StObject {
    
    def debug(params: js.Any*): Unit
    
    def error(params: js.Any*): Unit
    
    def fatal(params: js.Any*): Unit
    
    def info(params: js.Any*): Unit
    
    def level(level: LoggerLevel): Unit
    
    def trace(params: js.Any*): Unit
    
    def warn(params: js.Any*): Unit
  }
  object Logger {
    
    @scala.inline
    def apply(
      debug: /* repeated */ js.Any => Unit,
      error: /* repeated */ js.Any => Unit,
      fatal: /* repeated */ js.Any => Unit,
      info: /* repeated */ js.Any => Unit,
      level: LoggerLevel => Unit,
      trace: /* repeated */ js.Any => Unit,
      warn: /* repeated */ js.Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFatal(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLevel(value: LoggerLevel => Unit): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrace(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.nodemailerStrings.trace
    - typings.nodemailer.nodemailerStrings.debug
    - typings.nodemailer.nodemailerStrings.info
    - typings.nodemailer.nodemailerStrings.warn
    - typings.nodemailer.nodemailerStrings.error
    - typings.nodemailer.nodemailerStrings.fatal
  */
  trait LoggerLevel extends StObject
  object LoggerLevel {
    
    @scala.inline
    def debug: typings.nodemailer.nodemailerStrings.debug = "debug".asInstanceOf[typings.nodemailer.nodemailerStrings.debug]
    
    @scala.inline
    def error: typings.nodemailer.nodemailerStrings.error = "error".asInstanceOf[typings.nodemailer.nodemailerStrings.error]
    
    @scala.inline
    def fatal: typings.nodemailer.nodemailerStrings.fatal = "fatal".asInstanceOf[typings.nodemailer.nodemailerStrings.fatal]
    
    @scala.inline
    def info: typings.nodemailer.nodemailerStrings.info = "info".asInstanceOf[typings.nodemailer.nodemailerStrings.info]
    
    @scala.inline
    def trace: typings.nodemailer.nodemailerStrings.trace = "trace".asInstanceOf[typings.nodemailer.nodemailerStrings.trace]
    
    @scala.inline
    def warn: typings.nodemailer.nodemailerStrings.warn = "warn".asInstanceOf[typings.nodemailer.nodemailerStrings.warn]
  }
  
  trait ResolveHostnameOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String | `false`] = js.undefined
  }
  object ResolveHostnameOptions {
    
    @scala.inline
    def apply(): ResolveHostnameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveHostnameOptions]
    }
    
    @scala.inline
    implicit class ResolveHostnameOptionsMutableBuilder[Self <: ResolveHostnameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setServername(value: String | `false`): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  trait ResolveHostnameValue extends StObject {
    
    var _cached: js.UndefOr[`true`] = js.undefined
    
    var host: String
    
    var servername: String | `false`
  }
  object ResolveHostnameValue {
    
    @scala.inline
    def apply(host: String, servername: String | `false`): ResolveHostnameValue = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], servername = servername.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveHostnameValue]
    }
    
    @scala.inline
    implicit class ResolveHostnameValueMutableBuilder[Self <: ResolveHostnameValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServername(value: String | `false`): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_cached(value: `true`): Self = StObject.set(x, "_cached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_cachedUndefined: Self = StObject.set(x, "_cached", js.undefined)
    }
  }
}
