package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryItem extends js.Object {
  var album: js.UndefOr[java.lang.String] = js.undefined
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var albumArtist: js.UndefOr[java.lang.String] = js.undefined
  var artist: js.UndefOr[java.lang.String] = js.undefined
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var artistId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var beatsPerMinute: js.UndefOr[scala.Double] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var composer: js.UndefOr[java.lang.String] = js.undefined
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var discNumber: js.UndefOr[scala.Double] = js.undefined
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  var estimatedSize: js.UndefOr[java.lang.String] = js.undefined
  var genre: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var nid: js.UndefOr[java.lang.String] = js.undefined
  var playCount: js.UndefOr[scala.Double] = js.undefined
  var rating: js.UndefOr[java.lang.String] = js.undefined
  var recentTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var totalDiscCount: js.UndefOr[scala.Double] = js.undefined
  var totalTrackCount: js.UndefOr[scala.Double] = js.undefined
  var trackNumber: js.UndefOr[scala.Double] = js.undefined
  var year: js.UndefOr[scala.Double] = js.undefined
}

object LibraryItem {
  @scala.inline
  def apply(
    album: java.lang.String = null,
    albumArtRef: js.Array[ArtRef] = null,
    albumArtist: java.lang.String = null,
    artist: java.lang.String = null,
    artistArtRef: js.Array[ArtRef] = null,
    artistId: js.Array[java.lang.String] = null,
    beatsPerMinute: scala.Int | scala.Double = null,
    clientId: java.lang.String = null,
    comment: java.lang.String = null,
    composer: java.lang.String = null,
    creationTimestamp: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    discNumber: scala.Int | scala.Double = null,
    durationMillis: java.lang.String = null,
    estimatedSize: java.lang.String = null,
    genre: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTimestamp: java.lang.String = null,
    nid: java.lang.String = null,
    playCount: scala.Int | scala.Double = null,
    rating: java.lang.String = null,
    recentTimestamp: java.lang.String = null,
    storeId: java.lang.String = null,
    title: java.lang.String = null,
    totalDiscCount: scala.Int | scala.Double = null,
    totalTrackCount: scala.Int | scala.Double = null,
    trackNumber: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null
  ): LibraryItem = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album)
    if (albumArtRef != null) __obj.updateDynamic("albumArtRef")(albumArtRef)
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (artistArtRef != null) __obj.updateDynamic("artistArtRef")(artistArtRef)
    if (artistId != null) __obj.updateDynamic("artistId")(artistId)
    if (beatsPerMinute != null) __obj.updateDynamic("beatsPerMinute")(beatsPerMinute.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (composer != null) __obj.updateDynamic("composer")(composer)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (discNumber != null) __obj.updateDynamic("discNumber")(discNumber.asInstanceOf[js.Any])
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (estimatedSize != null) __obj.updateDynamic("estimatedSize")(estimatedSize)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp)
    if (nid != null) __obj.updateDynamic("nid")(nid)
    if (playCount != null) __obj.updateDynamic("playCount")(playCount.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating)
    if (recentTimestamp != null) __obj.updateDynamic("recentTimestamp")(recentTimestamp)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (totalDiscCount != null) __obj.updateDynamic("totalDiscCount")(totalDiscCount.asInstanceOf[js.Any])
    if (totalTrackCount != null) __obj.updateDynamic("totalTrackCount")(totalTrackCount.asInstanceOf[js.Any])
    if (trackNumber != null) __obj.updateDynamic("trackNumber")(trackNumber.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryItem]
  }
}

