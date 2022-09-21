package typings.phin

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.phin.anon.Data
import typings.phin.anon.Form
import typings.phin.anon.IWithDataIJSONResponseOpt
import typings.phin.anon.IWithDataIOptions
import typings.phin.anon.IWithDataIStreamResponseO
import typings.phin.anon.IWithDataIStringResponseO
import typings.phin.anon.IWithFormIJSONResponseOpt
import typings.phin.anon.IWithFormIOptions
import typings.phin.anon.IWithFormIStreamResponseO
import typings.phin.anon.IWithFormIStringResponseO
import typings.phin.phinBooleans.`true`
import typings.phin.phinStrings.json
import typings.phin.phinStrings.none
import typings.phin.phinStrings.string
import typings.std.NonNullable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: String): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  inline def apply(options: IWithDataIOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  inline def apply(options: IWithDataIStreamResponseO): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  inline def apply(options: IWithDataIStringResponseO): js.Promise[IStringResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStringResponse]]
  inline def apply(options: IWithFormIOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  inline def apply(options: IWithFormIStreamResponseO): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  inline def apply(options: IWithFormIStringResponseO): js.Promise[IStringResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStringResponse]]
  inline def apply(options: IOptions): js.Promise[IResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResponse]]
  inline def apply(options: IStreamResponseOptions): js.Promise[IStreamResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStreamResponse]]
  inline def apply(options: IStringResponseOptions): js.Promise[IStringResponse] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IStringResponse]]
  inline def apply[T](options: IWithDataIJSONResponseOpt): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  inline def apply[T](options: IWithFormIJSONResponseOpt): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  inline def apply[T](options: IJSONResponseOptions): js.Promise[IJSONResponse[T]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IJSONResponse[T]]]
  
  @JSImport("phin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("phin", "promisified")
  @js.native
  def promisified: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ Any = js.native
  inline def promisified_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof phin */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promisified")(x.asInstanceOf[js.Any])
  
  inline def unpromisified(options: String, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithDataIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithDataIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithDataIStringResponseO, callback: ICallback[IStringResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithFormIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithFormIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IWithFormIStringResponseO, callback: ICallback[IStringResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IStreamResponseOptions, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified(options: IStringResponseOptions, callback: ICallback[IStringResponse] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified[T](options: IWithDataIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified[T](options: IWithFormIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpromisified[T](options: IJSONResponseOptions, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisified")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ICallback[T] = js.Function2[/* error */ Null, /* response */ NonNullable[T], Unit]
  
  // NOTE: Typescript cannot infer type of union callback on the consumer side
  // https://github.com/Microsoft/TypeScript/pull/17819#issuecomment-363636904
  type IErrorCallback = js.Function2[/* error */ js.Error | String, /* response */ Null, Unit]
  
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
    
    inline def apply(url: String | URL): IJSONResponseOptions = {
      val __obj = js.Dynamic.literal(parse = "json", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJSONResponseOptions]
    }
    
    extension [Self <: IJSONResponseOptions](x: Self) {
      
      inline def setParse(value: json): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions
    extends StObject
       with IOptionsBase {
    
    var parse: js.UndefOr[none] = js.undefined
  }
  object IOptions {
    
    inline def apply(url: String | URL): IOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setParse(value: none): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
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
    
    inline def apply(url: String | URL): IOptionsBase = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionsBase]
    }
    
    extension [Self <: IOptionsBase](x: Self) {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      inline def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResponse extends IncomingMessage {
    
    var body: Buffer = js.native
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
    
    inline def apply(url: String | URL): IStreamResponseOptions = {
      val __obj = js.Dynamic.literal(stream = true, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStreamResponseOptions]
    }
    
    extension [Self <: IStreamResponseOptions](x: Self) {
      
      inline def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStringResponse extends IncomingMessage {
    
    var body: String = js.native
  }
  
  trait IStringResponseOptions
    extends StObject
       with IOptionsBase {
    
    var parse: string
  }
  object IStringResponseOptions {
    
    inline def apply(url: String | URL): IStringResponseOptions = {
      val __obj = js.Dynamic.literal(parse = "string", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStringResponseOptions]
    }
    
    extension [Self <: IStringResponseOptions](x: Self) {
      
      inline def setParse(value: string): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    }
  }
  
  type IWithData[T /* <: IOptionsBase */] = T & Data
  
  type IWithForm[T /* <: IOptionsBase */] = T & Form
}
