package typings.oboe

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("oboe", JSImport.Namespace)
  @js.native
  val ^ : OboeFunction = js.native
  
  type CallbackSignature = js.Function3[
    /* node */ js.Any, 
    /* pathOrHeaders */ js.Any, 
    /* ancestors */ js.Array[js.Object], 
    js.Any
  ]
  
  @js.native
  trait FailReason extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var jsonBody: js.UndefOr[js.Object] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
    
    var thrown: js.UndefOr[Error] = js.native
  }
  object FailReason {
    
    @scala.inline
    def apply(): FailReason = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailReason]
    }
    
    @scala.inline
    implicit class FailReasonMutableBuilder[Self <: FailReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setJsonBody(value: js.Object): Self = StObject.set(x, "jsonBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonBodyUndefined: Self = StObject.set(x, "jsonBody", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setThrown(value: Error): Self = StObject.set(x, "thrown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrownUndefined: Self = StObject.set(x, "thrown", js.undefined)
    }
  }
  
  @js.native
  trait Oboe extends StObject {
    
    def abort(): Unit = js.native
    
    def done(callback: js.Function1[/* result */ js.Any, Unit]): Oboe = js.native
    
    def fail(callback: js.Function1[/* result */ FailReason, Unit]): Oboe = js.native
    
    def node(pattern: String, callback: CallbackSignature): Oboe = js.native
    def node(patterns: PatternMap): Oboe = js.native
    
    def on(eventPattern: String, callback: CallbackSignature): Oboe = js.native
    def on(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
    
    def path(listeners: js.Any): Oboe = js.native
    def path(pattern: String, callback: CallbackSignature): Oboe = js.native
    
    def removeListener(eventPattern: String, callback: CallbackSignature): Oboe = js.native
    def removeListener(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
    
    var source: String = js.native
    
    def start(callback: js.Function2[/* status */ Double, /* headers */ js.Object, Unit]): Oboe = js.native
  }
  
  @js.native
  trait OboeFunction
    extends js.Function {
    
    def apply(options: Options): Oboe = js.native
    def apply(stream: ReadableStream): Oboe = js.native
    def apply(url: String): Oboe = js.native
    
    var drop: js.Object = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var cached: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var url: String = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type PatternMap = StringDictionary[CallbackSignature]
  
  type _To = OboeFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: OboeFunction = ^
}
