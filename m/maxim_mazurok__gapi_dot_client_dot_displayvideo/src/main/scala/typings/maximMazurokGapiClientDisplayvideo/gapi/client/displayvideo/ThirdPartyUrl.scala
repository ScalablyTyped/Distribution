package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyUrl extends StObject {
  
  /** The type of interaction needs to be tracked by the tracking URL */
  var `type`: js.UndefOr[String] = js.native
  
  /** Tracking URL used to track the interaction. Provide a URL with optional path or query string, beginning with `https:`. For example, https://www.example.com/path */
  var url: js.UndefOr[String] = js.native
}
object ThirdPartyUrl {
  
  @scala.inline
  def apply(): ThirdPartyUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyUrl]
  }
  
  @scala.inline
  implicit class ThirdPartyUrlMutableBuilder[Self <: ThirdPartyUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
