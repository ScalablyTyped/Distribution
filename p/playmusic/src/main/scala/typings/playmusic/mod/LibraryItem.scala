package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibraryItem extends js.Object {
  var album: js.UndefOr[String] = js.native
  var albumArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var albumArtist: js.UndefOr[String] = js.native
  var artist: js.UndefOr[String] = js.native
  var artistArtRef: js.UndefOr[js.Array[ArtRef]] = js.native
  var artistId: js.UndefOr[js.Array[String]] = js.native
  var beatsPerMinute: js.UndefOr[Double] = js.native
  var clientId: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String] = js.native
  var composer: js.UndefOr[String] = js.native
  var creationTimestamp: js.UndefOr[String] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var discNumber: js.UndefOr[Double] = js.native
  var durationMillis: js.UndefOr[String] = js.native
  var estimatedSize: js.UndefOr[String] = js.native
  var genre: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedTimestamp: js.UndefOr[String] = js.native
  var nid: js.UndefOr[String] = js.native
  var playCount: js.UndefOr[Double] = js.native
  var rating: js.UndefOr[String] = js.native
  var recentTimestamp: js.UndefOr[String] = js.native
  var storeId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var totalDiscCount: js.UndefOr[Double] = js.native
  var totalTrackCount: js.UndefOr[Double] = js.native
  var trackNumber: js.UndefOr[Double] = js.native
  var year: js.UndefOr[Double] = js.native
}

object LibraryItem {
  @scala.inline
  def apply(): LibraryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryItem]
  }
  @scala.inline
  implicit class LibraryItemOps[Self <: LibraryItem] (val x: Self) extends AnyVal {
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
    def setBeatsPerMinute(value: Double): Self = this.set("beatsPerMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeatsPerMinute: Self = this.set("beatsPerMinute", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setComposer(value: String): Self = this.set("composer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposer: Self = this.set("composer", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedTimestamp(value: String): Self = this.set("lastModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("lastModifiedTimestamp", js.undefined)
    @scala.inline
    def setNid(value: String): Self = this.set("nid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNid: Self = this.set("nid", js.undefined)
    @scala.inline
    def setPlayCount(value: Double): Self = this.set("playCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayCount: Self = this.set("playCount", js.undefined)
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
    @scala.inline
    def setRecentTimestamp(value: String): Self = this.set("recentTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecentTimestamp: Self = this.set("recentTimestamp", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotalDiscCount(value: Double): Self = this.set("totalDiscCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDiscCount: Self = this.set("totalDiscCount", js.undefined)
    @scala.inline
    def setTotalTrackCount(value: Double): Self = this.set("totalTrackCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalTrackCount: Self = this.set("totalTrackCount", js.undefined)
    @scala.inline
    def setTrackNumber(value: Double): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackNumber: Self = this.set("trackNumber", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

