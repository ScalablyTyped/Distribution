package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.maximMazurokGapiClientYoutube.anon.Favorites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelContentDetails extends StObject {
  
  var relatedPlaylists: js.UndefOr[Favorites] = js.native
}
object ChannelContentDetails {
  
  @scala.inline
  def apply(): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentDetails]
  }
  
  @scala.inline
  implicit class ChannelContentDetailsMutableBuilder[Self <: ChannelContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedPlaylists(value: Favorites): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPlaylistsUndefined: Self = StObject.set(x, "relatedPlaylists", js.undefined)
  }
}
