package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audio extends js.Object {
  // The title of the album for this audio file.
  var album: js.UndefOr[String] = js.native
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[String] = js.native
  // The performing artist for the audio file.
  var artist: js.UndefOr[String] = js.native
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[Double] = js.native
  // The name of the composer of the audio file.
  var composers: js.UndefOr[String] = js.native
  // Copyright information for the audio file.
  var copyright: js.UndefOr[String] = js.native
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[Double] = js.native
  // The total number of discs in this album.
  var discCount: js.UndefOr[Double] = js.native
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[Double] = js.native
  // The genre of this audio file.
  var genre: js.UndefOr[String] = js.native
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[Boolean] = js.native
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[Boolean] = js.native
  // The title of the audio file.
  var title: js.UndefOr[String] = js.native
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[Double] = js.native
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[Double] = js.native
  // The year the audio file was recorded.
  var year: js.UndefOr[Double] = js.native
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setAlbumArtist(value: String): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumArtist: Self = this.set("albumArtist", js.undefined)
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setComposers(value: String): Self = this.set("composers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposers: Self = this.set("composers", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDisc(value: Double): Self = this.set("disc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisc: Self = this.set("disc", js.undefined)
    @scala.inline
    def setDiscCount(value: Double): Self = this.set("discCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscCount: Self = this.set("discCount", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setHasDrm(value: Boolean): Self = this.set("hasDrm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDrm: Self = this.set("hasDrm", js.undefined)
    @scala.inline
    def setIsVariableBitrate(value: Boolean): Self = this.set("isVariableBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVariableBitrate: Self = this.set("isVariableBitrate", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrack(value: Double): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setTrackCount(value: Double): Self = this.set("trackCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackCount: Self = this.set("trackCount", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

