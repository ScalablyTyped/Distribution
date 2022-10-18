package typings.miniget

import org.scalablytyped.runtime.StringDictionary
import typings.miniget.anon.Inc
import typings.miniget.anon.Message
import typings.miniget.minigetStrings.reconnect
import typings.miniget.minigetStrings.redirect
import typings.miniget.minigetStrings.retry
import typings.node.NodeJS.CallSite
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Transform
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  inline def apply(url: String): Stream = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Stream]
  inline def apply(url: String, options: Options): Stream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream]
  inline def apply(url: URL): Stream = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Stream]
  inline def apply(url: URL, options: Options): Stream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream]
  
  @JSImport("miniget/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object MinigetError {
    
    @JSImport("miniget/dist", "MinigetError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def captureStackTrace(targetObject: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(targetObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def captureStackTrace(targetObject: js.Object, constructorOpt: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(targetObject.asInstanceOf[js.Any], constructorOpt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("miniget/dist", "MinigetError.prepareStackTrace")
    @js.native
    def prepareStackTrace: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ js.Array[CallSite], Any]] = js.native
    inline def prepareStackTrace_=(x: js.UndefOr[js.Function2[/* err */ js.Error, /* stackTraces */ js.Array[CallSite], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prepareStackTrace")(x.asInstanceOf[js.Any])
    
    @JSImport("miniget/dist", "MinigetError.stackTraceLimit")
    @js.native
    def stackTraceLimit: Double = js.native
    inline def stackTraceLimit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(x.asInstanceOf[js.Any])
  }
  type MinigetError = js.Error
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("miniget/dist", "MinigetError")
  @js.native
  open class MinigetErrorCls protected ()
    extends StObject
       with Message {
    def this(message: String) = this()
    def this(message: String, statusCode: Double) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  object defaultOptions {
    
    @JSImport("miniget/dist", "defaultOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("miniget/dist", "defaultOptions.backoff")
    @js.native
    def backoff: Inc = js.native
    inline def backoff_=(x: Inc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backoff")(x.asInstanceOf[js.Any])
    
    @JSImport("miniget/dist", "defaultOptions.maxReconnects")
    @js.native
    def maxReconnects: Double = js.native
    inline def maxReconnects_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxReconnects")(x.asInstanceOf[js.Any])
    
    @JSImport("miniget/dist", "defaultOptions.maxRedirects")
    @js.native
    def maxRedirects: Double = js.native
    inline def maxRedirects_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(x.asInstanceOf[js.Any])
    
    @JSImport("miniget/dist", "defaultOptions.maxRetries")
    @js.native
    def maxRetries: Double = js.native
    inline def maxRetries_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(x.asInstanceOf[js.Any])
  }
  type defaultOptions = Options
  
  trait DefaultOptions_
    extends StObject
       with Options {
    
    @JSName("backoff")
    var backoff_DefaultOptions_ : Inc
    
    @JSName("maxReconnects")
    var maxReconnects_DefaultOptions_ : Double
    
    @JSName("maxRedirects")
    var maxRedirects_DefaultOptions_ : Double
    
    @JSName("maxRetries")
    var maxRetries_DefaultOptions_ : Double
  }
  object DefaultOptions_ {
    
    inline def apply(backoff: Inc, maxReconnects: Double, maxRedirects: Double, maxRetries: Double): DefaultOptions_ = {
      val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], maxReconnects = maxReconnects.asInstanceOf[js.Any], maxRedirects = maxRedirects.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions_]
    }
    
    extension [Self <: DefaultOptions_](x: Self) {
      
      inline def setBackoff(value: Inc): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnects(value: Double): Self = StObject.set(x, "maxReconnects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with ClientRequestArgs {
    
    var acceptEncoding: js.UndefOr[StringDictionary[js.Function0[Transform]]] = js.undefined
    
    var backoff: js.UndefOr[Inc] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var maxReconnects: js.UndefOr[Double] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* parsedUrl */ RequestOptions, RequestOptions]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcceptEncoding(value: StringDictionary[js.Function0[Transform]]): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
      
      inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
      
      inline def setBackoff(value: Inc): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setMaxReconnects(value: Double): Self = StObject.set(x, "maxReconnects", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectsUndefined: Self = StObject.set(x, "maxReconnects", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setTransform(value: /* parsedUrl */ RequestOptions => RequestOptions): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait Stream extends PassThrough {
    
    def abort(): Unit = js.native
    def abort(err: js.Error): Unit = js.native
    
    var aborted: Boolean = js.native
    
    def destroy(): this.type = js.native
    def destroy(err: js.Error): this.type = js.native
    
    var destroyed: Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* args */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* args */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnect(
      event: reconnect,
      listener: js.Function2[/* attempt */ Double, /* err */ js.UndefOr[js.Error], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_redirect(event: redirect, listener: js.Function1[/* url */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_retry(event: retry, listener: js.Function2[/* attempt */ Double, /* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    def text(): js.Promise[String] = js.native
  }
}
