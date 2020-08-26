package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItem extends js.Object {
  var absolutePosition: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var creationTimestamp: js.UndefOr[String] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedTimestamp: js.UndefOr[String] = js.native
  var playlistId: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var track: js.UndefOr[PlaylistTrack] = js.native
  var trackId: js.UndefOr[String] = js.native
}

object PlaylistItem {
  @scala.inline
  def apply(): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItem]
  }
  @scala.inline
  implicit class PlaylistItemOps[Self <: PlaylistItem] (val x: Self) extends AnyVal {
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
    def setAbsolutePosition(value: String): Self = this.set("absolutePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePosition: Self = this.set("absolutePosition", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
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
    def setPlaylistId(value: String): Self = this.set("playlistId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylistId: Self = this.set("playlistId", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTrack(value: PlaylistTrack): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setTrackId(value: String): Self = this.set("trackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackId: Self = this.set("trackId", js.undefined)
  }
  
}

