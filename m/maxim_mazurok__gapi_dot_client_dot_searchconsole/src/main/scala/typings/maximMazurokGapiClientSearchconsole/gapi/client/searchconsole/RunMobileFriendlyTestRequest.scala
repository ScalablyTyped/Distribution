package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunMobileFriendlyTestRequest extends StObject {
  
  /** Whether or not screenshot is requested. Default is false. */
  var requestScreenshot: js.UndefOr[Boolean] = js.undefined
  
  /** URL for inspection. */
  var url: js.UndefOr[String] = js.undefined
}
object RunMobileFriendlyTestRequest {
  
  @scala.inline
  def apply(): RunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunMobileFriendlyTestRequest]
  }
  
  @scala.inline
  implicit class RunMobileFriendlyTestRequestMutableBuilder[Self <: RunMobileFriendlyTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestScreenshot(value: Boolean): Self = StObject.set(x, "requestScreenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestScreenshotUndefined: Self = StObject.set(x, "requestScreenshot", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
