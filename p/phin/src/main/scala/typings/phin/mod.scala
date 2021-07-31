package typings.phin

import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.phin.anon.Data
import typings.phin.anon.Form
import typings.phin.anon.IWithDataIJSONResponseOpt
import typings.phin.anon.IWithDataIOptions
import typings.phin.anon.IWithDataIStreamResponseO
import typings.phin.anon.IWithFormIJSONResponseOpt
import typings.phin.anon.IWithFormIOptions
import typings.phin.anon.IWithFormIStreamResponseO
import typings.phin.phinBooleans.`true`
import typings.phin.phinStrings.json
import typings.phin.phinStrings.none
import typings.std.Error
import typings.std.NonNullable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: String): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  @scala.inline
  def apply(options: IWithDataIOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  @scala.inline
  def apply(options: IWithDataIStreamResponseO): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  @scala.inline
  def apply(options: IWithFormIOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  @scala.inline
  def apply(options: IWithFormIStreamResponseO): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  @scala.inline
  def apply(options: IOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  @scala.inline
  def apply(options: IStreamResponseOptions): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  @scala.inline
  def apply[T](options: IWithDataIJSONResponseOpt): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  @scala.inline
  def apply[T](options: IWithFormIJSONResponseOpt): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  @scala.inline
  def apply[T](options: IJSONResponseOptions): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  
  @JSImport("phin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("phin", "promisified")
  @js.native
  def promisified: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ js.Any = js.native
  @scala.inline
  def promisified_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promisified")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def unpromisified(options: String, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IWithDataIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IWithDataIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IWithFormIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IWithFormIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified(options: IStreamResponseOptions, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified[T](options: IWithDataIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified[T](options: IWithFormIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unpromisified[T](options: IJSONResponseOptions, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ICallback[T] = js.Function2[/* error */ Null, /* response */ NonNullable[T], Unit]
  
  // NOTE: Typescript cannot infer type of union callback on the consumer side
  // https://github.com/Microsoft/TypeScript/pull/17819#issuecomment-363636904
  type IErrorCallback = js.Function2[/* error */ Error | String, /* response */ Null, Unit]
  
  @js.native
  trait IJSONResponse[T] extends IncomingMessage {
    
    var body: T = js.native
  }
  
  trait IJSONResponseOptions
    extends StObject
       with IOptionsBase {
    
    var parse: json
  }
  object IJSONResponseOptions {
    
    @scala.inline
    def apply(url: String | URL): IJSONResponseOptions = {
      val __obj = js.Dynamic.literal(parse = "json", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJSONResponseOptions]
    }
    
    @scala.inline
    implicit class IJSONResponseOptionsMutableBuilder[Self <: IJSONResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: json): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions
    extends StObject
       with IOptionsBase {
    
    var parse: js.UndefOr[none] = js.undefined
  }
  object IOptions {
    
    @scala.inline
    def apply(url: String | URL): IOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: none): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  trait IOptionsBase extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IOptionsBase {
    
    @scala.inline
    def apply(url: String | URL): IOptionsBase = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionsBase]
    }
    
    @scala.inline
    implicit class IOptionsBaseMutableBuilder[Self <: IOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResponse extends IncomingMessage {
    
    var body: String = js.native
  }
  
  @js.native
  trait IStreamResponse extends IncomingMessage {
    
    var stream: IncomingMessage = js.native
  }
  
  trait IStreamResponseOptions
    extends StObject
       with IOptionsBase {
    
    @JSName("stream")
    var stream_IStreamResponseOptions: `true`
  }
  object IStreamResponseOptions {
    
    @scala.inline
    def apply(url: String | URL): IStreamResponseOptions = {
      val __obj = js.Dynamic.literal(stream = true, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStreamResponseOptions]
    }
    
    @scala.inline
    implicit class IStreamResponseOptionsMutableBuilder[Self <: IStreamResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  // Form and data property has been written this way so they're mutually exclusive.
  type IWithData[T /* <: js.Object */] = T & Data
  
  type IWithForm[T /* <: js.Object */] = T & Form
}
