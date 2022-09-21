package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSectionContentDetails extends StObject {
  
  /** The channel ids for type multiple_channels. */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The playlist ids for type single_playlist and multiple_playlists. For singlePlaylist, only one playlistId is allowed. */
  var playlists: js.UndefOr[js.Array[String]] = js.undefined
}
object ChannelSectionContentDetails {
  
  inline def apply(): ChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionContentDetails]
  }
  
  extension [Self <: ChannelSectionContentDetails](x: Self) {
    
    inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setPlaylists(value: js.Array[String]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    inline def setPlaylistsUndefined: Self = StObject.set(x, "playlists", js.undefined)
    
    inline def setPlaylistsVarargs(value: String*): Self = StObject.set(x, "playlists", js.Array(value*))
  }
}
