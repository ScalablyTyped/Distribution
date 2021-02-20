package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawledUrl extends StObject {
  
  /** Output only. The body of the request that was used to visit the URL. */
  var body: js.UndefOr[String] = js.native
  
  /** Output only. The http method of the request that was used to visit the URL, in uppercase. */
  var httpMethod: js.UndefOr[String] = js.native
  
  /** Output only. The URL that was crawled. */
  var url: js.UndefOr[String] = js.native
}
object CrawledUrl {
  
  @scala.inline
  def apply(): CrawledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawledUrl]
  }
  
  @scala.inline
  implicit class CrawledUrlMutableBuilder[Self <: CrawledUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
