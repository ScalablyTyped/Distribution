package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a single media item.
  */
trait MediaItem extends StObject {
  
  /**
    * A string of information about the album.
    */
  val albumInfo: String
  
  /**
    * The title of the album.
    */
  val albumName: String
  
  /**
    * The artist for a media item.
    */
  val artistName: String
  
  /**
    * The artwork object for the media item.
    */
  val artwork: Artwork
  
  /**
    * The artwork image for the media item.
    */
  val artworkURL: String
  
  /**
    * The attributes object for the media item.
    */
  val attributes: Any
  
  /**
    * A string containing the content rating for the media item.
    */
  val contentRating: String
  
  /**
    * The disc number where the media item appears.
    */
  val discNumber: Double
  
  /**
    * The identifier for the media item.
    */
  val id: String
  
  /**
    * A string of common information about the media item.
    */
  val info: String
  
  /**
    * A Boolean value that indicates whether the item has explicit lyrics or language.
    */
  val isExplicitItem: Boolean
  
  /**
    * A Boolean value that indicated whether the item is playable.
    */
  val isPlayable: Boolean
  
  /**
    * A Boolean value indicating whether the media item is prepared to play.
    */
  val isPreparedToPlay: Boolean
  
  /**
    * The ISRC (International Standard Recording Code) for a media item.
    */
  val isrc: String
  
  /**
    * The playback duration of the media item.
    */
  val playbackDuration: Double
  
  val playlistArtworkURL: String
  
  val playlistName: String
  
  /**
    * Prepares a media item for playback.
    */
  def prepareToPlay(): js.Promise[Unit]
  
  /**
    * The URL to an unencrypted preview of the media item.
    */
  val previewURL: String
  
  /**
    * The release date of the media item.
    */
  val releaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the media item.
    */
  val title: String
  
  /**
    * The number of the media item in the album's track list.
    */
  val trackNumber: Double
  
  /**
    * The type of the media item.
    */
  var `type`: Any
}
object MediaItem {
  
  inline def apply(
    albumInfo: String,
    albumName: String,
    artistName: String,
    artwork: Artwork,
    artworkURL: String,
    attributes: Any,
    contentRating: String,
    discNumber: Double,
    id: String,
    info: String,
    isExplicitItem: Boolean,
    isPlayable: Boolean,
    isPreparedToPlay: Boolean,
    isrc: String,
    playbackDuration: Double,
    playlistArtworkURL: String,
    playlistName: String,
    prepareToPlay: () => js.Promise[Unit],
    previewURL: String,
    title: String,
    trackNumber: Double,
    `type`: Any
  ): MediaItem = {
    val __obj = js.Dynamic.literal(albumInfo = albumInfo.asInstanceOf[js.Any], albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], artworkURL = artworkURL.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentRating = contentRating.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isExplicitItem = isExplicitItem.asInstanceOf[js.Any], isPlayable = isPlayable.asInstanceOf[js.Any], isPreparedToPlay = isPreparedToPlay.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], playbackDuration = playbackDuration.asInstanceOf[js.Any], playlistArtworkURL = playlistArtworkURL.asInstanceOf[js.Any], playlistName = playlistName.asInstanceOf[js.Any], prepareToPlay = js.Any.fromFunction0(prepareToPlay), previewURL = previewURL.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaItem] (val x: Self) extends AnyVal {
    
    inline def setAlbumInfo(value: String): Self = StObject.set(x, "albumInfo", value.asInstanceOf[js.Any])
    
    inline def setAlbumName(value: String): Self = StObject.set(x, "albumName", value.asInstanceOf[js.Any])
    
    inline def setArtistName(value: String): Self = StObject.set(x, "artistName", value.asInstanceOf[js.Any])
    
    inline def setArtwork(value: Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkURL(value: String): Self = StObject.set(x, "artworkURL", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setDiscNumber(value: Double): Self = StObject.set(x, "discNumber", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setIsExplicitItem(value: Boolean): Self = StObject.set(x, "isExplicitItem", value.asInstanceOf[js.Any])
    
    inline def setIsPlayable(value: Boolean): Self = StObject.set(x, "isPlayable", value.asInstanceOf[js.Any])
    
    inline def setIsPreparedToPlay(value: Boolean): Self = StObject.set(x, "isPreparedToPlay", value.asInstanceOf[js.Any])
    
    inline def setIsrc(value: String): Self = StObject.set(x, "isrc", value.asInstanceOf[js.Any])
    
    inline def setPlaybackDuration(value: Double): Self = StObject.set(x, "playbackDuration", value.asInstanceOf[js.Any])
    
    inline def setPlaylistArtworkURL(value: String): Self = StObject.set(x, "playlistArtworkURL", value.asInstanceOf[js.Any])
    
    inline def setPlaylistName(value: String): Self = StObject.set(x, "playlistName", value.asInstanceOf[js.Any])
    
    inline def setPrepareToPlay(value: () => js.Promise[Unit]): Self = StObject.set(x, "prepareToPlay", js.Any.fromFunction0(value))
    
    inline def setPreviewURL(value: String): Self = StObject.set(x, "previewURL", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: js.Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrackNumber(value: Double): Self = StObject.set(x, "trackNumber", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
