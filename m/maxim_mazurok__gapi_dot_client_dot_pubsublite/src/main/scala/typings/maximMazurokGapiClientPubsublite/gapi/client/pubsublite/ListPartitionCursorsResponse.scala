package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartitionCursorsResponse extends js.Object {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The partition cursors from this request. */
  var partitionCursors: js.UndefOr[js.Array[PartitionCursor]] = js.native
}
object ListPartitionCursorsResponse {
  
  @scala.inline
  def apply(): ListPartitionCursorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartitionCursorsResponse]
  }
  
  @scala.inline
  implicit class ListPartitionCursorsResponseOps[Self <: ListPartitionCursorsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPartitionCursorsVarargs(value: PartitionCursor*): Self = this.set("partitionCursors", js.Array(value :_*))
    
    @scala.inline
    def setPartitionCursors(value: js.Array[PartitionCursor]): Self = this.set("partitionCursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionCursors: Self = this.set("partitionCursors", js.undefined)
  }
}
