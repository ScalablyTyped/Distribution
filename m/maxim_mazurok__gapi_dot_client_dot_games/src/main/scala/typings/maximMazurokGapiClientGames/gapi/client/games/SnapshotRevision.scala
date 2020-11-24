package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotRevision extends js.Object {
  
  /** Reference to the game provided blob for this revision. */
  var blob: js.UndefOr[SnapshotDataResource] = js.native
  
  /** Reference to the cover image for this revision. */
  var coverImage: js.UndefOr[SnapshotCoverImageResource] = js.native
  
  /** Output only. A server generated identifier of the snapshot revision. */
  var id: js.UndefOr[String] = js.native
  
  /** Metadata for this snapshot revision. */
  var metadata: js.UndefOr[SnapshotMetadata] = js.native
}
object SnapshotRevision {
  
  @scala.inline
  def apply(): SnapshotRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotRevision]
  }
  
  @scala.inline
  implicit class SnapshotRevisionOps[Self <: SnapshotRevision] (val x: Self) extends AnyVal {
    
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
    def setBlob(value: SnapshotDataResource): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    
    @scala.inline
    def setCoverImage(value: SnapshotCoverImageResource): Self = this.set("coverImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverImage: Self = this.set("coverImage", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
