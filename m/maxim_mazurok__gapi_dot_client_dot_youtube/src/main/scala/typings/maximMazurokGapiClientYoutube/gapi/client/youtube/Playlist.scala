package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Playlist extends StObject {
  
  /** The contentDetails object contains information like video count. */
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the playlist. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlist". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Localizations for different languages */
  var localizations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.PlaylistLocalization} */ js.Any
  ] = js.undefined
  
  /** The player object contains information that you would use to play the playlist in an embedded player. */
  var player: js.UndefOr[PlaylistPlayer] = js.undefined
  
  /** The snippet object contains basic details about the playlist, such as its title and description. */
  var snippet: js.UndefOr[PlaylistSnippet] = js.undefined
  
  /** The status object contains status information for the playlist. */
  var status: js.UndefOr[PlaylistStatus] = js.undefined
}
object Playlist {
  
  inline def apply(): Playlist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Playlist]
  }
  
  extension [Self <: Playlist](x: Self) {
    
    inline def setContentDetails(value: PlaylistContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalizations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.PlaylistLocalization} */ js.Any
    ): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setPlayer(value: PlaylistPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setSnippet(value: PlaylistSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatus(value: PlaylistStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
