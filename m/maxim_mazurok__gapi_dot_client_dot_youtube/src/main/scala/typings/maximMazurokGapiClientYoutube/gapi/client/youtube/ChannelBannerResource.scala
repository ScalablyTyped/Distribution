package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBannerResource extends StObject {
  
  var etag: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelBannerResource". */
  var kind: js.UndefOr[String] = js.native
  
  /** The URL of this banner image. */
  var url: js.UndefOr[String] = js.native
}
object ChannelBannerResource {
  
  @scala.inline
  def apply(): ChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBannerResource]
  }
  
  @scala.inline
  implicit class ChannelBannerResourceMutableBuilder[Self <: ChannelBannerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
