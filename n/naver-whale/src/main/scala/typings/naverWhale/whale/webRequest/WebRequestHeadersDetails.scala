package typings.naverWhale.whale.webRequest

import typings.naverWhale.naverWhaleStrings.active
import typings.naverWhale.naverWhaleStrings.cached
import typings.naverWhale.naverWhaleStrings.fenced_frame
import typings.naverWhale.naverWhaleStrings.outermost_frame
import typings.naverWhale.naverWhaleStrings.pending_deletion
import typings.naverWhale.naverWhaleStrings.prerender
import typings.naverWhale.naverWhaleStrings.sub_frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestHeadersDetails
  extends StObject
     with typings.chrome.chrome.webRequest.WebRequestDetails {
  
  var documentId: String
  
  var documentLifecycle: prerender | active | cached | pending_deletion
  
  var frameType: outermost_frame | fenced_frame | sub_frame
  
  var parentDocumentId: js.UndefOr[String] = js.undefined
  
  /** Optional. The HTTP request headers that are going to be sent out with this request. */
  var requestHeaders: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.HttpHeader]] = js.undefined
}
object WebRequestHeadersDetails {
  
  inline def apply(
    documentId: String,
    documentLifecycle: prerender | active | cached | pending_deletion,
    frameId: Double,
    frameType: outermost_frame | fenced_frame | sub_frame,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: typings.chrome.chrome.webRequest.ResourceType,
    url: String
  ): WebRequestHeadersDetails = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], documentLifecycle = documentLifecycle.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], frameType = frameType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestHeadersDetails]
  }
  
  extension [Self <: WebRequestHeadersDetails](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentLifecycle(value: prerender | active | cached | pending_deletion): Self = StObject.set(x, "documentLifecycle", value.asInstanceOf[js.Any])
    
    inline def setFrameType(value: outermost_frame | fenced_frame | sub_frame): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
    
    inline def setParentDocumentId(value: String): Self = StObject.set(x, "parentDocumentId", value.asInstanceOf[js.Any])
    
    inline def setParentDocumentIdUndefined: Self = StObject.set(x, "parentDocumentId", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[typings.chrome.chrome.webRequest.HttpHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: typings.chrome.chrome.webRequest.HttpHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
  }
}
