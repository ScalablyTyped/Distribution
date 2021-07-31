package typings.naverWhale.whale.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestHeadersDetails
  extends StObject
     with typings.chrome.chrome.webRequest.WebRequestDetails {
  
  /** Optional. The HTTP request headers that are going to be sent out with this request. */
  var requestHeaders: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.HttpHeader]] = js.undefined
}
object WebRequestHeadersDetails {
  
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chrome.webRequest.ResourceType,
    url: String
  ): WebRequestHeadersDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestHeadersDetails]
  }
  
  @scala.inline
  implicit class WebRequestHeadersDetailsMutableBuilder[Self <: WebRequestHeadersDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestHeaders(value: js.Array[typings.chrome.chrome.webRequest.HttpHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setRequestHeadersVarargs(value: typings.chrome.chrome.webRequest.HttpHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
  }
}
