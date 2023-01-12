package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelBannerResource extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelBannerResource". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The URL of this banner image. */
  var url: js.UndefOr[String] = js.undefined
}
object ChannelBannerResource {
  
  inline def apply(): ChannelBannerResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBannerResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelBannerResource] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
