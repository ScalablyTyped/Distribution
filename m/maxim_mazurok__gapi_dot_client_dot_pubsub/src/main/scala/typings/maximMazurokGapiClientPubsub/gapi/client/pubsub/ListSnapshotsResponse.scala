package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotsResponse extends StObject {
  
  /** If not empty, indicates that there may be more snapshot that match the request; this value should be passed in a new `ListSnapshotsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The resulting snapshots. */
  var snapshots: js.UndefOr[js.Array[Snapshot]] = js.native
}
object ListSnapshotsResponse {
  
  @scala.inline
  def apply(): ListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsResponse]
  }
  
  @scala.inline
  implicit class ListSnapshotsResponseMutableBuilder[Self <: ListSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[Snapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
