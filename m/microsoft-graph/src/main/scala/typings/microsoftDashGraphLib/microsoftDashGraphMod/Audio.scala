package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  // The title of the album for this audio file.
  var album: js.UndefOr[java.lang.String] = js.undefined
  // The artist named on the album for the audio file.
  var albumArtist: js.UndefOr[java.lang.String] = js.undefined
  // The performing artist for the audio file.
  var artist: js.UndefOr[java.lang.String] = js.undefined
  // Bitrate expressed in kbps.
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  // The name of the composer of the audio file.
  var composers: js.UndefOr[java.lang.String] = js.undefined
  // Copyright information for the audio file.
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  // The number of the disc this audio file came from.
  var disc: js.UndefOr[scala.Double] = js.undefined
  // The total number of discs in this album.
  var discCount: js.UndefOr[scala.Double] = js.undefined
  // Duration of the audio file, expressed in milliseconds
  var duration: js.UndefOr[scala.Double] = js.undefined
  // The genre of this audio file.
  var genre: js.UndefOr[java.lang.String] = js.undefined
  // Indicates if the file is protected with digital rights management.
  var hasDrm: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates if the file is encoded with a variable bitrate.
  var isVariableBitrate: js.UndefOr[scala.Boolean] = js.undefined
  // The title of the audio file.
  var title: js.UndefOr[java.lang.String] = js.undefined
  // The number of the track on the original disc for this audio file.
  var track: js.UndefOr[scala.Double] = js.undefined
  // The total number of tracks on the original disc for this audio file.
  var trackCount: js.UndefOr[scala.Double] = js.undefined
  // The year the audio file was recorded.
  var year: js.UndefOr[scala.Double] = js.undefined
}

object Audio {
  @scala.inline
  def apply(
    album: java.lang.String = null,
    albumArtist: java.lang.String = null,
    artist: java.lang.String = null,
    bitrate: scala.Int | scala.Double = null,
    composers: java.lang.String = null,
    copyright: java.lang.String = null,
    disc: scala.Int | scala.Double = null,
    discCount: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    genre: java.lang.String = null,
    hasDrm: js.UndefOr[scala.Boolean] = js.undefined,
    isVariableBitrate: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    track: scala.Int | scala.Double = null,
    trackCount: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null
  ): Audio = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album)
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (composers != null) __obj.updateDynamic("composers")(composers)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (disc != null) __obj.updateDynamic("disc")(disc.asInstanceOf[js.Any])
    if (discCount != null) __obj.updateDynamic("discCount")(discCount.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (!js.isUndefined(hasDrm)) __obj.updateDynamic("hasDrm")(hasDrm)
    if (!js.isUndefined(isVariableBitrate)) __obj.updateDynamic("isVariableBitrate")(isVariableBitrate)
    if (title != null) __obj.updateDynamic("title")(title)
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (trackCount != null) __obj.updateDynamic("trackCount")(trackCount.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

