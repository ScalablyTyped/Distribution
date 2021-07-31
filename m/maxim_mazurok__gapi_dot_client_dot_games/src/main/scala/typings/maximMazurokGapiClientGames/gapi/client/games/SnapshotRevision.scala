package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRevision extends StObject {
  
  /** Reference to the game provided blob for this revision. */
  var blob: js.UndefOr[SnapshotDataResource] = js.undefined
  
  /** Reference to the cover image for this revision. */
  var coverImage: js.UndefOr[SnapshotCoverImageResource] = js.undefined
  
  /** Output only. A server generated identifier of the snapshot revision. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Metadata for this snapshot revision. */
  var metadata: js.UndefOr[SnapshotMetadata] = js.undefined
}
object SnapshotRevision {
  
  @scala.inline
  def apply(): SnapshotRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotRevision]
  }
  
  @scala.inline
  implicit class SnapshotRevisionMutableBuilder[Self <: SnapshotRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlob(value: SnapshotDataResource): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setCoverImage(value: SnapshotCoverImageResource): Self = StObject.set(x, "coverImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverImageUndefined: Self = StObject.set(x, "coverImage", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
