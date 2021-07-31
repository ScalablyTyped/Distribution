package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlContent extends StObject {
  
  /** The height of the HTML snippet in pixels. Can be used to filter the response of the creatives.list method. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The HTML snippet that displays the ad when inserted in the web page. */
  var snippet: js.UndefOr[String] = js.undefined
  
  /** The width of the HTML snippet in pixels. Can be used to filter the response of the creatives.list method. */
  var width: js.UndefOr[Double] = js.undefined
}
object HtmlContent {
  
  @scala.inline
  def apply(): HtmlContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlContent]
  }
  
  @scala.inline
  implicit class HtmlContentMutableBuilder[Self <: HtmlContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
