package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponseHeadersMod {
  
  trait ResponseHeaders
    extends StObject
       with /* header */ StringDictionary[js.UndefOr[String | Double]] {
    
    var `cache-control`: js.UndefOr[String] = js.undefined
    
    var `content-length`: js.UndefOr[Double] = js.undefined
    
    var `content-type`: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var etag: js.UndefOr[String] = js.undefined
    
    var `last-modified`: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var vary: js.UndefOr[String] = js.undefined
    
    var `x-github-mediatype`: js.UndefOr[String] = js.undefined
    
    var `x-github-request-id`: js.UndefOr[String] = js.undefined
    
    var `x-oauth-scopes`: js.UndefOr[String] = js.undefined
    
    var `x-ratelimit-limit`: js.UndefOr[String] = js.undefined
    
    var `x-ratelimit-remaining`: js.UndefOr[String] = js.undefined
    
    var `x-ratelimit-reset`: js.UndefOr[String] = js.undefined
  }
  object ResponseHeaders {
    
    inline def apply(): ResponseHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseHeaders]
    }
    
    extension [Self <: ResponseHeaders](x: Self) {
      
      inline def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
      
      inline def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
      
      inline def `setContent-length`(value: Double): Self = StObject.set(x, "content-length", value.asInstanceOf[js.Any])
      
      inline def `setContent-lengthUndefined`: Self = StObject.set(x, "content-length", js.undefined)
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def `setLast-modified`(value: String): Self = StObject.set(x, "last-modified", value.asInstanceOf[js.Any])
      
      inline def `setLast-modifiedUndefined`: Self = StObject.set(x, "last-modified", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVary(value: String): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
      
      inline def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
      
      inline def `setX-github-mediatype`(value: String): Self = StObject.set(x, "x-github-mediatype", value.asInstanceOf[js.Any])
      
      inline def `setX-github-mediatypeUndefined`: Self = StObject.set(x, "x-github-mediatype", js.undefined)
      
      inline def `setX-github-request-id`(value: String): Self = StObject.set(x, "x-github-request-id", value.asInstanceOf[js.Any])
      
      inline def `setX-github-request-idUndefined`: Self = StObject.set(x, "x-github-request-id", js.undefined)
      
      inline def `setX-oauth-scopes`(value: String): Self = StObject.set(x, "x-oauth-scopes", value.asInstanceOf[js.Any])
      
      inline def `setX-oauth-scopesUndefined`: Self = StObject.set(x, "x-oauth-scopes", js.undefined)
      
      inline def `setX-ratelimit-limit`(value: String): Self = StObject.set(x, "x-ratelimit-limit", value.asInstanceOf[js.Any])
      
      inline def `setX-ratelimit-limitUndefined`: Self = StObject.set(x, "x-ratelimit-limit", js.undefined)
      
      inline def `setX-ratelimit-remaining`(value: String): Self = StObject.set(x, "x-ratelimit-remaining", value.asInstanceOf[js.Any])
      
      inline def `setX-ratelimit-remainingUndefined`: Self = StObject.set(x, "x-ratelimit-remaining", js.undefined)
      
      inline def `setX-ratelimit-reset`(value: String): Self = StObject.set(x, "x-ratelimit-reset", value.asInstanceOf[js.Any])
      
      inline def `setX-ratelimit-resetUndefined`: Self = StObject.set(x, "x-ratelimit-reset", js.undefined)
    }
  }
}
