package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request URL and headers
  */
@js.native
trait RequestUrlAndHeaderInfo extends StObject {
  
  /** Request headers */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Request URL */
  var url: String = js.native
}
object RequestUrlAndHeaderInfo {
  
  @scala.inline
  def apply(url: String): RequestUrlAndHeaderInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUrlAndHeaderInfo]
  }
  
  @scala.inline
  implicit class RequestUrlAndHeaderInfoMutableBuilder[Self <: RequestUrlAndHeaderInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
