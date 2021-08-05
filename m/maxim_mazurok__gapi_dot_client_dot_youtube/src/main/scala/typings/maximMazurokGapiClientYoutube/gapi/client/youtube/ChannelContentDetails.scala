package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.maximMazurokGapiClientYoutube.anon.Favorites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelContentDetails extends StObject {
  
  var relatedPlaylists: js.UndefOr[Favorites] = js.undefined
}
object ChannelContentDetails {
  
  inline def apply(): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentDetails]
  }
  
  extension [Self <: ChannelContentDetails](x: Self) {
    
    inline def setRelatedPlaylists(value: Favorites): Self = StObject.set(x, "relatedPlaylists", value.asInstanceOf[js.Any])
    
    inline def setRelatedPlaylistsUndefined: Self = StObject.set(x, "relatedPlaylists", js.undefined)
  }
}
