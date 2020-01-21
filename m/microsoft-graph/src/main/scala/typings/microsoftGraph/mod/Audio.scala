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
    bitrate: Int | Double = null,
    composers: String = null,
    copyright: String = null,
    disc: Int | Double = null,
    discCount: Int | Double = null,
    duration: Int | Double = null,
    genre: String = null,
    hasDrm: js.UndefOr[Boolean] = js.undefined,
    isVariableBitrate: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    track: Int | Double = null,
    trackCount: Int | Double = null,
    year: Int | Double = null
  ): Audio = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (composers != null) __obj.updateDynamic("composers")(composers.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (disc != null) __obj.updateDynamic("disc")(disc.asInstanceOf[js.Any])
    if (discCount != null) __obj.updateDynamic("discCount")(discCount.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDrm)) __obj.updateDynamic("hasDrm")(hasDrm.asInstanceOf[js.Any])
    if (!js.isUndefined(isVariableBitrate)) __obj.updateDynamic("isVariableBitrate")(isVariableBitrate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (trackCount != null) __obj.updateDynamic("trackCount")(trackCount.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

