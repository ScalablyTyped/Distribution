package typings.metascraperMediaProvider

import typings.metascraper.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Rule = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Rule]
  inline def apply(options: Options): Rule = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  @JSImport("metascraper-media-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GetProxyData extends StObject {
    
    var retryCount: Double
    
    var url: String
  }
  object GetProxyData {
    
    inline def apply(retryCount: Double, url: String): GetProxyData = {
      val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProxyData]
    }
    
    extension [Self <: GetProxyData](x: Self) {
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type GetProxyFunction = js.Function1[/* data */ GetProxyData, String]
  
  type OnErrorFunction = js.Function2[/* url */ String, /* error */ js.Error, Unit]
  
  trait Options extends StObject {
    
    /**
      * It specifies cache based on file system to be used by
      * [youtube-dl](https://github.com/microlinkhq/metascraper/blob/master/packages/metascraper-media-provider/youtube-dl).
      */
    var cacheDir: js.UndefOr[String] = js.undefined
    
    /**
      * It will be called to determinate if a proxy should be used for
      * resolving the next request URL.
      */
    var getProxy: js.UndefOr[GetProxyFunction] = js.undefined
    
    /** A function to be called when something wrong happens. */
    var onError: js.UndefOr[OnErrorFunction] = js.undefined
    
    /**
      * The maximum time allowed to wait until considering the request as
      * timed out. Default is `30000`.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** It specifies a custom user agent. */
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      inline def setGetProxy(value: /* data */ GetProxyData => String): Self = StObject.set(x, "getProxy", js.Any.fromFunction1(value))
      
      inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
      
      inline def setOnError(value: (/* url */ String, /* error */ js.Error) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
