package typings.originalUrl

import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Reconstruct the original URL used in an HTTP request based on the HTTP
    * request headers.
    *
    * The module takes into account potential URL rewrites made by proxies,
    * load balancers, etc along the way (as long as these append special HTTP
    * headers to the request).
    *
    * Supported HTTP headers:
    *
    * - `Host`
    * - `Forwarded`
    * - `X-Forwarded-Proto`
    * - `X-Forwarded-Protocol`
    * - `X-Url-Scheme`
    * - `Front-End-Https`
    * - `X-Forwarded-Ssl`
    * - `X-Forwarded-Host`
    * - `X-Forwarded-Port`
    *
    * If the protocol (http vs https) cannot be determined based on the above
    * headers, the `encrypted` flag on the TLS connection is used.
    *
    * @example
    * import * as http from 'http'
    * import originalUrl = require('original-url')
    *
    * const server = http.createServer((req, res) => {
    *   const url = originalUrl(req)
    *   if (url.full) {
    *     res.end(`Original URL: ${url.full}\n`)
    *   } else {
    *     res.end('Original URL could not be determined\n')
    *   }
    * })
    *
    * server.listen(1337)
    */
  inline def apply(req: IncomingMessage): OriginalUrl = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[OriginalUrl]
  
  @JSImport("original-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OriginalUrl extends StObject {
    
    /** The fully resolved URL. */
    var full: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var raw: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object OriginalUrl {
    
    inline def apply(protocol: String): OriginalUrl = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OriginalUrl] (val x: Self) extends AnyVal {
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
}
