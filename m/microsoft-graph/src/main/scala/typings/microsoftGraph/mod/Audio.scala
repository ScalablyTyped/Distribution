package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  // The title of the album for this audio file.
  var album: js.UndefOr[String] = js.undefined
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[String] = js.undefined
  // The performing artist for the audio file.
  var artist: js.UndefOr[String] = js.undefined
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[Double] = js.undefined
  // The name of the composer of the audio file.
  var composers: js.UndefOr[String] = js.undefined
  // Copyright information for the audio file.
  var copyright: js.UndefOr[String] = js.undefined
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[Double] = js.undefined
  // The total number of discs in this album.
  var discCount: js.UndefOr[Double] = js.undefined
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[Double] = js.undefined
  // The genre of this audio file.
  var genre: js.UndefOr[String] = js.undefined
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[Boolean] = js.undefined
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[Boolean] = js.undefined
  // The title of the audio file.
  var title: js.UndefOr[String] = js.undefined
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[Double] = js.undefined
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[Double] = js.undefined
  // The year the audio file was recorded.
  var year: js.UndefOr[Double] = js.undefined
}

object Audio {
  @scala.inline
  def apply(
    album: String = null,
    albumArtist: String = null,
    artist: String = null,
    bitrate: js.UndefOr[Double] = js.undefined,
    composers: String = null,
    copyright: String = null,
    disc: js.UndefOr[Double] = js.undefined,
    discCount: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    genre: String = null,
    hasDrm: js.UndefOr[Boolean] = js.undefined,
    isVariableBitrate: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    track: js.UndefOr[Double] = js.undefined,
    trackCount: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): Audio = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (composers != null) __obj.updateDynamic("composers")(composers.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(disc)) __obj.updateDynamic("disc")(disc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(discCount)) __obj.updateDynamic("discCount")(discCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDrm)) __obj.updateDynamic("hasDrm")(hasDrm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVariableBitrate)) __obj.updateDynamic("isVariableBitrate")(isVariableBitrate.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackCount)) __obj.updateDynamic("trackCount")(trackCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

