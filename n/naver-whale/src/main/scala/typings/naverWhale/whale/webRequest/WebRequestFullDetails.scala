package typings.naverWhale.whale.webRequest

import typings.chrome.chromeStrings.active
import typings.chrome.chromeStrings.cached
import typings.chrome.chromeStrings.fenced_frame
import typings.chrome.chromeStrings.outermost_frame
import typings.chrome.chromeStrings.pending_deletion
import typings.chrome.chromeStrings.prerender
import typings.chrome.chromeStrings.sub_frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.chrome.chrome.webRequest.ResourceRequest because Already inherited
- typings.chrome.chrome.webRequest.WebRequestDetails because Already inherited
- typings.chrome.chrome.webRequest.WebRequestBodyDetails because var conflicts: frameId, initiator, method, parentFrameId, requestId, tabId, timeStamp, `type`, url. Inlined requestBody */ trait WebRequestFullDetails
  extends StObject
     with typings.chrome.chrome.webRequest.WebRequestHeadersDetails {
  
  /**
    * Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'.
    * @since Chrome 23.
    */
  var requestBody: typings.chrome.chrome.webRequest.WebRequestBody | Null
}
object WebRequestFullDetails {
  
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
  ): WebRequestFullDetails = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], documentLifecycle = documentLifecycle.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], frameType = frameType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], requestBody = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFullDetails]
  }
  
  extension [Self <: WebRequestFullDetails](x: Self) {
    
    inline def setRequestBody(value: typings.chrome.chrome.webRequest.WebRequestBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyNull: Self = StObject.set(x, "requestBody", null)
  }
}
