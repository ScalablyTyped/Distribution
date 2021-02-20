package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicSnapshotsResponse extends StObject {
  
  /** If not empty, indicates that there may be more snapshots that match the request; this value should be passed in a new `ListTopicSnapshotsRequest` to get more snapshots. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The names of the snapshots that match the request. */
  var snapshots: js.UndefOr[js.Array[String]] = js.native
}
object ListTopicSnapshotsResponse {
  
  @scala.inline
  def apply(): ListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicSnapshotsResponse]
  }
  
  @scala.inline
  implicit class ListTopicSnapshotsResponseMutableBuilder[Self <: ListTopicSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[String]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: String*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
