package typings.openGraphScraper

import typings.node.streamMod.PassThrough
import typings.openGraphScraper.anon.Error
import typings.openGraphScraper.anon.OgDescription
import typings.openGraphScraper.openGraphScraperBooleans.`false`
import typings.openGraphScraper.openGraphScraperBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): js.Promise[SuccessResult | ErrorResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SuccessResult | ErrorResult]]
  inline def apply(
    options: Options,
    callback: js.Function3[
      /* error */ Boolean, 
      /* results */ SuccessResult | ErrorResult, 
      /* response */ PassThrough, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("open-graph-scraper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ErrorResult extends StObject {
    
    var error: `true`
    
    var result: Error
  }
  object ErrorResult {
    
    inline def apply(result: Error): ErrorResult = {
      val __obj = js.Dynamic.literal(error = true, result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResult]
    }
    
    extension [Self <: ErrorResult](x: Self) {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** By default, OGS will only send back the first image/video it finds (default: `false`). */
    var allMedia: js.UndefOr[Boolean] = js.undefined
    
    /** Pass in an array of sites you don't want `og`s to run on. */
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set the accept-encoding to `gzip/deflate` (default: `true`). */
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    /** Setting this to `null` might help with running `og`s on non english websites (default: `utf8`). */
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    /** Defines if redirect responses should be followed automatically (default: `true`). */
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    /** An object containing request headers. Useful for setting the user-agent. */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /** You can pass in an HTML string to run `og`s on it (use without `options.url`). */
    var html: js.UndefOr[String] = js.undefined
    
    /** Max number of redirects `og`s will follow (default: `10`). */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    /** Fetch other images if no open graph ones are found (default: `true`). */
    var ogImageFallback: js.UndefOr[Boolean] = js.undefined
    
    /** Only fetch open graph info and don't fall back on anything else (default: `false`). */
    var onlyGetOpenGraphInfo: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the peekSize for the request (default: `1024`). */
    var peekSize: js.UndefOr[Double] = js.undefined
    
    /** Number of times `og`s will retry the request (default: `2`). */
    var retry: js.UndefOr[Double] = js.undefined
    
    /** Runs charset and icons on the request payload (default: `false`). */
    var runChar: js.UndefOr[Boolean] = js.undefined
    
    /** Timeout of the request in ms (default: `2000`). */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** URL of the site. */
    var url: String
    
    /** Returns the charset in the `og`s payload (default: `false`). */
    var withCharset: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllMedia(value: Boolean): Self = StObject.set(x, "allMedia", value.asInstanceOf[js.Any])
      
      inline def setAllMediaUndefined: Self = StObject.set(x, "allMedia", js.undefined)
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setOgImageFallback(value: Boolean): Self = StObject.set(x, "ogImageFallback", value.asInstanceOf[js.Any])
      
      inline def setOgImageFallbackUndefined: Self = StObject.set(x, "ogImageFallback", js.undefined)
      
      inline def setOnlyGetOpenGraphInfo(value: Boolean): Self = StObject.set(x, "onlyGetOpenGraphInfo", value.asInstanceOf[js.Any])
      
      inline def setOnlyGetOpenGraphInfoUndefined: Self = StObject.set(x, "onlyGetOpenGraphInfo", js.undefined)
      
      inline def setPeekSize(value: Double): Self = StObject.set(x, "peekSize", value.asInstanceOf[js.Any])
      
      inline def setPeekSizeUndefined: Self = StObject.set(x, "peekSize", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setRunChar(value: Boolean): Self = StObject.set(x, "runChar", value.asInstanceOf[js.Any])
      
      inline def setRunCharUndefined: Self = StObject.set(x, "runChar", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCharset(value: Boolean): Self = StObject.set(x, "withCharset", value.asInstanceOf[js.Any])
      
      inline def setWithCharsetUndefined: Self = StObject.set(x, "withCharset", js.undefined)
    }
  }
  
  trait SuccessResult extends StObject {
    
    var error: `false`
    
    var response: PassThrough
    
    var result: OgDescription
  }
  object SuccessResult {
    
    inline def apply(response: PassThrough, result: OgDescription): SuccessResult = {
      val __obj = js.Dynamic.literal(error = false, response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResult]
    }
    
    extension [Self <: SuccessResult](x: Self) {
      
      inline def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: PassThrough): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResult(value: OgDescription): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
