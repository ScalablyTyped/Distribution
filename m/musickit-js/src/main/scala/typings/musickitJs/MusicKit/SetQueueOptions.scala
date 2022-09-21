package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options to use when setting a music player's playback queue.
  */
trait SetQueueOptions extends StObject {
  
  /**
    * The catalog album used to set a music player's playback queue.
    */
  var album: js.UndefOr[String] = js.undefined
  
  /**
    * The media items used to set a music player's playback queue.
    */
  var items: js.UndefOr[js.Array[Descriptor]] = js.undefined
  
  /**
    * The parameters used to set a music player's playback queue.
    */
  var parameters: js.UndefOr[QueryParameters] = js.undefined
  
  /**
    * The playlist used to set a music player's playback queue.
    */
  var playlist: js.UndefOr[String] = js.undefined
  
  /**
    * The song used to set a music player's playback queue.
    */
  var song: js.UndefOr[String] = js.undefined
  
  /**
    * The songs used to set a music player's playback queue.
    */
  var songs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The start position for a set playback queue.
    */
  var startPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A content URL used to set a music player's playback queue.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SetQueueOptions {
  
  inline def apply(): SetQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetQueueOptions]
  }
  
  extension [Self <: SetQueueOptions](x: Self) {
    
    inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setItems(value: js.Array[Descriptor]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Descriptor*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setParameters(value: QueryParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
    
    inline def setSong(value: String): Self = StObject.set(x, "song", value.asInstanceOf[js.Any])
    
    inline def setSongUndefined: Self = StObject.set(x, "song", js.undefined)
    
    inline def setSongs(value: js.Array[String]): Self = StObject.set(x, "songs", value.asInstanceOf[js.Any])
    
    inline def setSongsUndefined: Self = StObject.set(x, "songs", js.undefined)
    
    inline def setSongsVarargs(value: String*): Self = StObject.set(x, "songs", js.Array(value*))
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
