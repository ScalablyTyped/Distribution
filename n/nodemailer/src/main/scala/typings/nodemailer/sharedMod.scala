package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import typings.nodemailer.smtpConnectionMod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("nodemailer/lib/shared", "assign")
  @js.native
  def assign(target: js.Object, sources: js.Object*): js.Object = js.native
  
  @JSImport("nodemailer/lib/shared", "callbackPromise")
  @js.native
  def callbackPromise(resolve: js.Function1[/* repeated */ js.Any, Unit], reject: js.Function1[/* err */ Error, Unit]): js.Function0[Unit] = js.native
  
  @JSImport("nodemailer/lib/shared", "encodeXText")
  @js.native
  def encodeXText(str: String): String = js.native
  
  @JSImport("nodemailer/lib/shared", "getLogger")
  @js.native
  def getLogger(): Logger = js.native
  @JSImport("nodemailer/lib/shared", "getLogger")
  @js.native
  def getLogger(options: js.UndefOr[scala.Nothing], defaults: StringDictionary[js.Any]): Logger = js.native
  @JSImport("nodemailer/lib/shared", "getLogger")
  @js.native
  def getLogger(options: StringDictionary[js.Any]): Logger = js.native
  @JSImport("nodemailer/lib/shared", "getLogger")
  @js.native
  def getLogger(options: StringDictionary[js.Any], defaults: StringDictionary[js.Any]): Logger = js.native
  
  @JSImport("nodemailer/lib/shared", "parseConnectionUrl")
  @js.native
  def parseConnectionUrl(url: String): Options = js.native
  
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(data: js.Array[_], key: String): js.Promise[Buffer | String] = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(
    data: js.Array[_],
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(data: js.Array[_], key: Double): js.Promise[Buffer | String] = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(
    data: js.Array[_],
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(data: js.Object, key: String): js.Promise[Buffer | String] = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(data: js.Object, key: Double): js.Promise[Buffer | String] = js.native
  @JSImport("nodemailer/lib/shared", "resolveContent")
  @js.native
  def resolveContent(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  
  @JSImport("nodemailer/lib/shared", "resolveHostname")
  @js.native
  def resolveHostname(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  @JSImport("nodemailer/lib/shared", "resolveHostname")
  @js.native
  def resolveHostname(
    options: Null,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  @JSImport("nodemailer/lib/shared", "resolveHostname")
  @js.native
  def resolveHostname(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  
  @js.native
  trait Logger extends StObject {
    
    def debug(params: js.Any*): Unit = js.native
    
    def error(params: js.Any*): Unit = js.native
    
    def fatal(params: js.Any*): Unit = js.native
    
    def info(params: js.Any*): Unit = js.native
    
    def level(level: LoggerLevel): Unit = js.native
    
    def trace(params: js.Any*): Unit = js.native
    
    def warn(params: js.Any*): Unit = js.native
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
  
  @js.native
  trait ResolveHostnameOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String | `false`] = js.native
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
  
  @js.native
  trait ResolveHostnameValue extends StObject {
    
    var _cached: js.UndefOr[`true`] = js.native
    
    var host: String = js.native
    
    var servername: String | `false` = js.native
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
