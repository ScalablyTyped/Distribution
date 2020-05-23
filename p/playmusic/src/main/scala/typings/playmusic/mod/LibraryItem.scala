package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryItem extends js.Object {
  var album: js.UndefOr[String] = js.undefined
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var albumArtist: js.UndefOr[String] = js.undefined
  var artist: js.UndefOr[String] = js.undefined
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var artistId: js.UndefOr[js.Array[String]] = js.undefined
  var beatsPerMinute: js.UndefOr[Double] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var composer: js.UndefOr[String] = js.undefined
  var creationTimestamp: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var discNumber: js.UndefOr[Double] = js.undefined
  var durationMillis: js.UndefOr[String] = js.undefined
  var estimatedSize: js.UndefOr[String] = js.undefined
  var genre: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  var nid: js.UndefOr[String] = js.undefined
  var playCount: js.UndefOr[Double] = js.undefined
  var rating: js.UndefOr[String] = js.undefined
  var recentTimestamp: js.UndefOr[String] = js.undefined
  var storeId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var totalDiscCount: js.UndefOr[Double] = js.undefined
  var totalTrackCount: js.UndefOr[Double] = js.undefined
  var trackNumber: js.UndefOr[Double] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object LibraryItem {
  @scala.inline
  def apply(
    album: String = null,
    albumArtRef: js.Array[ArtRef] = null,
    albumArtist: String = null,
    artist: String = null,
    artistArtRef: js.Array[ArtRef] = null,
    artistId: js.Array[String] = null,
    beatsPerMinute: js.UndefOr[Double] = js.undefined,
    clientId: String = null,
    comment: String = null,
    composer: String = null,
    creationTimestamp: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    discNumber: js.UndefOr[Double] = js.undefined,
    durationMillis: String = null,
    estimatedSize: String = null,
    genre: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTimestamp: String = null,
    nid: String = null,
    playCount: js.UndefOr[Double] = js.undefined,
    rating: String = null,
    recentTimestamp: String = null,
    storeId: String = null,
    title: String = null,
    totalDiscCount: js.UndefOr[Double] = js.undefined,
    totalTrackCount: js.UndefOr[Double] = js.undefined,
    trackNumber: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): LibraryItem = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (albumArtRef != null) __obj.updateDynamic("albumArtRef")(albumArtRef.asInstanceOf[js.Any])
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (artistArtRef != null) __obj.updateDynamic("artistArtRef")(artistArtRef.asInstanceOf[js.Any])
    if (artistId != null) __obj.updateDynamic("artistId")(artistId.asInstanceOf[js.Any])
    if (!js.isUndefined(beatsPerMinute)) __obj.updateDynamic("beatsPerMinute")(beatsPerMinute.get.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (composer != null) __obj.updateDynamic("composer")(composer.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(discNumber)) __obj.updateDynamic("discNumber")(discNumber.get.asInstanceOf[js.Any])
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (estimatedSize != null) __obj.updateDynamic("estimatedSize")(estimatedSize.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp.asInstanceOf[js.Any])
    if (nid != null) __obj.updateDynamic("nid")(nid.asInstanceOf[js.Any])
    if (!js.isUndefined(playCount)) __obj.updateDynamic("playCount")(playCount.get.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (recentTimestamp != null) __obj.updateDynamic("recentTimestamp")(recentTimestamp.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(totalDiscCount)) __obj.updateDynamic("totalDiscCount")(totalDiscCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalTrackCount)) __obj.updateDynamic("totalTrackCount")(totalTrackCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackNumber)) __obj.updateDynamic("trackNumber")(trackNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryItem]
  }
}

