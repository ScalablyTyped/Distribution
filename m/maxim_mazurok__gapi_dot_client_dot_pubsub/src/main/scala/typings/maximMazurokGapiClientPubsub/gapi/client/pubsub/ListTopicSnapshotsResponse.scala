package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicSnapshotsResponse extends StObject {
  
  /** If not empty, indicates that there may be more snapshots that match the request; this value should be passed in a new `ListTopicSnapshotsRequest` to get more snapshots. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The names of the snapshots that match the request. */
  var snapshots: js.UndefOr[js.Array[String]] = js.undefined
}
object ListTopicSnapshotsResponse {
  
  inline def apply(): ListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicSnapshotsResponse]
  }
  
  extension [Self <: ListTopicSnapshotsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSnapshots(value: js.Array[String]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: String*): Self = StObject.set(x, "snapshots", js.Array(value*))
  }
}
