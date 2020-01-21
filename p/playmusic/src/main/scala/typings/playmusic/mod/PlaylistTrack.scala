package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistTrack extends js.Object {
  var album: js.UndefOr[String] = js.undefined
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var albumArtist: js.UndefOr[String] = js.undefined
  var albumAvailableForPurchase: js.UndefOr[Boolean] = js.undefined
  var albumId: js.UndefOr[String] = js.undefined
  var artist: js.UndefOr[String] = js.undefined
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var artistId: js.UndefOr[js.Array[String]] = js.undefined
  var composer: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var discNumber: js.UndefOr[Double] = js.undefined
  var durationMillis: js.UndefOr[String] = js.undefined
  var estimatedSize: js.UndefOr[String] = js.undefined
  var genre: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nid: js.UndefOr[String] = js.undefined
  var playCount: js.UndefOr[Double] = js.undefined
  var storeId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trackAvailableForPurchase: js.UndefOr[Boolean] = js.undefined
  var trackAvailableForSubscription: js.UndefOr[Boolean] = js.undefined
  var trackNumber: js.UndefOr[Double] = js.undefined
  var trackType: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[Double] = js.undefined
}

object PlaylistTrack {
  @scala.inline
  def apply(
    album: String = null,
    albumArtRef: js.Array[ArtRef] = null,
    albumArtist: String = null,
    albumAvailableForPurchase: js.UndefOr[Boolean] = js.undefined,
    albumId: String = null,
    artist: String = null,
    artistArtRef: js.Array[ArtRef] = null,
    artistId: js.Array[String] = null,
    composer: String = null,
    contentType: String = null,
    discNumber: Int | Double = null,
    durationMillis: String = null,
    estimatedSize: String = null,
    genre: String = null,
    kind: String = null,
    nid: String = null,
    playCount: Int | Double = null,
    storeId: String = null,
    title: String = null,
    trackAvailableForPurchase: js.UndefOr[Boolean] = js.undefined,
    trackAvailableForSubscription: js.UndefOr[Boolean] = js.undefined,
    trackNumber: Int | Double = null,
    trackType: String = null,
    year: Int | Double = null
  ): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (albumArtRef != null) __obj.updateDynamic("albumArtRef")(albumArtRef.asInstanceOf[js.Any])
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist.asInstanceOf[js.Any])
    if (!js.isUndefined(albumAvailableForPurchase)) __obj.updateDynamic("albumAvailableForPurchase")(albumAvailableForPurchase.asInstanceOf[js.Any])
    if (albumId != null) __obj.updateDynamic("albumId")(albumId.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (artistArtRef != null) __obj.updateDynamic("artistArtRef")(artistArtRef.asInstanceOf[js.Any])
    if (artistId != null) __obj.updateDynamic("artistId")(artistId.asInstanceOf[js.Any])
    if (composer != null) __obj.updateDynamic("composer")(composer.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (discNumber != null) __obj.updateDynamic("discNumber")(discNumber.asInstanceOf[js.Any])
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (estimatedSize != null) __obj.updateDynamic("estimatedSize")(estimatedSize.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nid != null) __obj.updateDynamic("nid")(nid.asInstanceOf[js.Any])
    if (playCount != null) __obj.updateDynamic("playCount")(playCount.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(trackAvailableForPurchase)) __obj.updateDynamic("trackAvailableForPurchase")(trackAvailableForPurchase.asInstanceOf[js.Any])
    if (!js.isUndefined(trackAvailableForSubscription)) __obj.updateDynamic("trackAvailableForSubscription")(trackAvailableForSubscription.asInstanceOf[js.Any])
    if (trackNumber != null) __obj.updateDynamic("trackNumber")(trackNumber.asInstanceOf[js.Any])
    if (trackType != null) __obj.updateDynamic("trackType")(trackType.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistTrack]
  }
}

