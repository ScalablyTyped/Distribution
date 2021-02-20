package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotListResponse extends StObject {
  
  /** The snapshots. */
  var items: js.UndefOr[js.Array[Snapshot]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#snapshotListResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Token corresponding to the next page of results. If there are no more results, the token is omitted. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SnapshotListResponse {
  
  @scala.inline
  def apply(): SnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotListResponse]
  }
  
  @scala.inline
  implicit class SnapshotListResponseMutableBuilder[Self <: SnapshotListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Snapshot]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Snapshot*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
