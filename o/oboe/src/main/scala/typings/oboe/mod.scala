package typings.oboe

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.oboe.oboeStrings.data
import typings.oboe.oboeStrings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("oboe", JSImport.Namespace)
  @js.native
  val ^ : OboeFunction = js.native
  
  type CallbackSignature = js.Function3[/* node */ Any, /* pathOrHeaders */ Any, /* ancestors */ js.Array[js.Object], Any]
  
  trait FailReason extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var jsonBody: js.UndefOr[js.Object] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var thrown: js.UndefOr[js.Error] = js.undefined
  }
  object FailReason {
    
    inline def apply(): FailReason = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailReason]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailReason] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setJsonBody(value: js.Object): Self = StObject.set(x, "jsonBody", value.asInstanceOf[js.Any])
      
      inline def setJsonBodyUndefined: Self = StObject.set(x, "jsonBody", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setThrown(value: js.Error): Self = StObject.set(x, "thrown", value.asInstanceOf[js.Any])
      
      inline def setThrownUndefined: Self = StObject.set(x, "thrown", js.undefined)
    }
  }
  
  @js.native
  trait Oboe extends StObject {
    
    def abort(): Unit = js.native
    
    def done(callback: js.Function1[/* result */ Any, Unit]): Oboe = js.native
    
    def emit(message: data | end): Unit = js.native
    def emit(message: data | end, data: String): Unit = js.native
    
    def fail(callback: js.Function1[/* result */ FailReason, Unit]): Oboe = js.native
    
    def node(pattern: String, callback: CallbackSignature): Oboe = js.native
    def node(patterns: PatternMap): Oboe = js.native
    
    def on(eventPattern: String, callback: CallbackSignature): Oboe = js.native
    def on(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
    
    def path(listeners: Any): Oboe = js.native
    def path(pattern: String, callback: CallbackSignature): Oboe = js.native
    
    def removeListener(eventPattern: String, callback: CallbackSignature): Oboe = js.native
    def removeListener(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
    
    var source: String = js.native
    
    def start(callback: js.Function2[/* status */ Double, /* headers */ js.Object, Unit]): Oboe = js.native
  }
  
  @js.native
  trait OboeFunction
    extends js.Function {
    
    // read data from the given Node stream
    def apply(): Oboe = js.native
    // simple fetch the url
    def apply(options: Options): Oboe = js.native
    // fetch with full parameters
    def apply(stream: ReadableStream): Oboe = js.native
    def apply(url: String): Oboe = js.native
    
    var drop: js.Object = js.native
  }
  
  trait Options extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var cached: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: String
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      inline def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type PatternMap = StringDictionary[CallbackSignature]
  
  type _To = OboeFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: OboeFunction = ^
}
