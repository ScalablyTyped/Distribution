package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends js.Object {
  
  // The title of the album for this audio file.
  var album: js.UndefOr[NullableOption[String]] = js.native
  
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[NullableOption[String]] = js.native
  
  // The performing artist for the audio file.
  var artist: js.UndefOr[NullableOption[String]] = js.native
  
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[NullableOption[Double]] = js.native
  
  // The name of the composer of the audio file.
  var composers: js.UndefOr[NullableOption[String]] = js.native
  
  // Copyright information for the audio file.
  var copyright: js.UndefOr[NullableOption[String]] = js.native
  
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[NullableOption[Double]] = js.native
  
  // The total number of discs in this album.
  var discCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[NullableOption[Double]] = js.native
  
  // The genre of this audio file.
  var genre: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The title of the audio file.
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[NullableOption[Double]] = js.native
  
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The year the audio file was recorded.
  var year: js.UndefOr[NullableOption[Double]] = js.native
}
object Audio {
  
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlbum(value: NullableOption[String]): Self = this.set("album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    
    @scala.inline
    def setAlbumNull: Self = this.set("album", null)
    
    @scala.inline
    def setAlbumArtist(value: NullableOption[String]): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumArtist: Self = this.set("albumArtist", js.undefined)
    
    @scala.inline
    def setAlbumArtistNull: Self = this.set("albumArtist", null)
    
    @scala.inline
    def setArtist(value: NullableOption[String]): Self = this.set("artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    
    @scala.inline
    def setArtistNull: Self = this.set("artist", null)
    
    @scala.inline
    def setBitrate(value: NullableOption[Double]): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    
    @scala.inline
    def setBitrateNull: Self = this.set("bitrate", null)
    
    @scala.inline
    def setComposers(value: NullableOption[String]): Self = this.set("composers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposers: Self = this.set("composers", js.undefined)
    
    @scala.inline
    def setComposersNull: Self = this.set("composers", null)
    
    @scala.inline
    def setCopyright(value: NullableOption[String]): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCopyrightNull: Self = this.set("copyright", null)
    
    @scala.inline
    def setDisc(value: NullableOption[Double]): Self = this.set("disc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisc: Self = this.set("disc", js.undefined)
    
    @scala.inline
    def setDiscNull: Self = this.set("disc", null)
    
    @scala.inline
    def setDiscCount(value: NullableOption[Double]): Self = this.set("discCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscCount: Self = this.set("discCount", js.undefined)
    
    @scala.inline
    def setDiscCountNull: Self = this.set("discCount", null)
    
    @scala.inline
    def setDuration(value: NullableOption[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    
    @scala.inline
    def setGenre(value: NullableOption[String]): Self = this.set("genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    
    @scala.inline
    def setGenreNull: Self = this.set("genre", null)
    
    @scala.inline
    def setHasDrm(value: NullableOption[Boolean]): Self = this.set("hasDrm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDrm: Self = this.set("hasDrm", js.undefined)
    
    @scala.inline
    def setHasDrmNull: Self = this.set("hasDrm", null)
    
    @scala.inline
    def setIsVariableBitrate(value: NullableOption[Boolean]): Self = this.set("isVariableBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVariableBitrate: Self = this.set("isVariableBitrate", js.undefined)
    
    @scala.inline
    def setIsVariableBitrateNull: Self = this.set("isVariableBitrate", null)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setTrack(value: NullableOption[Double]): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setTrackNull: Self = this.set("track", null)
    
    @scala.inline
    def setTrackCount(value: NullableOption[Double]): Self = this.set("trackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackCount: Self = this.set("trackCount", js.undefined)
    
    @scala.inline
    def setTrackCountNull: Self = this.set("trackCount", null)
    
    @scala.inline
    def setYear(value: NullableOption[Double]): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    
    @scala.inline
    def setYearNull: Self = this.set("year", null)
  }
}
