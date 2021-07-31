package typings.playcanvas.anon

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[js.Any] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var maxRetryDelay: js.UndefOr[Double] = js.undefined
  
  var postdata: js.UndefOr[Document | js.Any] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var retry: js.UndefOr[Boolean] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object Async {
  
  @scala.inline
  def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDelayUndefined: Self = StObject.set(x, "maxRetryDelay", js.undefined)
    
    @scala.inline
    def setPostdata(value: Document | js.Any): Self = StObject.set(x, "postdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostdataUndefined: Self = StObject.set(x, "postdata", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
