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
  
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: NullableOption[String]): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtist(value: NullableOption[String]): Self = StObject.set(x, "albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumArtistNull: Self = StObject.set(x, "albumArtist", null)
    
    @scala.inline
    def setAlbumArtistUndefined: Self = StObject.set(x, "albumArtist", js.undefined)
    
    @scala.inline
    def setAlbumNull: Self = StObject.set(x, "album", null)
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setArtist(value: NullableOption[String]): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistNull: Self = StObject.set(x, "artist", null)
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setBitrate(value: NullableOption[Double]): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateNull: Self = StObject.set(x, "bitrate", null)
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    @scala.inline
    def setComposers(value: NullableOption[String]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposersNull: Self = StObject.set(x, "composers", null)
    
    @scala.inline
    def setComposersUndefined: Self = StObject.set(x, "composers", js.undefined)
    
    @scala.inline
    def setCopyright(value: NullableOption[String]): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDisc(value: NullableOption[Double]): Self = StObject.set(x, "disc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscCount(value: NullableOption[Double]): Self = StObject.set(x, "discCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscCountNull: Self = StObject.set(x, "discCount", null)
    
    @scala.inline
    def setDiscCountUndefined: Self = StObject.set(x, "discCount", js.undefined)
    
    @scala.inline
    def setDiscNull: Self = StObject.set(x, "disc", null)
    
    @scala.inline
    def setDiscUndefined: Self = StObject.set(x, "disc", js.undefined)
    
    @scala.inline
    def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setGenre(value: NullableOption[String]): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreNull: Self = StObject.set(x, "genre", null)
    
    @scala.inline
    def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    @scala.inline
    def setHasDrm(value: NullableOption[Boolean]): Self = StObject.set(x, "hasDrm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDrmNull: Self = StObject.set(x, "hasDrm", null)
    
    @scala.inline
    def setHasDrmUndefined: Self = StObject.set(x, "hasDrm", js.undefined)
    
    @scala.inline
    def setIsVariableBitrate(value: NullableOption[Boolean]): Self = StObject.set(x, "isVariableBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVariableBitrateNull: Self = StObject.set(x, "isVariableBitrate", null)
    
    @scala.inline
    def setIsVariableBitrateUndefined: Self = StObject.set(x, "isVariableBitrate", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrack(value: NullableOption[Double]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackCount(value: NullableOption[Double]): Self = StObject.set(x, "trackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackCountNull: Self = StObject.set(x, "trackCount", null)
    
    @scala.inline
    def setTrackCountUndefined: Self = StObject.set(x, "trackCount", js.undefined)
    
    @scala.inline
    def setTrackNull: Self = StObject.set(x, "track", null)
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    @scala.inline
    def setYear(value: NullableOption[Double]): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearNull: Self = StObject.set(x, "year", null)
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
