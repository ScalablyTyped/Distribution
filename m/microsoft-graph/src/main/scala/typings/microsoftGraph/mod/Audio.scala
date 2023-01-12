package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  // The title of the album for this audio file.
  var album: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The performing artist for the audio file.
  var artist: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The name of the composer of the audio file.
  var composers: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Copyright information for the audio file.
  var copyright: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The total number of discs in this album.
  var discCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The genre of this audio file.
  var genre: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The title of the audio file.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The year the audio file was recorded.
  var year: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Audio {
  
  inline def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    inline def setAlbum(value: NullableOption[String]): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtist(value: NullableOption[String]): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    inline def setAlbumArtistNull: Self = StObject.set(x, "albumArtist", null)
    
    inline def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    inline def setAlbumNull: Self = StObject.set(x, "album", null)
    
    inline def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    inline def setArtist(value: NullableOption[String]): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    inline def setArtistNull: Self = StObject.set(x, "artist", null)
    
    inline def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    inline def setBitrate(value: NullableOption[Double]): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateNull: Self = StObject.set(x, "bitrate", null)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setComposers(value: NullableOption[String]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
    
    inline def setComposersNull: Self = StObject.set(x, "composers", null)
    
    inline def setComposersUndefined: Self = StObject.set(x, "composers", js.undefined)
    
    inline def setCopyright(value: NullableOption[String]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDisc(value: NullableOption[Double]): Self = StObject.set(x, "disc", value.asInstanceOf[js.Any])
    
    inline def setDiscCount(value: NullableOption[Double]): Self = StObject.set(x, "discCount", value.asInstanceOf[js.Any])
    
    inline def setDiscCountNull: Self = StObject.set(x, "discCount", null)
    
    inline def setDiscCountUndefined: Self = StObject.set(x, "discCount", js.undefined)
    
    inline def setDiscNull: Self = StObject.set(x, "disc", null)
    
    inline def setDiscUndefined: Self = StObject.set(x, "disc", js.undefined)
    
    inline def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setGenre(value: NullableOption[String]): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setGenreNull: Self = StObject.set(x, "genre", null)
    
    inline def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    inline def setHasDrm(value: NullableOption[Boolean]): Self = StObject.set(x, "hasDrm", value.asInstanceOf[js.Any])
    
    inline def setHasDrmNull: Self = StObject.set(x, "hasDrm", null)
    
    inline def setHasDrmUndefined: Self = StObject.set(x, "hasDrm", js.undefined)
    
    inline def setIsVariableBitrate(value: NullableOption[Boolean]): Self = StObject.set(x, "isVariableBitrate", value.asInstanceOf[js.Any])
    
    inline def setIsVariableBitrateNull: Self = StObject.set(x, "isVariableBitrate", null)
    
    inline def setIsVariableBitrateUndefined: Self = StObject.set(x, "isVariableBitrate", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrack(value: NullableOption[Double]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackCount(value: NullableOption[Double]): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
    
    inline def setTrackCountNull: Self = StObject.set(x, "trackCount", null)
    
    inline def setTrackCountUndefined: Self = StObject.set(x, "trackCount", js.undefined)
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setYear(value: NullableOption[Double]): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearNull: Self = StObject.set(x, "year", null)
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
