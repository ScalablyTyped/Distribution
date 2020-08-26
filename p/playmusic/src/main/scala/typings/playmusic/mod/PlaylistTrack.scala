package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistTrack extends js.Object {
  var album: js.UndefOr[String] = js.native
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var albumArtist: js.UndefOr[String] = js.native
  var albumAvailableForPurchase: js.UndefOr[Boolean] = js.native
  var albumId: js.UndefOr[String] = js.native
  var artist: js.UndefOr[String] = js.native
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var artistId: js.UndefOr[js.Array[String]] = js.native
  var composer: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var discNumber: js.UndefOr[Double] = js.native
  var durationMillis: js.UndefOr[String] = js.native
  var estimatedSize: js.UndefOr[String] = js.native
  var genre: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var nid: js.UndefOr[String] = js.native
  var playCount: js.UndefOr[Double] = js.native
  var storeId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var trackAvailableForPurchase: js.UndefOr[Boolean] = js.native
  var trackAvailableForSubscription: js.UndefOr[Boolean] = js.native
  var trackNumber: js.UndefOr[Double] = js.native
  var trackType: js.UndefOr[String] = js.native
  var year: js.UndefOr[Double] = js.native
}

object PlaylistTrack {
  @scala.inline
  def apply(): PlaylistTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistTrack]
  }
  @scala.inline
  implicit class PlaylistTrackOps[Self <: PlaylistTrack] (val x: Self) extends AnyVal {
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
    def setAlbumArtRefVarargs(value: ArtRef*): Self = this.set("albumArtRef", js.Array(value :_*))
    @scala.inline
    def setAlbumArtRef(value: js.Array[ArtRef]): Self = this.set("albumArtRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumArtRef: Self = this.set("albumArtRef", js.undefined)
    @scala.inline
    def setAlbumArtist(value: String): Self = this.set("albumArtist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumArtist: Self = this.set("albumArtist", js.undefined)
    @scala.inline
    def setAlbumAvailableForPurchase(value: Boolean): Self = this.set("albumAvailableForPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumAvailableForPurchase: Self = this.set("albumAvailableForPurchase", js.undefined)
    @scala.inline
    def setAlbumId(value: String): Self = this.set("albumId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumId: Self = this.set("albumId", js.undefined)
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setArtistArtRefVarargs(value: ArtRef*): Self = this.set("artistArtRef", js.Array(value :_*))
    @scala.inline
    def setArtistArtRef(value: js.Array[ArtRef]): Self = this.set("artistArtRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtistArtRef: Self = this.set("artistArtRef", js.undefined)
    @scala.inline
    def setArtistIdVarargs(value: String*): Self = this.set("artistId", js.Array(value :_*))
    @scala.inline
    def setArtistId(value: js.Array[String]): Self = this.set("artistId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtistId: Self = this.set("artistId", js.undefined)
    @scala.inline
    def setComposer(value: String): Self = this.set("composer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposer: Self = this.set("composer", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setDiscNumber(value: Double): Self = this.set("discNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscNumber: Self = this.set("discNumber", js.undefined)
    @scala.inline
    def setDurationMillis(value: String): Self = this.set("durationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMillis: Self = this.set("durationMillis", js.undefined)
    @scala.inline
    def setEstimatedSize(value: String): Self = this.set("estimatedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSize: Self = this.set("estimatedSize", js.undefined)
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNid(value: String): Self = this.set("nid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNid: Self = this.set("nid", js.undefined)
    @scala.inline
    def setPlayCount(value: Double): Self = this.set("playCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayCount: Self = this.set("playCount", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrackAvailableForPurchase(value: Boolean): Self = this.set("trackAvailableForPurchase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackAvailableForPurchase: Self = this.set("trackAvailableForPurchase", js.undefined)
    @scala.inline
    def setTrackAvailableForSubscription(value: Boolean): Self = this.set("trackAvailableForSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackAvailableForSubscription: Self = this.set("trackAvailableForSubscription", js.undefined)
    @scala.inline
    def setTrackNumber(value: Double): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackNumber: Self = this.set("trackNumber", js.undefined)
    @scala.inline
    def setTrackType(value: String): Self = this.set("trackType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackType: Self = this.set("trackType", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

