package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistTrack extends js.Object {
  var album: js.UndefOr[java.lang.String] = js.undefined
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var albumArtist: js.UndefOr[java.lang.String] = js.undefined
  var albumAvailableForPurchase: js.UndefOr[scala.Boolean] = js.undefined
  var albumId: js.UndefOr[java.lang.String] = js.undefined
  var artist: js.UndefOr[java.lang.String] = js.undefined
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.undefined
  var artistId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var composer: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var discNumber: js.UndefOr[scala.Double] = js.undefined
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  var estimatedSize: js.UndefOr[java.lang.String] = js.undefined
  var genre: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nid: js.UndefOr[java.lang.String] = js.undefined
  var playCount: js.UndefOr[scala.Double] = js.undefined
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trackAvailableForPurchase: js.UndefOr[scala.Boolean] = js.undefined
  var trackAvailableForSubscription: js.UndefOr[scala.Boolean] = js.undefined
  var trackNumber: js.UndefOr[scala.Double] = js.undefined
  var trackType: js.UndefOr[java.lang.String] = js.undefined
  var year: js.UndefOr[scala.Double] = js.undefined
}

object PlaylistTrack {
  @scala.inline
  def apply(
    album: java.lang.String = null,
    albumArtRef: js.Array[ArtRef] = null,
    albumArtist: java.lang.String = null,
    albumAvailableForPurchase: js.UndefOr[scala.Boolean] = js.undefined,
    albumId: java.lang.String = null,
    artist: java.lang.String = null,
    artistArtRef: js.Array[ArtRef] = null,
    artistId: js.Array[java.lang.String] = null,
    composer: java.lang.String = null,
    contentType: java.lang.String = null,
    discNumber: scala.Int | scala.Double = null,
    durationMillis: java.lang.String = null,
    estimatedSize: java.lang.String = null,
    genre: java.lang.String = null,
    kind: java.lang.String = null,
    nid: java.lang.String = null,
    playCount: scala.Int | scala.Double = null,
    storeId: java.lang.String = null,
    title: java.lang.String = null,
    trackAvailableForPurchase: js.UndefOr[scala.Boolean] = js.undefined,
    trackAvailableForSubscription: js.UndefOr[scala.Boolean] = js.undefined,
    trackNumber: scala.Int | scala.Double = null,
    trackType: java.lang.String = null,
    year: scala.Int | scala.Double = null
  ): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album)
    if (albumArtRef != null) __obj.updateDynamic("albumArtRef")(albumArtRef)
    if (albumArtist != null) __obj.updateDynamic("albumArtist")(albumArtist)
    if (!js.isUndefined(albumAvailableForPurchase)) __obj.updateDynamic("albumAvailableForPurchase")(albumAvailableForPurchase)
    if (albumId != null) __obj.updateDynamic("albumId")(albumId)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (artistArtRef != null) __obj.updateDynamic("artistArtRef")(artistArtRef)
    if (artistId != null) __obj.updateDynamic("artistId")(artistId)
    if (composer != null) __obj.updateDynamic("composer")(composer)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (discNumber != null) __obj.updateDynamic("discNumber")(discNumber.asInstanceOf[js.Any])
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (estimatedSize != null) __obj.updateDynamic("estimatedSize")(estimatedSize)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nid != null) __obj.updateDynamic("nid")(nid)
    if (playCount != null) __obj.updateDynamic("playCount")(playCount.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(trackAvailableForPurchase)) __obj.updateDynamic("trackAvailableForPurchase")(trackAvailableForPurchase)
    if (!js.isUndefined(trackAvailableForSubscription)) __obj.updateDynamic("trackAvailableForSubscription")(trackAvailableForSubscription)
    if (trackNumber != null) __obj.updateDynamic("trackNumber")(trackNumber.asInstanceOf[js.Any])
    if (trackType != null) __obj.updateDynamic("trackType")(trackType)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistTrack]
  }
}

