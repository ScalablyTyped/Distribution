package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebNavigationTransitionCallbackDetails
  extends typings.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
  
  /**
    * A list of transition qualifiers.
    * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
    */
  var transitionQualifiers: js.Array[String] = js.native
  
  /**
    * Cause of the navigation.
    * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
    */
  var transitionType: String = js.native
}
object WebNavigationTransitionCallbackDetails {
  
  @scala.inline
  def apply(
    frameId: Double,
    processId: Double,
    tabId: Double,
    timeStamp: Double,
    transitionQualifiers: js.Array[String],
    transitionType: String,
    url: String
  ): WebNavigationTransitionCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], transitionQualifiers = transitionQualifiers.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationTransitionCallbackDetails]
  }
  
  @scala.inline
  implicit class WebNavigationTransitionCallbackDetailsOps[Self <: WebNavigationTransitionCallbackDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransitionQualifiersVarargs(value: String*): Self = this.set("transitionQualifiers", js.Array(value :_*))
    
    @scala.inline
    def setTransitionQualifiers(value: js.Array[String]): Self = this.set("transitionQualifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionType(value: String): Self = this.set("transitionType", value.asInstanceOf[js.Any])
  }
}
